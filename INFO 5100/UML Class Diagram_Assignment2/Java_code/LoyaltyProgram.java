package BMO_Banking_System;

import java.util.Vector;
import BMO_Banking_System.Reward;

public class LoyaltyProgram {
	private String _programName;
	private double _pointsPerDollar;
	public Vector<Reward> _offers = new Vector<Reward>();

	public int calculatedPoints(double aAmount) {
		throw new UnsupportedOperationException();
	}

	public Reward redeemReward(int aPoints) {
		throw new UnsupportedOperationException();
	}

	public List getAvailableRewards() {
		throw new UnsupportedOperationException();
	}
}