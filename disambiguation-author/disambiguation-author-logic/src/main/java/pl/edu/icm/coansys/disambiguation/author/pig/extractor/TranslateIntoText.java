/*
 * This file is part of CoAnSys project.
 * Copyright (c) 2012-2015 ICM-UW
 *
 * CoAnSys is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * CoAnSys is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with CoAnSys. If not, see <http://www.gnu.org/licenses/>.
 */
package pl.edu.icm.coansys.disambiguation.author.pig.extractor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.hadoop.mapreduce.Counter;
import org.apache.pig.EvalFunc;
import org.apache.pig.data.DataBag;
import org.apache.pig.data.DataByteArray;
import org.apache.pig.data.DataType;
import org.apache.pig.data.DefaultDataBag;
import org.apache.pig.data.Tuple;
import org.apache.pig.data.TupleFactory;
import org.apache.pig.impl.logicalLayer.FrontendException;
import org.apache.pig.impl.logicalLayer.schema.Schema;
import org.apache.pig.tools.pigstats.PigStatusReporter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pl.edu.icm.coansys.commons.java.StackTraceExtractor;
import pl.edu.icm.coansys.disambiguation.author.features.extractors.DisambiguationExtractorFactory;
import pl.edu.icm.coansys.disambiguation.author.features.extractors.indicators.DisambiguationExtractor;
import pl.edu.icm.coansys.disambiguation.author.features.extractors.indicators.DisambiguationExtractorAuthor;
import pl.edu.icm.coansys.disambiguation.author.features.extractors.indicators.DisambiguationExtractorDocument;
import pl.edu.icm.coansys.disambiguation.features.FeatureInfo;
import pl.edu.icm.coansys.models.DocumentProtos.Author;
import pl.edu.icm.coansys.models.DocumentProtos.DocumentMetadata;
import pl.edu.icm.coansys.models.DocumentProtos.DocumentWrapper;

/**
 * 
 * @author pdendek
 */
public class TranslateIntoText extends EvalFunc<Tuple> {

	private static final Logger logger = LoggerFactory
			.getLogger(TranslateIntoText.class);

	@Override
	public Schema outputSchema(Schema p_input) {
		try {
			return Schema.generateNestedSchema(DataType.TUPLE, DataType.CHARARRAY);
		} catch (FrontendException e) {
			logger.error("Error in creating output schema:", e);
			throw new IllegalStateException(e);
		}
	}

	@Override
	public Tuple exec(Tuple input) throws IOException {

		if (input == null || input.size() == 0) {
			return null;
		}

		try {
			DataByteArray dba = (DataByteArray) input.get(0);

			DocumentWrapper dw = DocumentWrapper.parseFrom(dba.get());
			dba = null;

			// metadata
			DocumentMetadata dm = dw.getDocumentMetadata();
			return TupleFactory.getInstance().newTuple(dm.toString());

		} catch (Exception e) {
			logger.error("Error in processing input row:", e);
			throw new IOException("Caught exception processing input row:\n"
					+ StackTraceExtractor.getStackTrace(e));
		}
	}
}
