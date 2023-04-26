package hangmanGame;

import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;

public class GuesStudentGamemain {

	public static void main(String[] args) throws IOException {
		int wrong = 0;
		int correct = 0;
		boolean match = false;
		int numberOfLetters = 0;
		char[] wrongLetters = new char[5];
		char letter = '$';
		char previousLetter = '$';

		Scanner sc = new Scanner(System.in);
		GuesStudentGame game = new GuesStudentGame();
		String randomTitle = game.getRandomName();
		numberOfLetters = randomTitle.length();
		char underScore[] = game.populateArraywithUnderScore(randomTitle);
		System.out.println("WELCOME TO STUDENT GUESS GAMING");
		System.out.println("The Name has " + randomTitle.length() + " letters");

		char[] randomArr = game.convertRandomString(randomTitle);

		for (int i = 0; i < 26; i++) {
			letter = game.getGuessingletter(correct, wrong, underScore, wrongLetters);
			letter = Character.toUpperCase(letter);
			if (game.checkIfLetterRepeated(letter, (wrong + correct))) {
				System.out.println("you have already tried this letter. try different one.");
				letter = game.getGuessingletter(correct, wrong, underScore, wrongLetters);
				letter = Character.toUpperCase(letter);
			}
			match = game.verifyTheCharacter(randomArr, letter);
			if (match) {
				correct++;
				game.updateUnderScore(underScore, randomArr, letter);

			} else {
				wrong++;
				game.populateWrongLettersArr(wrong, wrongLetters, letter);
			}
			if (wrong >= 5 || !game.checkIfWordComplete(underScore, randomArr)) {
				break;
			}
			game.populateNumberOfletters(letter, (wrong + correct));

		}
		if (!game.checkIfWordComplete(underScore, randomArr)) {
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
