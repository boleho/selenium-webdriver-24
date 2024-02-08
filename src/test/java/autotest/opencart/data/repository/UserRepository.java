

package autotest.opencart.data.repository;

public final class UserRepository {
	private static volatile UserRepository instance = null;
	private UserRepository() {
	}
	public static UserRepository get() {
		if(instance == null) {
			synchronized (UserRepository.class) {
				if(instance == null) {
					instance = new UserRepository();
				}
			}
		}
		return instance;
	}
	public IUser wrongCreds() {
		return User.getUser()
				.setEmail("wrongEmail")
				.build();
	}	
	public IUser wrongEmail() {
		return User.getUser()
				.setEmail("wrongEmail")
				.build();
	}
	public IUser emptyCreds() {
		return User.getUser()
				.setEmail("")
				.build();
	}	
	public IUser correctUser() {
		return User.getUser()
				.setEmail("acc_first24@yopmail.com")
				.build();
	}
	public IUser dafault() {
		return wrongCreds();
	}
}