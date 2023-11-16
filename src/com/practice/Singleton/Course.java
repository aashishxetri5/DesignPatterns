/**
 *
 */
package com.practice.Singleton;

import java.io.Serializable;

/**
 * @author asus
 */
public class Course implements Serializable	 {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9127137378256342428L;
	private static Course course;

	private Course() {

	}

	public static Course getCourse() {
		if (course == null) {
			synchronized (Course.class) {
				course = new Course();
			}
		}
		return course;
	}

}
