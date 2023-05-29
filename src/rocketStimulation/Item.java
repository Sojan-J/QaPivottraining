package rocketStimulation;

public class Item {
	private String name;
	private int weight;

	public Item(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

}
