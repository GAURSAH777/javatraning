package com.cg.exception;
/**
 * 
 * @author Gauri
 *
 */
public class PasswordAndConfirmPasswordNotMatchException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
/**
 * 
 * @param message
 */
	public PasswordAndConfirmPasswordNotMatchException(final String message) {
		super(message);
	}

}
