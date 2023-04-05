package arrayAssignment;

public class ArrayClass {
	int array[] = new int[10];
	int number = 1;

	void printNumberDvisible() {
		for (int index = 0; index < 10; index++) {
			for (int count = 1; count < 20; count++) {
				if (number % 3 == 0 && number % 5 == 0) {
					array[index] = number;
					number++;
					break;
				} else
					number++;
			}
		}
		System.out.println("Numbers divisible by 3 and 5 are: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(array[i] + ", ");
		}
	}

}
