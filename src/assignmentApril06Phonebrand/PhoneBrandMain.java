package assignmentApril06Phonebrand;

import java.util.Scanner;

public class PhoneBrandMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phoneBrand;
		PhoneBrands phone = new PhoneBrands();
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the brand name:");
		phoneBrand = input.next();
		switch (phoneBrand) {
		case "Apple":
			phone.showAppleModels();
			break;
		case "Google":
			phone.showGoogleModels();
			break;
		case "Samsung":
			phone.showSamsungModels();
			break;
		default:
			System.out.println("Product name not found");
			break;

		}
		Scanner input2 = new Scanner(System.in);
		System.out.println("Please select the Model");
		phone.phoneModel = input2.nextLine();
		phone.findPhoneBrand();

	}

}
