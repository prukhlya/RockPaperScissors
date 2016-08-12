package com.opponent;

public class Canada  extends OpponentClass {

	
	public Canada() {
		super();
		this.opponentCountry = "Canada";
		this.opponentFlag = "#Moose";
		this.opponentName = "Waaayne";
		
		// TODO Auto-generated constructor stub
	}

	public Canada(String opponentName, String opponentFlag, String opponentCountry) {
		super(opponentName, opponentFlag, opponentCountry);
		// TODO Auto-generated constructor stub
	}

	public static int userThrewThis(String userThrow, int userValue) {
		if (userThrow.equalsIgnoreCase("R")) {
			System.out.print("You rolled rock!");
			userValue = 1;
		} else if (userThrow.equalsIgnoreCase("P")) {
			userValue = 2;
			System.out.print("You rolled paper!");
		} else if (userThrow.equalsIgnoreCase("S")) {
			userValue = 3;
			System.out.print("You rolled scissors!");
		}
		System.out.println(" ");
		return userValue;
	}
	
}
