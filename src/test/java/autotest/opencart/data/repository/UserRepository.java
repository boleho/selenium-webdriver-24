package autotest.opencart.data.repository;
public final class UserRepository {
	private static volatile UserRepository instance = null;
	private UserRepository() {}
	public static UserRepository get() {
		if(instance == null) {
			synchronized (UserRepository.class) {
				if(instance == null) {
					instance = new UserRepository();
				}}}
		return instance;}
	public User correctUser() {
		return User.getUser()
				.setEmail("acc_first24@yopmail.com");
	}
	public User correctUser2() {
		return User.getUser()
				.setEmail("acc_second24@yopmail.com");
	}
	public User wrongEmail() {
		return User.getUser()
				.setEmail("wrongEmail");
	}
	public User emptyCreds() {
		return User.getUser()
				.setEmail("");
	}	
	public User dafault() {
		return wrongEmail();
	}
}