package hangmanGame;

import java.util.Scanner;
import java.util.Arrays;

public class GuesStudentGamemain {

	public static void main(String[] args) {
		int wrong = 0;
		int correct = 0;
		boolean match = false;
		int numberOfLetters = 0;
		char[] wrongLetters = new char[5];
		char letter = '$';

		Scanner sc = new Scanner(System.in);
		GuesStudentGame game = new GuesStudentGame();
		String randomTitle = game.getRandomTitle();
		numberOfLetters = randomTitle.length();
		char underScore[] = game.populateArraywithUnderScore(randomTitle);
		System.out.println("WELCOME TO STUDENT GUESS GAMING");
		System.out.println("The Name has " + randomTitle.length() + " letters");
		// System.out.println(randomTitle);
		char[] randomArr = game.convertRandomString(randomTitle);

		for (int i = 0; i < 26; i++) {
			letter = game.getGuessingletter(correct, wrong, underScore, wrongLetters);
			letter = Character.toUpperCase(letter);
			match = game.verifyTheCharacter(randomArr, letter);
			if (match) {
				correct++;
				game.updateUnderScore(underScore, randomArr, letter);
				game.removeTheMatchedChar(randomArr, letter);
			} else {
				wrong++;
				game.populateWrongLettersArr(wrong, wrongLetters, letter);
			}
			if (wrong >= 5 || correct == randomTitle.length()) {
				break;
			}

		}
		if (correct == randomTitle.length()) {
			System.out.println();
			System.out.println(" You WIN!!!!!!");
			System.out.println("you have guessed " + randomTitle + " correctly");
		} else {
			System.out.println("You LOST!!!");
			System.out.println("you couldn't guess " + randomTitle + " correctly");
			System.out.println("BEST LUCK NEXT TIME");

		}
	}

}
