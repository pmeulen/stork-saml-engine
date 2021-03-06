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


package eu.stork.vidp.messages.saml.impl;

import org.opensaml.common.xml.SAMLConstants;
import org.opensaml.saml2.core.impl.ResponseImpl;

import eu.stork.mw.messages.saml.STORKAuthnRequest;
import eu.stork.mw.messages.saml.STORKResponse;

public class STORKResponseImpl extends ResponseImpl implements STORKResponse {
	
	private int qaaLevel;

	protected STORKResponseImpl(String namespaceURI, String elementLocalName,
			String namespacePrefix) {
		super(namespaceURI, elementLocalName, namespacePrefix);		
	}		
	
	

	public STORKResponseImpl() {
		super(SAMLConstants.SAML20P_NS, STORKResponse.DEFAULT_ELEMENT_LOCAL_NAME, SAMLConstants.SAML20P_PREFIX);		
	}


	public int getQAALevel() {
		return this.qaaLevel;
	}

	public void setQAALevel(int authLevel) {
		this.qaaLevel = authLevel;
		
	}

}
