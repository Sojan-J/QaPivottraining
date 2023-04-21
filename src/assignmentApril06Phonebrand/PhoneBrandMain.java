package assignmentApril06Phonebrand;

import java.util.Scanner;

public class PhoneBrandMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String model = null;
		int tab = 0;
		int monthlyPlan = 0;
		String serviceProvider = null;
		PhoneBrands phone = new PhoneBrands();
		Scanner input = new Scanner(System.in);
		String phoneBrand = phone.selectPhoneBrand();
		switch (phoneBrand.toUpperCase()) {
		case "APPLE":
			phone.showAppleModels();
			System.out.println("please choose your model :");
			model = input.nextLine();
			tab = phone.getAppleTab(model);
			break;
		case "SAMSUNG":
			phone.showSamsungModels();
			System.out.println("please choose your model :");
			model = input.nextLine();
			tab = phone.getSamsungTab(model);
			break;
		default:
			System.out.println("Brand not found");
			break;
		}
		System.out.println("Please select the plan that you want to opt for: Rogers/ Telus/ Bell");
		serviceProvider = input.next();
		monthlyPlan = phone.selectServiceProvider(serviceProvider);
		phone.calculateMonthlyPayment(model, serviceProvider, tab, monthlyPlan);

	}

}
