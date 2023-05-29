package rocketStimulation;

import java.io.IOException;
import java.util.List;

public class RocketMain {

	public static void main(String[] args) throws IOException {
		double totalCostForR1=0;
		double totalCostForR2=0;
		List<Rocket>r1Rockets=Stimulation.loadU1(Stimulation.loadItem());	
		totalCostForR1=Stimulation.runStimulation(r1Rockets);
		List<Rocket>r2Rockets=Stimulation.loadU2(Stimulation.loadItem());
		totalCostForR2=Stimulation.runStimulation(r2Rockets);
		
		System.out.println("Total cost for R1 fleet:  $"+totalCostForR1+"millions");
		System.out.println("Total cost for R1 fleet:  $"+totalCostForR2+"millions");
		
		



	}

}
