/**
 *
 */
package com.practice.Builder;

/**
 * 
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		User user = new User.UserBuilder().setUserId(211812).setUsername("Aashish Katwal")
				.setUserEmail("aashish@mail.com").build();
		System.out.println(user);

	}

}
