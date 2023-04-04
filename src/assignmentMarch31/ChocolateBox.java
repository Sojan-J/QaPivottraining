package assignmentMarch31;

import java.util.Scanner;

public class ChocolateBox {
	int boxCapacity = 63;
	int incrementBy = 5;
	int currentBoxLevel;

	void addChocolate() {
		char addMore;
		Scanner input = new Scanner(System.in);
		System.out.println("currently the box has " + currentBoxLevel + " chocolates");
		System.out.println("Do you want fill the box? (Y/N");
		addMore = input.next().charAt(0);
		while (currentBoxLevel < 63) {
			int outOfBox = (currentBoxLevel + 5) - 63;
			if (addMore == 'Y') {
				if (outOfBox <= 0) {
					currentBoxLevel += incrementBy;
					System.out.println("filling....... box now has " + currentBoxLevel + " chocolates");

				} else {
					// System.out.println("you can add now only "+(incrementBy-outOfBox)+"
					// chocolates ");
					currentBoxLevel += (incrementBy - outOfBox);
					break;
				}

			} else
				break;
		}
		System.out.println("your Box currently has " + currentBoxLevel + " chocolates");
	}

}
