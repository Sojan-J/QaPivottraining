package assignmentApril06Phonebrand;

public class PhoneBrands {
	String[] apple = { "iPhone 12", "iPhone 12 mini", "iPhone 11", "iPhone 11 pro" };
	String[] samsung = { "S20", "S21", "Flip3", "Fold3" };
	String[] google = { "Google Pixel 6", "GooglePixel 6 pro", "Google pixel pro", "Google Pixel 5" };
	String phoneModel;
	String phoneBrand;
	boolean found;

	void showAppleModels() {
		System.out.println("Apple Models");
		for (int i = 0; i < apple.length; i++) {
			System.out.println(apple[i]);
		}

	}

	void showGoogleModels() {
		System.out.println("Google Models");
		for (int i = 0; i < google.length; i++) {
			System.out.println(google[i]);

		}
	}

	void showSamsungModels() {
		System.out.println("Samsung Models");
		for (int i = 0; i < samsung.length; i++) {
			System.out.println(samsung[i]);

		}
	}

	void findPhoneBrand() {
		for (int i = 0; i < apple.length; i++) {
			if (apple[i].equalsIgnoreCase(phoneModel)) {
				phoneBrand = "Apple";
				found = true;
				phoneModel=apple[i];
				break;
			}
		}
		if(!found) {
			for(int i=0;i<samsung.length;i++) {
				if (samsung[i].equalsIgnoreCase(phoneModel)) {
					phoneBrand = "Samsung";
					found = true;
					phoneModel=samsung[i];
					break;
				}
			}
		}
		if(!found) {
			for(int i=0;i<google.length;i++) {
				if (google[i].equalsIgnoreCase(phoneModel)) {
					phoneBrand = "Google";
					found = true;
					phoneModel=google[i];
					break;
				}
			}
			
		}
if(found) {
	System.out.println("product selected is : "+phoneBrand+" "+phoneModel);
}
else
	System.out.println("Please select a product from the list");
	}
}