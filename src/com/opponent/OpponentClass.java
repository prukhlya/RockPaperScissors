package com.opponent;

import java.util.Random;

public abstract class OpponentClass {

	protected String opponentName = null;
	protected String opponentFlag = null;
	protected String opponentCountry = null;
	
	
	public OpponentClass(String opponentName, String opponentFlag, String opponentCountry) {
		super();
		this.opponentName = opponentName;
		this.opponentFlag = opponentFlag;
		this.opponentCountry = opponentCountry;
	}

	public OpponentClass() {
		super();
	}

	public String getOpponentName() {
		return opponentName;
	}

	public void setOpponentName(String opponentName) {
		this.opponentName = opponentName;
	}

	public String getOpponentFlag() {
		return opponentFlag;
	}

	public void setOpponentFlag(String opponentFlag) {
		this.opponentFlag = opponentFlag;
	}

	public String getOpponentCountry() {
		return opponentCountry;
	}

	public void setOpponentCountry(String opponentCountry) {
		this.opponentCountry = opponentCountry;
	}
	
	
}
