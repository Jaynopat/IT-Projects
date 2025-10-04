package BMO_Banking_System;

public class InvestmentAccount {
	private String _nickName;
	private double _portfolioValue;

	public void setNickName(String aName) {
		this._nickName = aName;
	}

	public void buyStock(String aSymbol, int aShares) {
		throw new UnsupportedOperationException();
	}

	public void sellStock(String aSymbol, int aShares) {
		throw new UnsupportedOperationException();
	}
}