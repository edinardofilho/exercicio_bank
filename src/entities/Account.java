package entities;

public class Account {
	private int number;
	private String holder;
	private double balance;
	private static final double WITHDRAW_TAX = 5.00;
	
	public Account(int number, String holder, double deposit) {
		this.number = number;
		this.holder = holder;
		depositOpperation(deposit);
	}

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public int getnumber() {
		return number;
	}

	public String getholder() {
		return holder;
	}

	public void setholder(String holder) {
		this.holder = holder;
	}
	
	public double getbalance() {
		return balance;
	}
	
	public void depositOpperation(double deposit) {
		balance += deposit;
	}
	
	public void withdrawOpperation(double withdraw) {
		balance -= (withdraw + WITHDRAW_TAX);
	}

	public String toString() {
		return "Account " 
				+ number 
				+ ", Holder: " 
				+ holder 
				+ ", Balance: "
				+ String.format("%.2f",balance);
	}
	
	//Test Comment
}
