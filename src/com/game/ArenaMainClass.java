package com.game;

import java.util.Random;
import java.util.Scanner;
import com.opponent.*;

public class ArenaMainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String userThrow = null;
		String userStart = null;
		int userValue = 0;
		String userPlayAgain = null;
		String opponentChoice = null;
		// userThrow String is the player's input for R, P or S
		// userStart String is the Y/N answer from user at the start, if they
		// want to play the game
		// userValue Int converts the userThrow into 1, 2 or 3 corresponding to
		// R, P, S
		// userPlayAgain is the input for if you want to play the game AGAIN - Y
		// starts game over, anything else ends the program
		System.out.println("Do you want to play a game of Rock, Paper, Scissors? Y/N?");
		userStart = sc.nextLine();
		System.out.println(" ");

		Italy choiceItaly = new Italy();
		Brazil choiceBrazil = new Brazil();
		Canada choiceCanada = new Canada();

		switch (userStart.toUpperCase()) {
		// For that first question of if you want to play, Y, runs through the
		// game, N stops the program
		case "Y":
			do { // begins the do-while that encompasses the user throw,
					// opponent (computer) random throw and the results
					// (win/lose/tie)
				// this mess below pull from the opponent classes when user
				// picks the country to battle
				System.out.println(
						"Opponents are lining up to test your skills! Pick the country of the challenger. Enter Italy, Canada or Brazil (write out full country name:");
				opponentChoice = sc.nextLine();
				if (opponentChoice.equalsIgnoreCase("italy")) {
					System.out.println("You have chosen to battle an opponent from " + choiceItaly.getOpponentCountry()
							+ ". Prepare to battle " + choiceItaly.getOpponentName() + ", rocking his "
							+ choiceItaly.getOpponentFlag() + " uniform.");
					System.out.println(" ");
				} else if (opponentChoice.equalsIgnoreCase("brazil")) {
					System.out.println("You have chosen to battle an opponent from " + choiceBrazil.getOpponentCountry()
							+ ". Prepare to battle " + choiceBrazil.getOpponentName() + ", rocking his "
							+ choiceBrazil.getOpponentFlag() + " uniform.");
					System.out.println(" ");
				} else if (opponentChoice.equalsIgnoreCase("canada")) {
					System.out.println("You have chosen to battle an opponent from " + choiceCanada.getOpponentCountry()
							+ ". Prepare to battle " + choiceCanada.getOpponentName() + ", rocking his "
							+ choiceCanada.getOpponentFlag() + " uniform.");
					System.out.println(" ");
				}
				// this section is the USER input and conversion of the input
				// into an INT
				System.out.println("Input R, P or S to chose your throw!");
				userThrow = sc.nextLine();
				
				userValue = Canada.userThrewThis(userThrow, userValue);  //stuck the user roll into the canada class and calling from there

				// this section is the opponent throw via randomizer to roll
				// either 1, 2 or 3. The INT is then converted to the
				// corresponding SYSOUT for rock/paper/scissors
				
				int rollValue = getRandomRoll(); //method call
				
				// this section compares the USER roll with the OPPONENT roll,
				// comparing the results as INTS of 1, 2 or 3
				if ((rollValue == 1) && ((userValue == 1))) {
					System.out.println("YOU TIE!");
				} else if ((rollValue == 1) && ((userValue == 2))) {
					System.out.println("YOU WIN!");
				} else if ((rollValue == 1) && ((userValue == 3))) {
					System.out.println("YOU LOSE! I question your patriotism.");
				} else if ((rollValue == 2) && ((userValue == 1))) {
					System.out.println("YOU LOSE! This is not the contact sport for you!");
				} else if ((rollValue == 2) && ((userValue == 2))) {
					System.out.println("YOU TIE!");
				} else if ((rollValue == 2) && ((userValue == 3))) {
					System.out.println("YOU WIN!");
				} else if ((rollValue == 3) && ((userValue == 1))) {
					System.out.println("YOU WIN!");
				} else if ((rollValue == 3) && ((userValue == 2))) {
					System.out.println("YOU LOSE! You are the weakest link.");
				} else if ((rollValue == 3) && ((userValue == 3))) {
					System.out.println("YOU TIE!");
				}
				System.out.println(" ");
				System.out.println("To play again, enter Y, otherwise enter any other key to end program.");
				System.out.println(" ");

				userPlayAgain = sc.nextLine();
			} while (userPlayAgain.equalsIgnoreCase("Y")); // if Y is selected
															// to the play again
															// question, the
															// program will run
															// again

			System.out.println(" ");
			System.out.println("Well, game over then. Thanks for playing!"); // if anything but Y is
															// selected, this
															// statement prints
															// and the program
															// ends
		case "N": 
			// if N is the answer to do you want to play, program ends -
					// nothing happens
			break; // this break ends the program if N is selected in the first
					// question
		}
		sc.close();
	} // main

	private static int getRandomRoll() {
		Random rand = new Random();
		int rollValue = rand.nextInt(3) + 1; // computer roll
		// System.out.println(rollValue);
		if (rollValue > 1 && rollValue < 3) {
			System.out.println("The challenger rolled paper!");
		} else if (rollValue > 0 && rollValue < 2) {
			System.out.println("The challenger rolled rock!");
		} else if (rollValue > 2 && rollValue < 4) {
			System.out.println("The challenger rolled scissors!");
		}
		return rollValue;
	}

	
} // class