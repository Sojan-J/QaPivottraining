package pizzaBillManagement;

public class PizzaBillMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaBill bill=new PizzaBill();
		bill.takePizzaOrder();
		bill.priceCalculate();
		bill.printTheBill();

	}

}
