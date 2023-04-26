package hangmanGame;

import java.util.Random;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;

public class GuesStudentGame {
	Scanner sc = new Scanner(System.in);
	char guess;
	char previousLetter;
	char[] numberOfLettersEntered = new char[26];

	String getRandomName() throws IOException {
		int count = 0;
		int numberOfLine = 0;
		String randomName = null;
		FileReader fr1 = new FileReader("W:\\QAPivotTrainingMarch2023-Sept2023\\fileReader\\studentList.txt");
		BufferedReader br1 = new BufferedReader(fr1);
		while (br1.readLine() != null) {
			numberOfLine++;
		}
		br1.close();
		Random getRandom = new Random();
		int randomLine = getRandom.nextInt(numberOfLine);
		FileReader fr2 = new FileReader("W:\\QAPivotTrainingMarch2023-Sept2023\\fileReader\\studentList.txt");
		BufferedReader br2 = new BufferedReader(fr2);
		while (br2.readLine() != null) {
			if (count == randomLine) {
				randomName = br2.readLine();
			}
			count++;
		}
		return randomName;
	}

	void populateNumberOfletters(char letter, int current) {
		numberOfLettersEntered[current] = letter;
	}

	boolean checkIfLetterRepeated(char letter, int current) {
		boolean flaged = false;
		for (int i = 0; i <= current; i++) {
			if (numberOfLettersEntered[i] == letter) {
				flaged = true;
				break;
			}
		}
		return flaged;
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

	void updateUnderScore(char[] underScore, char[] random, char letter) {
		for (int i = 0; i < underScore.length; i++) {
			if (random[i] == letter) {
				underScore[i] = letter;
			}
		}
	}

	boolean verifyTheCharacter(char[] random, char letter) {
		boolean match = false;
		for (int i = 0; i < random.length; i++) {
			if (random[i] == letter) {
				match = true;
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
		System.out.print("You guessed " + wrong);
		System.out.print("  wrong letters ");
		for (int j = 0; j < wrong; j++) {
			System.out.print(wrongLetter[j] + ",");
		}
		System.out.println();
		System.out.println("Guess a letter: ");
		guess = sc.next().charAt(0);
		return guess;
	}

	boolean checkIfWordComplete(char[] underScore, char[] random) {
		boolean wordComplete = false;
		for (int i = 0; i < underScore.length; i++) {
			if (underScore[i] != random[i]) {
				wordComplete = true;
			}

		}
		return wordComplete;
	}

}
