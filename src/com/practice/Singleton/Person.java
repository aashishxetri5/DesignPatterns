package com.practice.Singleton;

/**
 * @author asus
 */
public class Person {

	private static Person person = new Person();

	private Person() {
//		This prevents from breaking singleton pattern
//		if (person != null) {
//			throw new RuntimeException("You're trying to break singleton pattern.");
//		}
	}

	public static Person getPerson() {
		return person;
	}

}
