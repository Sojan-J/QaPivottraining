package crsScore;

import java.util.Scanner;

public class CsrCalculationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CsrScroreCalculation csrCal = new CsrScroreCalculation();
		boolean hveRelative = false;
		boolean hveStudied = false;
		boolean hveWorked = false;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your education level: (PhD, Master's, University Degree, Diploma 3 years)");
		String edulevel = input.nextLine();
		double eduScore = csrCal.eduPoint(edulevel);
		System.out.println("Please enter your experience in years");
		int experience = input.nextInt();
		double expScore = csrCal.experiencepoint(experience);
		System.out.println("Please enter your age in years:");
		int age = input.nextInt();
		int ageScore = csrCal.agePoint(age);
		System.out.println("Enter your IELTS score for Speaking");
		double ieltsSpeakScore = input.nextDouble();
		double ielSpeak = csrCal.ieltsScoreSpeaking(ieltsSpeakScore);
		System.out.println("Enter your IELTS score for Writing");
		double ieltsWritingScore = input.nextDouble();
		double ielWriting = csrCal.ieltsScoreWriting(ieltsWritingScore);
		System.out.println("Enter your IELTS score for Listening");
		double ieltsListeningScore = input.nextDouble();
		double ielListening = csrCal.ieltsScoreListening(ieltsListeningScore);
		System.out.println("Enter your IELTS score for Reading");
		double ieltsReadingScore = input.nextDouble();
		double ielReading = csrCal.ieltsScoreReading(ieltsReadingScore);
		System.out.println("If you have a relative  in Canada"
				+ "(Parents, Grand Parents, Brother, Sister, Aunt, Uncle, Nephew or Niece) "
				+ " who is a Canadian Citizen or PR holder (Y/N)");
		if (input.next().charAt(0) == 'Y') {
			hveRelative = true;
		}
		System.out.println("Have you studied in Canada for atleast 2 years (Y/N");
		if (input.next().charAt(0) == 'Y') {
			hveStudied = true;
		}
		System.out.println("Have you worked in Canada for atleast 1 year at NOC 0, A, B (Y/N)");
		if (input.next().charAt(0) == 'Y') {
			hveWorked = true;
		}
		double adaptabilityScore = csrCal.adaptabilityScore(hveRelative, hveStudied, hveWorked);

		double earnedPoint = csrCal.calculateCsrpoint(eduScore, expScore, ageScore, ielSpeak, ielWriting, ielReading,
				adaptabilityScore);
		csrCal.checkEligibility(earnedPoint);
		// System.out.println(csrCal.agePoint(49));
		// System.out.println(csrCal.ieltsScoreListening(7));

	}

}
