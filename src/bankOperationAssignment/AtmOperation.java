package bankOperationAssignment;

import java.util.Scanner;

public class AtmOperation extends BankOperation {
	private double accountBalance = customer.getAccountBalance();

	@Override
	protected void depisiteCheq(double cheqAmount) {
		customer.setAccountBalance(accountBalance + cheqAmount);
	}

	protected void changePinPassword() {
		int currentPin = customer.getAtmPin();
		int newPin = 0;
		int count = 1;
		Scanner sc = new Scanner(System.in);
		if (checkIfPinEnteredCorrect()) {
			for (int i = 0; i < 3; i++) {
				System.out.println("please enter new pin");
				newPin = sc.nextInt();
				if (newPin == currentPin) {
					System.out.println("current pin can not be used as a new pin");
				} else if (Integer.toString(newPin).length() > 4 || Integer.toString(newPin).length() < 4) {
					System.out.println("Pin shpuld be four digits");
				} else {
					customer.setAtmPin(newPin);
					System.out.println("your pin is successfully changed");
					break;
				}
				count++;
			}
			if (count > 3) {
				System.out.println("please contact customer service");
			}
		}
	}

	protected void atmOnlineOperation() {
		String service = null;
		double deposit = 0;
		int withdraw = 0;
		Scanner sc = new Scanner(System.in);
		if (checkIfPinEnteredCorrect()) {
			System.out.println("select your service:");
			System.out.println("Deposit Cash-enter 1");
			System.out.println("Deposit Cheq-enter 2");
			System.out.println("Withdraw-enter 3");
			System.out.println("Balance-enter 4");
			System.out.println("Change pin-enter 5");
			service = sc.nextLine();
			switch (service) {
			case "1":
				System.out.println("enter deposite amount:");
				deposit = sc.nextDouble();
				depositCash(deposit);
				System.out.println("amount being deposited. ");
				viewBalance();
				break;
			case "2":
				System.out.println("Enter cheq amount:");
				deposit = sc.nextDouble();
				depisiteCheq(deposit);
				System.out.println("Cheq amount is being deposited");
				viewBalance();
				break;
			case "3":
				System.out.println("enter withdraw amount:");
				withdraw = sc.nextInt();
				withdrawCash(withdraw);
				System.out.println("amount " + withdraw + "is withdrawn from your account");
				viewBalance();
				break;
			case "4":
				viewBalance();
				break;
			case "5":
				changePinPassword();
				break;
			default:
				System.out.println("service not available");
				break;
			}
		} else
			System.out.println("Incorrect pin");
	}

}
