package practice_03.exe2.banking;

import practice_03.exe2.Customer;

public class Bank {
	private Customer[] customers;
	private int numberOfCustomers;
	
	public Bank() {
	    customers = new Customer[5];
	    numberOfCustomers = 0;
	}

	public void addCustomer(String f, String l) {
	    int i = numberOfCustomers++;
	    customers[i] = new Customer(f, l);
	}
	public Customer getCustomer(int customer_index) {
	    return customers[customer_index];
	}
	public int getNumOfCustomers() {
	    return numberOfCustomers;
	}

}
