package assignmentMarch29;
import java.util.Scanner;//???????
public class Banking {
	int actualPin;
	int enteredPin;
	boolean pinCorrect;
	int numberOfAttempt=1;
	
	double balanceAmount;
	double overdraftAmount;
	double availableBalance;
	int withdrawalAmount;
	Scanner sc =new Scanner(System.in);
	
	void withdrawCash() {
		for(int counter=0;
				counter<3;
				counter++) {
			System.out.println("Enter your Pin: ");
			enteredPin=sc.nextInt();
			if(actualPin==enteredPin) {
				pinCorrect=true;
				break;
			}else
				if(numberOfAttempt>=3) {
					System.out.println("Your card is now blocked. please contact Customer Service");
				
				}else {
					System.out.println("The pin you entered is incorrect");
					System.out.println("Attention!!! you have attempted 3 out of  "+ numberOfAttempt);
					numberOfAttempt++;
				}
		}
		
		if(pinCorrect) {
			availableBalance=balanceAmount+overdraftAmount;
			System.out.println("please enter your withdrawal Amount:");
			withdrawalAmount=sc.nextInt();
			if(withdrawalAmount<availableBalance) {
				System.out.println("Please collect your Cash.");
			}
			else {
				System.out.println("you dont have enough balance");
			}
			
			
		}
	}
	

}
