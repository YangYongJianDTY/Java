package com.chapter4.banking;

public class Account {
	
	private double balance;
	
	public Account(double init_balance)
	{
		balance = init_balance;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void deposit(double amt)
	{
		balance += amt;
	}
	
	public void withdraw(double amt)
	{
		if(amt <= balance)
			balance -= amt;
		else {
			System.out.println("ȡǮ�������!");
		}
	}
	
	

	public static void main(String[] args) {
		Account a = new Account(2000);
		System.out.println(a.getBalance());
		a.deposit(3000);
		System.out.println(a.getBalance());
		a.withdraw(3000);
		System.out.println(a.getBalance());

	}

}
