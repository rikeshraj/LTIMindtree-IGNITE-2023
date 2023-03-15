public class Customer {
	private String name, account;
	private double balance = 0;
	private static int noOfTransactions = 0;

	Customer() {}

	Customer(String name, String account, double balance) {
		this.name = name;
		this.account = account;
		this.balance = balance;
	}

	void deposit(double amount) {
		balance += amount;
		noOfTransactions++;
		System.out.println("Your balance after the transaction is : " + balance);
	}

	void withdrawal(double amount) {
		if(amount>balance) {
			System.out.println("Insufficient Balance");
			return;
		}
		else {
			balance -= amount;
			noOfTransactions++;
			System.out.println("Your balance after the transaction is : " + balance);
		}
	}

	void setName(String name) {
		this.name=name;
	}
	String getName() {
		return name;
	}
	void setAccount(String account) {
		this.account = account;
	}
	String getAccount() {
		return account;
	}
	void setBalance(double balance) {
		this.balance = balance;
	}
	double getbalance() {
		return balance;
	}
	int getNoOfTransactions() {
		return noOfTransactions;
	}
}
