/**
 * 
 */
package com.wildc.ucumari.comunication.framework.exception;

/**
 * @author cmontes
 *
 */
public class SessionException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4604451453403093825L;

	/**
	 * 
	 */
	public SessionException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public SessionException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public SessionException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public SessionException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

}
