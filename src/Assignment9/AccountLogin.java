package Assignment9;

public class AccountLogin {

	boolean isValid;
	private String validAccountNumber = "1234";
	private String validPassword = "12345";

	public AccountLogin() {
		System.out.println("Account Login");
	}

	public void getAccLogin(String accountNumber, String password) {
		if (accountNumber.equals(validAccountNumber) && password.equals(validPassword)) {
			isValid = true;
		} else {
			isValid = false;
		}
	}
}
