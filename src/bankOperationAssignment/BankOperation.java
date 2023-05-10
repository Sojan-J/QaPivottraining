package bankOperationAssignment;

import java.util.*;

public abstract class BankOperation {

	

	Scanner sc = new Scanner(System.in);

	protected abstract void changePinPassword(PersonalDetails customer);

	protected boolean checkIfPinEnteredCorrect(PersonalDetails customer) {
		int enteredPin = 0;
		int count = 1;
		boolean flag = false;
		for (int i = 0; i < 3; i++) {
			System.out.println("Enrer your pin");
			enteredPin = sc.nextInt();

			if (customer.getAtmPin() == enteredPin) {
				flag = true;
				break;
			} else {
				count++;
				System.out.println("wrong pin");
			}
			if (count > 3) {
				System.out.println("Your pin is blocked");
				break;
			}
		}
		return flag;
	}

	protected boolean checkIfPassAndUserNameCorrect(PersonalDetails customer) {
		boolean flag = false;
		int count = 1;
		String enteredPassWord = null;
		String enteredUsername = null;
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter your username: ");
			enteredUsername = sc.next();
			System.out.println("Enter your password:");
			enteredPassWord = sc.next();
			if (customer.getUsername().equals(enteredUsername) && customer.getPassWord().equals(enteredPassWord)) {
				flag = true;
				break;
			} else {
				count++;
				System.out.println("WRONG USERNAME OR PASSWORD");
			}
			if (count > 3) {
				System.out.println("Plese contact customer service");
				break;
			}

		}
		return flag;
	}

	protected void withdrawCash(int withdrawAmount, PersonalDetails customer) {
		if ((customer.getAccountBalance() - withdrawAmount) >= 0) {
			customer.setAccountBalance(customer.getAccountBalance() - withdrawAmount);
		}else
			System.out.println("not enough balance");
	}

	protected void depositCash(double depositAmount,PersonalDetails customer) {
		customer.setAccountBalance(customer.getAccountBalance() + depositAmount);
	}

	protected void depisiteCheq(double cheqAmount,PersonalDetails customer) {
		int cheqFee = 2;
		customer.setAccountBalance((customer.getAccountBalance()+ cheqAmount) - cheqFee);
	}

	protected void viewBalance(PersonalDetails customer) {
		System.out.println("Customer Name : " + customer.getCustomerName());
		System.out.println(
				"Customer Account Number: " + "***********"
				+ customer.getCustomerAccountNo().substring(customer.getCustomerAccountNo().length() - 4));
		System.out.println("Current balance: " + customer.getAccountBalance());

	}

}
