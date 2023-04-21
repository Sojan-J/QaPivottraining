package assignmentApril06Phonebrand;

import java.util.Scanner;

public class PhoneBrands {
	String[] apple = { "iPhone 14", "iPhone 14 pro", "iPhone 14 pro max", "iPhone 14 mini" };
	int[] appleMonthlyTab = { 30, 40, 65, 25 };
	String[] samsung = { "S22", "S22+", "S22 Ultra", "S22 FE" };
	int[] samsungMonthlyTab = { 25, 35, 55, 20 };
	Scanner sc = new Scanner(System.in);

	String phoneBrand;
	boolean found;

	String selectPhoneBrand() {
		System.out.println("Please enter the Brand that you want to choose from: Apple/ Samsung");
		String phoneModel = sc.next();
		return phoneModel;
	}

	int selectServiceProvider(String serviceProvider) {
		int monthlyPlan = 0;
		switch (serviceProvider.toUpperCase()) {
		case "ROGERS":
			monthlyPlan = 70;
		case "TELUS":
			monthlyPlan = 75;
		case "BELL":
			monthlyPlan = 80;
		default:
			System.out.println("service provider not found");
		}

		return monthlyPlan;
	}

	void showAppleModels() {
		System.out.println("Apple Models");
		for (int i = 0; i < apple.length; i++) {
			System.out.println(apple[i]);
		}
	}

	void showSamsungModels() {
		System.out.println("Samsung Models");
		for (int i = 0; i < samsung.length; i++) {
			System.out.println(samsung[i]);
		}
	}

	int getAppleTab(String model) {
		int phoneTab = 0;
		for (int i = 0; i < apple.length; i++) {
			if (apple[i].equalsIgnoreCase(model)) {
				phoneTab = appleMonthlyTab[i];
				break;
			}
		}
		return phoneTab;
	}

	int getSamsungTab(String model) {
		int phoneTab = 0;
		for (int i = 0; i < samsung.length; i++) {
			if (samsung[i].equalsIgnoreCase(model)) {
				phoneTab = samsungMonthlyTab[i];
				break;
			}
		}
		return phoneTab;
	}

	void calculateMonthlyPayment(String model, String serviceProvider, int tab, int planPrice) {
		int totalMonthlypayment = tab + planPrice;
		System.out.println("You have Selected " + model + " with " + serviceProvider + " Plan.");
		System.out.println("your phone phone tab will be :     $" + tab);
		System.out.println("your monthly plan will be        :     $" + planPrice);
		System.out.println("Total monthly amount             :     $" + totalMonthlypayment);
	}

}