package bankOperationAssignment;

import java.util.Scanner;

public class OnlineBanking extends BankOperation {

	Scanner sc = new Scanner(System.in);

	protected void changePinPassword(PersonalDetails customer) {
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

	@Override
	protected void depisiteCheq(double cheqAmount, PersonalDetails customer) {
		customer.setAccountBalance(customer.getAccountBalance() + cheqAmount);
	}

}
