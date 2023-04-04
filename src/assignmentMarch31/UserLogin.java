package assignmentMarch31;
import java.util.Scanner;
public class UserLogin {
	String UserId="pivotAdmin";
	String password="Admin123";
	int numberOfAttempts=1;
	String enteredUserId;
	String enteredPassword;
	
	void loginFunction() {
		Scanner input=new Scanner(System.in);
		for(int i=0; i<3;i++) {	
			System.out.println("Enter User Id:");
			enteredUserId=input.nextLine();
			System.out.println("Enter password: ");
			enteredPassword=input.nextLine();
			if(enteredUserId.equals(UserId) && enteredPassword.equals(password)) {
				System.out.println("you are Loged in now........ Welcome");
				break;
			}
				else {
					System.out.println("the id or password you entered is incorrect. Please try again");
					System.out.println("you have attempted "+numberOfAttempts+" out of 3");
					numberOfAttempts++;
				}
		}
		if(numberOfAttempts>=3)
		{
			System.out.println("your card is now blocked. Please contact the customer service");
		}
	}

}
