package com.cg.exception;

/**
 * 
 * @author Aniket.
 *
 */
public class AlreadyEnrolledInCourseException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 * @param message
	 */

	public AlreadyEnrolledInCourseException(final String message) {
		super(message);
	}

}
