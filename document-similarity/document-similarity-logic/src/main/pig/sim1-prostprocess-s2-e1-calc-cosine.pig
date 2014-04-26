--
-- This file is part of CoAnSys project.
-- Copyright (c) 2012-2013 ICM-UW
-- 
-- CoAnSys is free software: you can redistribute it and/or modify
-- it under the terms of the GNU Affero General Public License as published by
-- the Free Software Foundation, either version 3 of the License, or
-- (at your option) any later version.

-- CoAnSys is distributed in the hope that it will be useful,
-- but WITHOUT ANY WARRANTY; without even the implied warranty of
-- MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
-- GNU Affero General Public License for more details.
-- 
-- You should have received a copy of the GNU Affero General Public License
-- along with CoAnSys. If not, see <http://www.gnu.org/licenses/>.
--

%default parallel 10
%default tmpCompressionCodec gz
%default mapredChildJavaOpts -Xmx8000m

%default jars '*.jar'
%default commonJarsPath '../../../../document-similarity-workflow/target/oozie-wf/lib/$jars'

REGISTER '$commonJarsPath'

SET default_parallel $parallel
SET mapred.child.java.opts $mapredChildJavaOpts
SET pig.tmpfilecompression true
SET pig.tmpfilecompression.codec $tmpCompressionCodec
%DEFAULT ds_scheduler default
SET mapred.fairscheduler.pool $ds_scheduler
--SET pig.noSplitCombination true;
IMPORT 'macros.pig';

-------------------------------------------------------
-- business code section
-------------------------------------------------------
%default inputPathProto 'protos'
%default inputPathDocSimMajor 'docsim-major'
%default inputPathDocSimMinor 'docsim-minor'
%default outputPathRecalc 'output'
%default finalOutputPath 'outputF'

-- load docsim_minor
E1 = LOAD '$inputPathDocSimMinor'  as (docId: chararray, term: chararray, tfidf: double);
E1 = group E by docId;
E2 = foreach E1 generate group as k, E.(term,tfidf) as vector;
store E2 into '$outputPathRecalc/vectors';

E2x = load '$output/vectors' as (k:chararray,vector:{(term:chararray,tfidf:float)});
A2x = load '$outputPathRecalc/pairs-to-process' as (k1:chararray,k2:chararray);
F = join A2x by k1, E2x by k;
F1 = generate k1,vector as v1, k2;
F2 = join F1 by k2, E2x by k;
F3 = generate k1,v1,k2,vector as v2;

G = foreach F3 generate pl.edu.icm.coansys.similarity.documents.pig.udf.CosineSimilarity(*);
store G into '$outputPathRecalc/recalcSims1';
