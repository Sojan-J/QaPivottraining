package pizzaBillManagement;
import java.util.Scanner;
public class PizzaBill {
	String pizzaSize[]= {"Small cheese pizza ","Medium cheese pizza","Large cheese pizza"};
	double pizzaBasePrice;
	double pepperoniTopingPrice;
	double xtraCheesePrice;
	String selectedPizzaSize;
	char YorNpepperoni;
	char YorNcheese;
	double totalPrice;
	void takePizzaOrder() {
		System.out.println("Available Cheese pizza size:");
		for(int i=0;i<pizzaSize.length;i++) {
			System.out.println(pizzaSize[i]);
		}
		Scanner sc =new Scanner(System.in);
		System.out.println("Please select your pizza size:");
		selectedPizzaSize=sc.nextLine();
		System.out.println("Do you want pepperoni  topping(Y/N?");
	   YorNpepperoni=sc.next().charAt(0);
	   System.out.println("Do you want extra cheeese(Y/N?");
	   YorNcheese=sc.next().charAt(0);	
	}
	void priceCalculate() {
		switch(selectedPizzaSize) {
		case  "Small cheese pizza":
			pizzaBasePrice=15;
			if(YorNpepperoni=='Y') {
				pepperoniTopingPrice=2;
			}
			break;
		case "Medium cheese pizza":
			pizzaBasePrice=20;
			if(YorNpepperoni=='Y') {
				pepperoniTopingPrice=3;
			}
			break;
		case "Large cheese pizza":
			pizzaBasePrice=25;
			if(YorNpepperoni=='Y') {
				pepperoniTopingPrice=2;
			}
			break;						
		}
		if(YorNcheese=='Y') {
			xtraCheesePrice=1;	
		}
		totalPrice=pizzaBasePrice+pepperoniTopingPrice+xtraCheesePrice;
	}
	void printTheBill() {
		System.out.println(selectedPizzaSize+"------------------$"+pizzaBasePrice);
		if(YorNpepperoni=='Y') {
			System.out.println("Pepperoni toppings"+"---------------$"+pepperoniTopingPrice);	
		}
		if(YorNcheese=='Y') {
			System.out.println("Xtra Cheese            "+"----------------- $"+xtraCheesePrice);
		}
			System.out.println("total price                "+"-----------------$"+totalPrice);
		
	}
	
	

}
