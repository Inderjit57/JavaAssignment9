package Assignment9;

public class OnlineBanking extends BankingRules implements StandardProcess {

	private double interestRate;
	private double moneyInvest;
	private String userIDOnline;

	public double fundTransfer(boolean transferFund) {
		return 0;
	}

	public double deposit(double moneyDeposit) {
		// Service is avaliable in ATM
		return 0;
	}

	public double withdraw(double moneyWithdraw) {
		// Service is avaliable in ATM
		return 0;
	}

	@Override
	public double investment(double moneyInvest) {
		// invest and get annual interest
		this.moneyInvest = moneyInvest;
		return (moneyInvest * interestRate);
	}

	@Override
	String userIdentification() {
		// USER ID for online banking can be anything to login. and can be changed
		return userIDOnline;
	}

	public void setUserIDOnline(String userIDOnline) {
		this.userIDOnline = userIDOnline;
	}

}
