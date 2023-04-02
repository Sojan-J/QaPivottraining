package assignmentMarch31;
import java.util.Scanner;

public class WaterTank {
	int currentWater;
	char addMore;
	Scanner input=new Scanner(System.in);
	void TankFilling() {
		if(currentWater==100) {
			System.out.println("Tank is up to its maximam capacity");
		}else {
		System.out.println("curently your watertank has "+currentWater+" liters of water");
		System.out.println("do you want add more water with your 10Lr. bucket?(use upper case Y/N");
		addMore=input.next().charAt(0);
		}
		if(addMore=='Y') {
	while(currentWater<100) {
		currentWater+=10;
	}
		
	}
	System.out.println("Your curent water level now is "+ currentWater  );
	}
}
