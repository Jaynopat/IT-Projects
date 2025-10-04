package BMO_Banking_System;

public class Account__Abstract_ extends InvestmentAccount {
	private String _accountNumber;
	private double _balance;
	private Date _dateOpened;

	public double getBalance() {
		return this._balance;
	}
}