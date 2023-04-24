package hangmanGame;

import java.util.Random;
import java.util.Scanner;

public class GuesStudentGame {
	String[] studentTitle = { "Aleena", "Angel", "Asha", "Clemin", "Gopesh", "Hamneet", "Jimna", "Jobin", "Jude",
			"Kamaldeep", "Manpreets", "Manpreetp", "Mariya", "Namitha", "Neelam", "Nisha", "Parminder", "Rajat", "Rojy",
			"Sojan", "Suchitra", "Vindhuja" };

	Scanner sc = new Scanner(System.in);
	char guess;

	String getRandomTitle() {
		Random rand = new Random();
		int randomIndex = rand.nextInt(studentTitle.length);
		return studentTitle[randomIndex];
	}

	void populateWrongLettersArr(int wrong, char[] wrongLetters, char letter) {
		wrongLetters[wrong - 1] = letter;
	}

	void printWrongLetters(int wrong, char[] wrongLetters) {
		for (int i = 0; i <= wrong; i++) {
			System.out.print(wrongLetters[i]);
		}
	}

	char[] populateArraywithUnderScore(String randomTitle) {
		char[] underScore = new char[randomTitle.length()];
		for (int i = 0; i < randomTitle.length(); i++) {
			underScore[i] = '_';
		}
		return underScore;
	}

	void printUnderScoreArray(char[] underScore) {
		for (int i = 0; i < underScore.length; i++) {
			System.out.print(underScore[i]);
		}
	}

	char[] convertRandomString(String random) {
		char[] randomArray = new char[random.length()];
		for (int i = 0; i < random.length(); i++) {
			randomArray[i] = Character.toUpperCase(random.charAt(i));
		}
		return randomArray;
	}

	void removeTheMatchedChar(char[] randomArray, char letter) {
		for (int i = 0; i < randomArray.length; i++) {
			if (randomArray[i] == letter) {
				randomArray[i] = '$';
				break;
			}
		}
	}

	void updateUnderScore(char[] underScore, char[] randomArray, char letter) {
		for (int i = 0; i < underScore.length; i++) {
			if (randomArray[i] == letter) {
				underScore[i] = letter;
				break;
			}
		}
	}

	boolean verifyTheCharacter(char[] randomArray, char letter) {
		boolean match = false;
		for (int i = 0; i < randomArray.length; i++) {
			if (randomArray[i] == letter) {
				match = true;
				break;
			}
		}
		return match;
	}

	char getGuessingletter(int correct, int wrong, char[] underScore, char[] wrongLetter) {
		System.out.println();
		System.out.print("You are guessing");
		System.out.print("     ");
		for (int i = 0; i < underScore.length; i++) {
			System.out.print(underScore[i]);
		}
		System.out.println();
		System.out.println("       ");
		System.out.print("You guessed " + correct);
		System.out.print("  wrong letters ");
		for (int j = 0; j < wrong; j++) {
			System.out.print(wrongLetter[j] + ",");
		}
		System.out.println();
		System.out.println("Guess a letter: ");
		guess = sc.next().charAt(0);
		return guess;
	}

}
