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

package pl.edu.icm.coansys.deduplication.document.keygenerator;

import org.testng.Assert;
import org.testng.annotations.Test;

import pl.edu.icm.coansys.deduplication.document.tool.MockDocumentMetadataFactory;
import pl.edu.icm.coansys.models.DocumentProtos;

public class OddsCharsKeyGeneratorTest {
    
    private OddsCharsKeyGenerator keyGen = new OddsCharsKeyGenerator();

    
    @Test
    public void testGenerateKey() {
        DocumentProtos.DocumentMetadata doc = MockDocumentMetadataFactory.createDocumentMetadata("A comparison of associated dsd sd");
        
        Assert.assertEquals("cmaio", keyGen.generateKey(doc, 0));
        Assert.assertEquals("cmaioascae", keyGen.generateKey(doc, 1));
        Assert.assertEquals("cmaioascaeddd", keyGen.generateKey(doc, 2));
    }
}
