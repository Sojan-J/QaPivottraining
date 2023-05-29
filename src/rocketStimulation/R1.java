package rocketStimulation;

import java.util.Random;

public class R1 extends Rocket {

	public R1(int rocketWeight, int rocketMaxWeight, int rocketCost, double launchExplo, double landExplo) {
		super(rocketWeight, rocketMaxWeight, rocketCost, launchExplo, landExplo);
	}

	@Override
	public boolean launch(double chanceOfLaunchExplo) {
		double threshold = 0.05 * 10;

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
	public boolean land(double chanceOfExplo) {
		double threshold = 0.01 * 10;
		double chance = chanceOfExplo * 10;
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
