package autotest.opencart.data.repository;

interface IEmail {
	IBuildUser setEmail(String email);
}
interface IBuildUser {
	IUser build();
}
public class User implements IEmail, IBuildUser, IUser {
	private String email;

	private User() {
}
	public static IEmail getUser() {
		return new User();
	}
	public IBuildUser setEmail(String email) {
		this.email = email;
		return this;
	}
	public IUser build() {
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