package assignmentMarch31;
import java.util.Scanner;
public class Calculator {
	int num1;
	int num2;
	
	Scanner input = new Scanner(System.in);
	

	void sumOfNumbers() {
		System.out.println("enter the numbers to add;");
		System.out.println("Number 1:");
		num1=input.nextInt();
		System.out.println("Number 2:");
		num2=input.nextInt();
		int sum = num1 + num2;
		System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
	}

	void differenceOfNumbers() {
		System.out.println("enter the numbers to substract;");
		System.out.println("Number 1:");
		num1=input.nextInt();
		System.out.println("Number 2:");
		num2=input.nextInt();
		int difference = num1 - num2;
		System.out.println("Difference of " + num1 + " and " + num2 + " is " + difference);
	}

	void productOFNumbers() {
		System.out.println("enter the numbers to find the product;");
		System.out.println("Number 1:");
		num1=input.nextInt();
		System.out.println("Number 2:");
		num2=input.nextInt();
		int product = num1 * num2;
		System.out.println("Product of " + num1 + " and " + num2 + " is " + product);
	}

	void divisionOfNumbers() {
		System.out.println("enter the numbers to divide;");
		System.out.println("Number 1:");
		num1=input.nextInt();
		System.out.println("Number 2:");
		num2=input.nextInt();
		int quotient = num1 / num2;
		System.out.println("Quotient of " + num1 + " and " + num2 + " is " + quotient);
		int remainder = num1 % num2;
		System.out.println("Remainder of the division operation of " + num1 + " and " + num2 + " is " + remainder);
	}
	void squareOfNumber() {
		System.out.println("enter the number to find its square ;");
		num1=input.nextInt();
		int square= num1*num1;
		System.out.println("the suare of " +num1+" is :"+square);
	}
void cubeOfnumber() {
	System.out.println("enter the number to find its cube ;");
	num1=input.nextInt();
	int cube= num1*num1*num1;
	System.out.println("the cube of " +num1+" is :"+cube);
}
}
