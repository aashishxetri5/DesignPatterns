/**
 *
 */
package com.practice.Builder;

/**
 * @author asus
 */
public class User {

	private final int userId;
	private final String username;
	private final String userEmail;

	private User(UserBuilder builder) {
		this.userId = builder.userId;
		this.username = builder.username;
		this.userEmail = builder.userEmail;
	}

	public int getUserId() {
		return userId;
	}

	public String getUsername() {
		return username;
	}

	public String getUserEmail() {
		return userEmail;
	}

	static class UserBuilder {
		private int userId;
		private String username;
		private String userEmail;

		public UserBuilder setUserId(int userId) {
			this.userId = userId;
			return this;
		}

		public UserBuilder setUsername(String username) {
			this.username = username;
			return this;
		}

		public UserBuilder setUserEmail(String userEmail) {
			this.userEmail = userEmail;
			return this;
		}

		public User build() {
			return new User(this);
		}

	}

	@Override
	public String toString() {
		return "User [userId=" + this.userId + ", username=" + this.username + ", userEmail=" + this.userEmail + "]";
	}

}
