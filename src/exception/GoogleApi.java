package exception;

public class GoogleApi {

	public static boolean authenticate(String email, String password) {

		if (!email.contains("@gmail.com")) {
			EmailException e = new EmailException();
			throw e;
		}
		return true;

	}
}
