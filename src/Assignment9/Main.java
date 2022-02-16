/*
		 *  Account Login - 3 attempts
		 *  if failed - break the loop to terminate
		 *  
		 *  if passed
		 *  Switch to choose ATM / Online banking
		 *  while In ATM - 
		 *  		Shows PERSON class details
		 *  		(Standard Process) Switch between DEPOSIT/ WITHDRAWAL/ FUN TRANSFER/ INVESTMENT / USER ID CHANGE OPTION
		 *  		(Banking Rules)get Withdrawal limit / no of transactions / option to change ATM PIN
		 *  		
		 *  while In Online Banking -
		 *  		Shows PERSON class details 
		 *  		(Standard Process) Switch between DEPOSIT/ WITHDRAWAL/ FUN TRANSFER/ INVESTMENT / USER ID CHANGE OPTION
		 *  		(Banking Rules)get Withdrawal limit / no of transactions / option to change online banking Password
		 *  
		 *  Able to continue or Exit the application
		 */
package Assignment9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String accountNumber;
		String password;
		String operation = "";
		int counter = 3;
		String performMoreAction;

		Person person = new Person();

		for (int i = 1; i < 3; i++) {
			AccountLogin accLogin = new AccountLogin();
			System.out.println("Enter Application login ID");
			accountNumber = sc.next();
			System.out.println("Enter password");
			password = sc.next();

			accLogin.getAccLogin(accountNumber, password);
			if (accLogin.isValid == true) {
				System.out.println("Which operation to perform: Atm / OnlineBanking");
				operation = sc.next();
				switch (operation) {
				case "Atm":
					System.out.println("Account Holder name: " + person.getAccountHolderName());
					System.out.println("Account  number: " + person.getBankAccountNo());
					System.out.println("Account  number: " + person.getBankAccountNo());
					System.out.println("Account  number: " + person.getAccountType());

				case "OnlineBanking":
					System.out.println("Account Holder name: " + person.getAccountHolderName());
					System.out.println("Account  number: " + person.getBankAccountNo());
					System.out.println("Account  number: " + person.getBankAccountNo());
					System.out.println("Account  number: " + person.getAccountType());
				}
			} else if (accLogin.isValid == false) {
				break;
			}

		}
	}
}
