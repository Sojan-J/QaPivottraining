package bankOperationAssignment;

import java.util.Scanner;

public class BankOperationMain {
	public static void main(String[] args) {
		String operation;
		String service;
		int enteredPin;
		double deposit;
		int withdraw;
		String password;
		String username;

		BankOperation customer = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select your operation: online banking/ATM");
		operation = sc.nextLine();
		switch (operation) {
		case "ATM":
			customer = new AtmOperation();
			if (customer.checkIfPinEnteredCorrect()) {
				System.out.println("select your service:");
				System.out.println("Deposit cash");
				System.out.println("Deposit cheq");
				System.out.println("Withdraw");
				System.out.println("View the balance");
				// Scanner serv = new Scanner(System.in);
				service = sc.nextLine();
				switch (service) {
				case "Deposit cash":
					System.out.println("enter deposite amount:");
					deposit = sc.nextDouble();
					customer.depositCash(deposit);
					System.out.println("amount being deposited. ");
					customer.viewBalance();
					break;
				case "Deposit cheq":
					System.out.println("Enter cheq amount:");
					deposit = sc.nextDouble();
					customer.depisiteCheq(deposit);
					System.out.println("Cheq amount is being deposited");
					customer.viewBalance();
					break;
				case "Withdraw":
					System.out.println("enter withdraw amount:");
					withdraw = sc.nextInt();
					customer.withdrawCash(withdraw);
					System.out.println("amount " + withdraw + "is withdrawn from your account");
					customer.viewBalance();
					break;
				case "View the balance":
					customer.viewBalance();
					break;
				default:
					System.out.println("service not available");
					break;
				}
			} else
				System.out.println("Incorrect pin");
			break;
		case "online banking":
			customer = new OnlineBanking();

			if (customer.checkIfPassAndUserNameCorrect()) {
				System.out.println("View account");
				System.out.println("Deposit cheq");
				service = sc.nextLine();
				switch (service) {
				case "View account":
					customer.viewBalance();
					break;
				case "Deposit cheq":
					System.out.println("enter cheq amount:");
					deposit = sc.nextDouble();
					customer.depisiteCheq(deposit);
					System.out.println("your cheq is being deposited");
					customer.viewBalance();
				}

			} else
				System.out.println("incorrect user name or password");
			break;
		default:
			System.out.println("operation not available");
			break;
		}
	}
}
