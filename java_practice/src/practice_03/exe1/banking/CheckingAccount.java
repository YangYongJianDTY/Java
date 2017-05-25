package practice_03.exe1.banking;

public class CheckingAccount extends Account{
	private double overdraftProtection;

	public CheckingAccount(double balance) {
		super(balance);
	}
	public CheckingAccount(double balance, double protect) {
		super(balance);
		this.overdraftProtection = protect;
	}
	public boolean withdraw(double amount) {
	    boolean result = true;
	    if ( balance >= amount ) {
	      balance = balance - amount;
	    } else if(overdraftProtection < 0 ||
	    		  amount > balance + overdraftProtection) {
	    	return false;
	    } else {
	      balance = 0;
	      overdraftProtection = amount - balance;
	    }
	    return result;
	  }

}
