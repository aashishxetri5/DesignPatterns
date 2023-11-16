/**
 *
 */
package com.practice.Singleton;

import java.io.Serializable;

/**
 * @author asus
 */
public class Course implements Serializable {

	private static final long serialVersionUID = -2659787488015681408L;
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

	public Object readResolve() {
		return course;
	}

}
