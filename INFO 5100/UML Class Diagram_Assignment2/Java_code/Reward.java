package BMO_Banking_System;

public class Reward {
	private String _rewardId;
	private String _description;
	private int _pointsRequired;
	public LoyaltyProgram _offers;

	public String getDescription() {
		return this._description;
	}

	public boolean isAvailable() {
		throw new UnsupportedOperationException();
	}
}