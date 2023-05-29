package rocketStimulation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Stimulation {

	public static List<Item> loadItem() throws IOException {
		List<Item> items = new ArrayList<Item>();
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("W:\\QAPivotTrainingMarch2023-Sept2023\\fileReader\\itemList.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String[] fileItem = new String[2];
		String tempList = null;
		br = new BufferedReader(fr);
		while ((tempList = br.readLine()) != null) {
			fileItem = tempList.split("=");
			Item itemList = new Item(fileItem[0], Integer.parseInt(fileItem[1]));
			items.add(itemList);
		}
		return items;
	}

	// loadU1
	public static List<Rocket> loadU1(List<Item> items) {
		int check = 0;
		boolean flag = false;
		List<Rocket> r1Rocket = new ArrayList<Rocket>();
		for (int i = 0; i < items.size(); i++) {
			Rocket rockR1 = new R1(10000, 18000, 100, 0.05, 0.01);
			for (int j = i; j < items.size(); j++) {
				if (rockR1.canCarry(items.get(j))) {
					rockR1.carry(items.get(j));
					items.get(j).setWeight(0);
					if (rockR1.currentWeight == (rockR1.rocketMaxWeight - rockR1.rocketWeight)) {
						break;
					}
				}
			}
			r1Rocket.add((R1) rockR1);
			for (int count = 0; count < items.size(); count++) {
				if (items.get(count).getWeight() == 0) {
					check++;
				}
			}
			if (check >= items.size()) {
				break;
			}
			check = 0;
		}
		return r1Rocket;
	}

	// loadU2
	public static List<Rocket> loadU2(List<Item> items) {
		int check = 0;
		boolean flag = false;
		List<Rocket> r2Rocket = new ArrayList<Rocket>();
		for (int i = 0; i < items.size(); i++) {
			Rocket rockR2 = new R2(18000, 29000, 120, 0.04, 0.08);
			for (int j = i; j < items.size(); j++) {
				if (rockR2.canCarry(items.get(j))) {
					rockR2.carry(items.get(j));
					items.get(j).setWeight(0);
					if (rockR2.currentWeight == (rockR2.rocketMaxWeight - rockR2.rocketWeight)) {
						break;
					}
				}
			}
			r2Rocket.add((R2) rockR2);
			for (int count = 0; count < items.size(); count++) {
				if (items.get(count).getWeight() == 0) {
					check++;
				}
			}
			if (check >= items.size()) {
				break;
			}
			check = 0;
		}
		return r2Rocket;
	}

	public static double runStimulation(List<Rocket> rocketList) {
		double chanceOfLaunchExplo = 0;
		double chanceOfLandExplo = 0;
		double totalBudget = 0;

		// find launch explosion
		for (int i = 0; i < rocketList.size(); i++) {
			boolean flag = false;
			chanceOfLaunchExplo = rocketList.get(i).launchExplo
					* (rocketList.get(i).currentWeight / rocketList.get(i).rocketMaxWeight);
			if (rocketList.get(i).launch(chanceOfLaunchExplo)) {
				totalBudget += rocketList.get(i).rocketCost;
				flag = true;
			} else
				totalBudget += rocketList.get(i).rocketCost;
			while (!flag) {
				if (rocketList.get(i).launch(chanceOfLaunchExplo)) {
					totalBudget += rocketList.get(i).rocketCost;
					flag = true;
				} else
					totalBudget += rocketList.get(i).rocketCost;
			}
		}
		// find landing explosion
		for (int i = 0; i < rocketList.size(); i++) {
			boolean flag = false;
			chanceOfLandExplo = rocketList.get(i).landExplo
					* (rocketList.get(i).currentWeight / rocketList.get(i).rocketMaxWeight);
			if (rocketList.get(i).land(chanceOfLandExplo)) {
				totalBudget += rocketList.get(i).rocketCost;
				flag = true;
			} else
				totalBudget += rocketList.get(i).rocketCost;
			while (!flag) {
				if (rocketList.get(i).land(chanceOfLandExplo)) {
					totalBudget += rocketList.get(i).rocketCost;
					flag = true;
				} else
					totalBudget += rocketList.get(i).rocketCost;
			}
		}

		return totalBudget;
	}

}
