package bankOperationAssignment;

import java.util.Scanner;

public class AtmOperation extends BankOperation {

	@Override
	protected void depisiteCheq(double cheqAmount, PersonalDetails customer) {
		customer.setAccountBalance(customer.getAccountBalance() + cheqAmount);
	}

	protected void changePinPassword(PersonalDetails customer) {
		int currentPin = customer.getAtmPin();
		int newPin = 0;
		int count = 1;
		Scanner sc = new Scanner(System.in);
		if (checkIfPinEnteredCorrect(customer)) {
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

}
