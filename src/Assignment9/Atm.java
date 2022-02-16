package Assignment9;

public class Atm extends BankingRules implements StandardProcess {

	private double balance;
	private double balanceDeposit;
	private double balanceWithdraw;
	private String userIDAtm;
	public double checkingAcc;
	public double savingAcc;
	public boolean transferFund;

	@Override
	public double deposit(double moneyDeposit) {
		balanceDeposit = moneyDeposit;
		return (balance + balanceDeposit);
	}

	@Override
	public double withdraw(double moneyWithdraw) {
		balanceWithdraw = moneyWithdraw;
		return (balance - balanceWithdraw);
	}

	@Override
	public String userIdentification() {
		// User ID for ATM is 8 digit CARD NUMBER
		return userIDAtm;
	}

	@Override
	public double fundTransfer(boolean transferFund) {
		this.transferFund = transferFund;
		if (this.transferFund == true) {
			
		}

		return 0;
	}

	public double investment(double moneyInvest) {	// service is avaliable on Online banking
		System.out.println("Investment service is only avaliable on Online Banking");
		return 0;
	}

}
