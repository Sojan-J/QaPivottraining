package bankOperationAssignment;

import java.util.*;

public class BankOperationMain {
	public static void main(String[] args) {
		String operation=null;
		BankOperation customer = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select your operation: online banking/ATM");
		operation = sc.nextLine();
		switch (operation) {
		case "ATM":
			customer = new AtmOperation();
			customer.atmOnlineOperation();
			break;	
		case "online banking":
			customer = new OnlineBanking();
			customer.atmOnlineOperation();
			break;
			default:
				System.out.println("operation not available");
				break;
		}
	}
}

			