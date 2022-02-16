package Assignment9;

public abstract class BankingRules {

	abstract String userIdentification();

	private double dailyWithdrawLimit;
	private int noOfTransactionLimit;
	private int pin;

	public double getDailyWithdrawLimit() {
		return dailyWithdrawLimit;
	}

	public void setDailyWithdrawLimit(double dailyWithdrawLimit) {
		this.dailyWithdrawLimit = dailyWithdrawLimit;
	}

	public int getNoOfTransactionLimit() {
		return noOfTransactionLimit;
	}

	public void setNoOfTransactionLimit(int noOfTransactionLimit) {
		this.noOfTransactionLimit = noOfTransactionLimit;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public double fundTransfer(boolean transferFund) {
		// TODO Auto-generated method stub
		return 0;
	}

}
