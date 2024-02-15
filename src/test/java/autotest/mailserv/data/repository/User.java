package autotest.mailserv.data.repository;
public class User {
	private String email;
	private User() {}
	public static User getUser() {
		return new User();
	}
	public User setEmail(String email) {
		this.email = email;
		return this;
	}
	public String getEmail() {
		return email;
	}
	@Override
	public String toString() {
		return "User [email=" + email + "]";
	}
}