package autotest.opencart.data.repository;
public final class UserRepository {
	private static volatile UserRepository instance = null;
	public static final String ACCOUNT1 = "acc_first24@yopmail.com";
	public static final String ACCOUNT2 = "acc_second24@yopmail.com";
	public static final String SUBJECT = "task webdriver";
	public static final String BODY = "le, it's a message to check";
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
				.setEmail(ACCOUNT1);
	}
	public User correctUser2() {
		return User.getUser()
				.setEmail(ACCOUNT2);
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