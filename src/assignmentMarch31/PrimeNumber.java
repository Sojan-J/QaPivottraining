package assignmentMarch31;

public class PrimeNumber {
	
	int number;
	boolean prime=true;
	void checkPrimeNumber(){
	for(int i=2;i<number;i++) {
		if(number==2) {
			break;
			}else
				if(number%i==0) {
					prime=false;
					break;
				}	
	}
	if(prime) {
		System.out.println("its prime number");
	} else
		System.out.println("its not prime number");
	}
}
