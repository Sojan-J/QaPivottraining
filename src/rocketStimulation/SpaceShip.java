package rocketStimulation;

public interface SpaceShip {

	public boolean launch(double chanceOfLaunchExplo);

	public boolean land(double chanceOfLandExplo);

	public boolean canCarry(Item item);

	public void carry(Item item);

}
