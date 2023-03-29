package assignmentMarch24;

public class Trials {
	int age;
	boolean g1;
	boolean g2;
	boolean g;
	String typeOfLicense;
void licenceEligibility() {
		if(age<16) {
			System.out.println("Sorry !!! You are not old enough to drive ");
		}
		else
			if(!g1) {
				typeOfLicense="G1";
				System.out.println("you are eligible for "+typeOfLicense+" license");
			}
			else
				if(!g2) {
					typeOfLicense="G2";
					System.out.println("you are eligible for "+typeOfLicense+" licence");
				}
				else
				if(!g) {
					typeOfLicense="G";
					System.out.println("you are eligible for "+typeOfLicense+" licence");
				}
				else
						System.out.println("You are holding G Licence");
					}
					
		
	}



