/******************************************************************************* 
 * Copyright (c) 2011 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/
package com.openshift.internal.restclient.http;

/**
 * @author André Dietisheim
 */
public class HttpClientException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private int code = -1;

	public  HttpClientException(String message, Throwable cause) {
		super(message, cause);
	}

	public  HttpClientException(String message, Throwable cause, int code) {
		super(message, cause);
		this.code  = code;
	}

	public HttpClientException(String message) {
		super(message);
	}

	public HttpClientException(Throwable cause) {
		super(cause);
	}
	
	public int getResponseCode() {
		return code;
	}

}
