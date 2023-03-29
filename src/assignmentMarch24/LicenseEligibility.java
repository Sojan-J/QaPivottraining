package assignmentMarch24;

public class LicenseEligibility {
	int age;
	boolean licenseG1;
	boolean licenseG2;;
	boolean licenseG;
	String typeOfLicence;
void licenseEligibility() {
		if(age<16) {
			System.out.println("Sorry !!! You are not old enough to drive ");
		}
		else
			if(licenseG) {
				typeOfLicence="G";
				System.out.println("You are holding G Licence");
				
				
			}
			else
				if(licenseG2) {
					typeOfLicence="G";
					System.out.println("you eligible for Licence :"+typeOfLicence);
					
				}
				else
				if(licenseG1) {
					typeOfLicence="G2";
					System.out.println("you eligible for Licence :"+typeOfLicence);
					
				}
				else {
					typeOfLicence="G1";
		System.out.println("you eligible for Licence :"+typeOfLicence);
					}	
						
					
					
		
	}


}
