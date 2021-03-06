/*
 * Copyright 2011 by Graz University of Technology, Austria
 * The Austrian STORK Modules have been developed by the E-Government
 * Innovation Center EGIZ, a joint initiative of the Federal Chancellery
 * Austria and Graz University of Technology.
 *
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved by
 * the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 * http://www.osor.eu/eupl/
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and
 * limitations under the Licence.
 *
 * This product combines work with different licenses. See the "NOTICE" text
 * file for details on the various modules and licenses.
 * The "NOTICE" text file is part of the distribution. Any derivative works
 * that you distribute must include a readable copy of the "NOTICE" text file.
 */


package eu.stork.vidp.messages.stork.impl;

import org.opensaml.xml.XMLObject;
import org.opensaml.xml.io.BaseXMLObjectUnmarshaller;
import org.opensaml.xml.io.UnmarshallingException;

import eu.stork.vidp.messages.stork.SPAuthRequest;
import eu.stork.vidp.messages.stork.SPCertEnc;
import eu.stork.vidp.messages.stork.SPCertSig;
import eu.stork.vidp.messages.stork.SPID;
import eu.stork.vidp.messages.stork.SPInformation;

public class SPInformationUnmarshaller extends
		BaseXMLObjectUnmarshaller {
	
	@Override
	protected void processChildElement(XMLObject parentXMLObject,
			XMLObject childXMLObject) throws UnmarshallingException {
		SPInformation spInformation = (SPInformation) parentXMLObject;

        if (childXMLObject instanceof SPID) {
        	spInformation.setSPID((SPID) childXMLObject);        
        } else if (childXMLObject instanceof SPCertSig) {
        	spInformation.setSPCertSig((SPCertSig) childXMLObject);        
        } if (childXMLObject instanceof SPCertEnc) {
        	spInformation.setSPCertEnc((SPCertEnc) childXMLObject);        
        } if (childXMLObject instanceof SPAuthRequest) {
        	spInformation.setSPAuthRequest((SPAuthRequest) childXMLObject);        
        } else {
            super.processChildElement(parentXMLObject, childXMLObject);
        }
	}

	

}
