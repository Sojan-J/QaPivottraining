package assignmentMarch31;

import java.util.Scanner;

public class WaterTank {
	double currentWater;
	char addMore;
	double overFlowLimit;
	int maxTankCapacity=100;
	Scanner input = new Scanner(System.in);

	void TankFilling() {
		if (currentWater == 100) {
			System.out.println("Tank is up to its maximam capacity");
		} else {
			System.out.println("curently your watertank has " + currentWater + " liters of water");
			System.out.println("do you want fill your tank  with your 10Lr. bucket?(use upper case Y/N");
			addMore = input.next().charAt(0);
		}
		if (addMore == 'Y') {
			while (currentWater < 100) {
				overFlowLimit=(currentWater+10)-maxTankCapacity;
				if(overFlowLimit<=0) {
				currentWater += 10;
				System.out.println("Tank is filling.......current water level is "+ currentWater);
				}else 
				{
					System.out.println( "if you add another bucket then it would overflow");
					break;
				}
				
			}

		}
		System.out.println("Your curent water level now is " + currentWater);
	}
}
