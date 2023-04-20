package pizzaBillManagement;

import java.util.Scanner;

public class PizzaBill {

	double pizzaBasePrice;
	double pepperoniTopingPrice;
	double xtraCheesePrice;
//Take pizza order
	String takePizzaOrder(Scanner sc, String pizzaSize[]) {
		System.out.println("Available Cheese pizza size:");
		for (int i = 0; i < pizzaSize.length; i++) {
			System.out.println(pizzaSize[i]);
		}
		System.out.println("Please select your pizza size:");
		String selectedPizzaSize = sc.nextLine();
		return selectedPizzaSize;
	}
//check selected pizza is from the list
	boolean checkSelection(String pizzaSize[], String selection) {
		boolean listedSelection = false;
		for (int i = 0; i < pizzaSize.length; i++) {
			if (pizzaSize[i].equalsIgnoreCase(selection)) {
				listedSelection = true;
				break;
			}
		}
		return listedSelection;
	}
//confirm if pepperoni toppings to be added
	boolean confirmPepperonitop(Scanner sc) {
		char confirm;
		System.out.println("Do you want pepperoni  topping(Y/N?");

		if ((confirm = sc.next().charAt(0)) == 'Y') {
			return true;
		} else
			return false;
	}
//confirm if xtra cheese required
	boolean confirmExtraCheese(Scanner sc) {
		char confirm;
		System.out.println("Do you want extra cheeese(Y/N?");
		if ((confirm = sc.next().charAt(0)) == 'Y') {
			return true;
		} else
			return false;
	}
//calculate total price
	double priceCalculate(String selection, boolean pepperoni, boolean cheese) {
		double totalPrice = 0;
		switch (selection) {
		case "Small cheese pizza":
			pizzaBasePrice = 15;
			if (pepperoni) {
				pepperoniTopingPrice = 2;
			}
			break;
		case "Medium cheese pizza":
			pizzaBasePrice = 20;
			if (pepperoni) {
				pepperoniTopingPrice = 3;
			}
			break;
		case "Large cheese pizza":
			pizzaBasePrice = 25;
			if (pepperoni) {
				pepperoniTopingPrice = 2;
			}
			break;
		}

		if (cheese) {
			xtraCheesePrice = 1;
		}
		totalPrice = pizzaBasePrice + pepperoniTopingPrice + xtraCheesePrice;
		return totalPrice;
	}
// print the total price
	void printTheBill(double totalPrice, String selection) {

		System.out.println("total price for the " + selection + "-------$" + totalPrice);

	}
}
