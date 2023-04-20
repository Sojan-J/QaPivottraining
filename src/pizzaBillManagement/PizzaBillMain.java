package pizzaBillManagement;

import java.util.Scanner;

public class PizzaBillMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String selection;
		String pizzaSize[] = { "Small cheese pizza", "Medium cheese pizza", "Large cheese pizza" };
		Scanner sc = new Scanner(System.in);
		PizzaBill bill = new PizzaBill();
		selection = bill.takePizzaOrder(sc, pizzaSize);
		if (bill.checkSelection(pizzaSize, selection)) {
			double totalPrice = bill.priceCalculate(selection, bill.confirmPepperonitop(sc),
					bill.confirmExtraCheese(sc));
			bill.printTheBill(totalPrice, selection);
		} else
			System.out.println("your selection " + selection + " is not in the list");
	}

}
