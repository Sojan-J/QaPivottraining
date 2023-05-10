package bankOperationAssignment;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class BankOperationMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String operation = null;
		String service = null;
		double deposit = 0;
		int withdraw = 0;
		int i = 0;

		String currentCustomerName = null;
		PersonalDetails jackson = new PersonalDetails("Jackson", "1239063456", 4545, 6000.0, "JACKSON", "Jackson100");
		PersonalDetails sojan = new PersonalDetails("Sojan", "1239066754", 4545, 6000.0, "SOJAN", "Sojan100");
		PersonalDetails gopesh = new PersonalDetails("Gopesh", "1239061212", 4545, 6000.0, "GOPESH", "Gopesh100");
		PersonalDetails william = new PersonalDetails("William", "1239068967", 4545, 6000.0, "WILLIAM", "William100");
		PersonalDetails dilan = new PersonalDetails("Dilan", "12390636745", 4545, 6000.0, "DILAN", "Dilan100");
		PersonalDetails[] customerDetails = { jackson, sojan, gopesh, william, dilan };

		BankOperation customer = null;
		System.out.println("Enter the name of the customer");
		currentCustomerName = sc.next();

		for (i = 0; i < customerDetails.length; i++) {
			if (customerDetails[i].getCustomerName().equalsIgnoreCase(currentCustomerName)) {
				break;
			}
		}
		System.out.println("Please select your operation: online banking/ATM");
		sc.nextLine();
		operation = sc.nextLine();
		switch (operation) {
		case "ATM":
			customer = new AtmOperation();
			if (customer.checkIfPinEnteredCorrect(customerDetails[i])) {
				System.out.println("select your service:");
				System.out.println("Deposit Cash-enter 1");
				System.out.println("Deposit Cheq-enter 2");
				System.out.println("Withdraw cash -enter 3");
				System.out.println("Balance-enter 4");
				System.out.println("Change pin-enter 5");
				service = sc.nextLine();
				switch (service) {
				case "1":
					System.out.println("enter deposite amount:");
					deposit = sc.nextDouble();
					customer.depositCash(deposit, customerDetails[i]);
					System.out.println("amount being deposited. ");
					customer.viewBalance(customerDetails[i]);
					break;
				case "2":
					System.out.println("Enter cheq amount:");
					deposit = sc.nextDouble();
					customer.depisiteCheq(deposit, customerDetails[i]);
					System.out.println("Cheq amount is being deposited. current balance now is:");
					customer.viewBalance(customerDetails[i]);
					break;
				case "3":
					System.out.println("enter withdraw amount:");
					withdraw = sc.nextInt();
					customer.withdrawCash(withdraw, customerDetails[i]);
					System.out.println("amount " + withdraw + "is withdrawn from your account");
					customer.viewBalance(customerDetails[i]);
					break;
				case "4":
					customer.viewBalance(customerDetails[i]);
					break;
				case "5":
					customer.changePinPassword(customerDetails[i]);
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

			if (customer.checkIfPassAndUserNameCorrect(customerDetails[i])) {
				System.out.println("View account -enter 1");
				System.out.println("Deposit cheq- enter 2");
				System.out.println("Change password-enter 3");
				service = sc.nextLine();
				switch (service) {
				case "1":
					customer.viewBalance(customerDetails[i]);
					break;
				case "2":
					System.out.println("enter cheq amount:");
					deposit = sc.nextDouble();
					customer.depisiteCheq(deposit, customerDetails[i]);
					System.out.println("your cheq is being deposited");
					customer.viewBalance(customerDetails[i]);
					break;
				case "3":
					customer.changePinPassword(customerDetails[i]);
					break;
				default:
					System.out.println("service not available");
					break;
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
