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

import org.opensaml.saml2.common.impl.ExtensionsImpl;

import eu.stork.vidp.messages.saml.STORKExtensions;
import eu.stork.vidp.messages.stork.AuthenticationAttributes;
import eu.stork.vidp.messages.stork.QualityAuthenticationAssuranceLevel;
import eu.stork.vidp.messages.stork.RequestedAttributes;

public class STORKExtensionsImpl extends ExtensionsImpl implements STORKExtensions {
	
	private QualityAuthenticationAssuranceLevel qaaLevel;
	
	private RequestedAttributes requestedAttributes;
	
	private AuthenticationAttributes authenticationAttributes;

	protected STORKExtensionsImpl(String namespaceURI, String elementLocalName,
			String namespacePrefix) {
		super(namespaceURI, elementLocalName, namespacePrefix);		
	}

	public AuthenticationAttributes getAuthenticationAttributes() {
		return authenticationAttributes;
	}

	public QualityAuthenticationAssuranceLevel getQAALevel() {
		return qaaLevel;
	}

	public RequestedAttributes getRequestedAttributes() {
		return requestedAttributes;
	}

	public void setAuthenticationAttributes(
			AuthenticationAttributes authenticationAttributes) {
		this.authenticationAttributes = authenticationAttributes;
	}

	public void setQAALevel(QualityAuthenticationAssuranceLevel authLevel) {
		this.qaaLevel = authLevel;
	}

	public void setRequestedAttributes(RequestedAttributes requestedAttributes) {
		this.requestedAttributes = requestedAttributes;
	}

	
}
