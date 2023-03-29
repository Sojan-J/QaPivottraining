package assignmentMarch24;

public class FindLargeNumber {
int number1;
int number2;
int number3;
int largeNumber;

void findLargeNum() {
	if(number1>number2) {
		largeNumber=number1;
	}
	else
		largeNumber=number2;
	
	if(largeNumber>number3) {
		System.out.println("the large number = "+ largeNumber);	
	}
	else
		System.out.println("the large number = "+ number3);



}
}