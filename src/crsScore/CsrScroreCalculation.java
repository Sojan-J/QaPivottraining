package crsScore;

public class CsrScroreCalculation {
	// double educationLevel;
	double minimumPoint = 67;

//get point from education
	double eduPoint(String edlevel) {
		double edPoint = 0;
		switch (edlevel) {
		case "PhD":
			edPoint = 25;
			break;
		case "Master's":
			edPoint = 23;
			break;
		case "University Degree":
			edPoint = 22;
			break;
		case "Diploma 3 years":
			edPoint = 21;
			break;
		default:
			edPoint = 0;
			break;
		}
		return edPoint;
	}

//get point from work experience
	double experiencepoint(int yearsExp) {
		int expPoint = 0;
		if (yearsExp >= 4 && yearsExp <= 5) {
			expPoint = 13;
		}
		if (yearsExp >= 6) {
			expPoint = 15;
		}
		return expPoint;
	}

//get point from age
	int agePoint(int age) {
		int agPoint = 12;
		if (age >= 18 && age <= 35) {
			agPoint = 12;
		} else if (age > 35) {
			for (int i = 36; i <= 47; i++) {
				agPoint--;
				if (age == i) {
					break;
				}
			}
		} else
			agPoint = 0;
		return agPoint;
	}

	// get point from IELTS Listening
	int ieltsScoreListening(double score) {
		int listeningScore = 0;
		if (score >= 8) {
			listeningScore = 6;
		} else if (score == 7.5) {
			listeningScore = 5;
		}
		return listeningScore;
	}

	// get point from IELTS Speaking
	int ieltsScoreSpeaking(double score) {
		int speakingScore = 0;
		if (score >= 7) {
			speakingScore = 6;
		} else if (score == 6.5) {
			speakingScore = 5;
		}
		return speakingScore;
	}

	// get points from IELTS speaking
	int ieltsScoreWriting(double score) {
		int writingScore = 0;
		if (score >= 7) {
			writingScore = 6;
		} else if (score == 6.5) {
			writingScore = 5;
		}
		return writingScore;
	}

	// get points from IELTS reading
	int ieltsScoreReading(double score) {
		int readingScore = 0;
		if (score >= 8) {
			readingScore = 6;
		} else if (score == 7.5) {
			readingScore = 5;
		}
		return readingScore;
	}

	// get points from adaptability
	int adaptabilityScore(boolean hasRelative, boolean haveStudied, boolean haveWorked) {
		int adaptScore = 0;
		if (hasRelative) {
			adaptScore += 5;
		}
		if (haveStudied) {
			adaptScore += 5;
		}
		if (haveWorked) {
			adaptScore += 10;
		}
		return adaptScore;
	}

	// calculate total point earned;
	double calculateCsrpoint(double edu, double work, int age, double ielSp, double ielWr, double ielLs,
			double ielRead) {
		return edu + work + age + ielSp + ielWr + ielLs + ielRead;
	}

	// check the eligibility
	void checkEligibility(double earnedPoint) {
		if (earnedPoint >= minimumPoint) {
			System.out.println("Total Points you have scored: " + earnedPoint + "Points");
			System.out.println("You qualify to submit an Expression of Interest (EOI) to Immigration Canada");
		} else {
			System.out.println("Total Points you have scored: " + earnedPoint + "Points");
			System.out.println("You DO NOT qualify to submit an Expression of Interest (EOI) to Immigration Canada");
		}

	}
}
