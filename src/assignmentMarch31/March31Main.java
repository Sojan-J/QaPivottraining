package assignmentMarch31;
import java.util.Scanner;

public class March31Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//*************water tank***********
		WaterTank tank=new WaterTank();
		tank.currentWater=9.9;
		tank.TankFilling();
		
		//***************prime number*************
		/*PrimeNumber prime= new PrimeNumber();
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a number:");
		prime.number=input.nextInt();
		prime.checkPrimeNumber();*/
		
		//***********Chocolate Box************
		/*ChocolateBox box=new ChocolateBox();
		box.currentBoxLevel=60;
		box.addChocolate();*/
		
		// **********Login functionality*********
		/*UserLogin login=new UserLogin();
		login.loginFunction();*/
		
		//**********Calculator*********
		/*Calculator cal=new Calculator();
		String operation;
		Scanner input =new Scanner(System.in);
		System.out.println("Please enter your preferred operator: add, product, difference, divide, square or cube");
		operation=input.nextLine();
		switch (operation) {
		case "add":
			cal.sumOfNumbers();
			break;
		case "difference":
			cal.differenceOfNumbers();
			break;
		case "product":
			cal.productOFNumbers();
			break;
		case "divide":
			cal.divisionOfNumbers();
			break;
		case "cube":
			cal.cubeOfnumber();
			break;
		case "square":
			cal.squareOfNumber();
			break;
			default:
				System.out.println("unrecognized operation");
				break;
		}*/
		
}
}
