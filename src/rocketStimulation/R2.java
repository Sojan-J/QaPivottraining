package rocketStimulation;

public class R2 extends Rocket {

	public R2(int rocketWeight, int rocketMaxWeight, int rocketCost, double launchExplo, double landExplo) {
		super(rocketWeight, rocketMaxWeight, rocketCost, launchExplo, landExplo);

	}

	@Override
	public boolean launch(double chanceOfLaunchExplo) {
		double threshold = 0.04 * 10;

		double chance = chanceOfLaunchExplo * 10;
		double randomNumber = (Math.random());
		if (randomNumber > threshold) {
			randomNumber = threshold;
		}
		if (chance <= randomNumber) {
			return true;
		} else
			return false;
	}

	@Override
	public boolean land(double chanceOfLandExplo) {
		double threshold = 0.08 * 10;
		double chance = chanceOfLandExplo * 10;
		double randomNumber = Math.random();
		if (randomNumber > threshold) {
			randomNumber = threshold;
		}
		if (chance <= randomNumber) {
			return true;
		} else
			return false;

	}
}
