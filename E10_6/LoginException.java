package E10_6;

public class LoginException extends Exception {

	public LoginException() {
		super("User Not Found");
	}
}

class UserClass {
	LoginException e = new LoginException();
	{
		int val = 0;
		if (val < 1)
			try {
				throw e;
			} catch (LoginException e) {
				e.printStackTrace();
			}
	}
}