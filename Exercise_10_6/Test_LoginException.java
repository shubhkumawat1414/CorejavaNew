package Exercise_10_6;

public class Test_LoginException {

	public static void main(String[] args) {

		try {
			authenticate("shubham");
		} catch (LoginException exp) {
			System.out.println("Invalid Id/password");
		}
	}

	public static void authenticate(String login) throws LoginException {
		if (!"admin".equals(login)) {
			LoginException e = new LoginException();
			throw e;
		}
	}
}