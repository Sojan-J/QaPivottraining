package bankOperationAssignment;

import java.util.Scanner;

public class OnlineBanking extends BankOperation {

	private double accountBalance = customer.getAccountBalance();
	Scanner sc = new Scanner(System.in);

	protected void changePinPassword() {
		String oldPassword = customer.getPassWord();
		String newPassWord = null;
		int count = 1;
		for (int i = 0; i < 3; i++) {
			System.out.println("Please enter new password:");
			newPassWord = sc.next();
			if (newPassWord.equalsIgnoreCase(oldPassword)) {
				System.out.println("password can not be same as old one");
			} else if (newPassWord.length() < 8) {
				System.out.println("password should have minimum 8 characters ");
			} else if (newPassWord.contains("@") || newPassWord.contains("$") || newPassWord.contains("&")) {
				customer.setPassWord(newPassWord);
				System.out.println("Your password successfully changed");
				break;
			} else
				System.out.println("password should contain these special characters @,$ and $");
			count++;
		}
		if (count > 3) {
			System.out.println("Please contact customer servive");
		}
	}

	protected void atmOnlineOperation() {
		String service = null;
		double deposit = 0;

		if (checkIfPassAndUserNameCorrect()) {
			System.out.println("View account -enter 1");
			System.out.println("Deposit cheq- enter 2");
			System.out.println("Change password-enter 3");
			service = sc.nextLine();
			switch (service) {
			case "1":
				viewBalance();
				break;
			case "2":
				System.out.println("enter cheq amount:");
				deposit = sc.nextDouble();
				depisiteCheq(deposit);
				System.out.println("your cheq is being deposited");
				viewBalance();
				break;
			case "3":
				changePinPassword();
				break;
			default:
				System.out.println("service not available");
				break;
			}

		} else
			System.out.println("incorrect user name or password");
	}

	@Override
	protected void depisiteCheq(double cheqAmount) {
		customer.setAccountBalance(accountBalance + cheqAmount);
	}

}
