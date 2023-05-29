package rocketStimulation;

public class Rocket implements SpaceShip {
	int rocketWeight;
	int rocketMaxWeight;
	int rocketCost;
	int currentWeight;
	double launchExplo;
	double landExplo;

	public Rocket(int rocketWeight, int rocketMaxWeight, int rocketCost, double launchExpo, double landExpo) {
		super();
		this.rocketWeight = rocketWeight;
		this.rocketMaxWeight = rocketMaxWeight;
		this.rocketCost = rocketCost;
		this.launchExplo = launchExpo;
		this.landExplo = landExpo;
	}

	public boolean launch(double chanceOfExplo) {
		return true;
	}

	public boolean land(double chanceOfExplo) {
		return true;
	}

	public boolean canCarry(Item item) {
		boolean flag = false;
		if ((currentWeight + item.getWeight()) <= (rocketMaxWeight - rocketWeight)) {
			flag = true;
		}
		return flag;

	}

	public void carry(Item item) {
		currentWeight += item.getWeight();
	}

}
