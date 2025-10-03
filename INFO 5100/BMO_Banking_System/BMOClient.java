package BMO_Banking_System;

import java.util.Vector;
import BMO_Banking_System.CheckingAccount;

public class BMOClient extends Minor {
	private date _clientSince;
	private int _loyaltyPoints;
	private String _clientStatus;
	public LoyaltyProgram _participates_in;
	public Vector<CheckingAccount> _owns = new Vector<CheckingAccount>();

	public void addLoyalPoints(int aPoints) {
		throw new UnsupportedOperationException();
	}

	public boolean redeemPoints(int aPoints) {
		throw new UnsupportedOperationException();
	}
}