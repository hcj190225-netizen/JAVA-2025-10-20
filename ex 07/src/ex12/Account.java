package ex12;

public class Account {

	public static Account account;

	private int balance;
	
	static final int MIT_BALANCE=0;
	static final int MAX_BALANCE=1000000;
	public Account() {
		
	}
	public int getBalance(){
		return balance;
	}
	
	public void setBalance(int balance) {
		
		if(balance>= MIT_BALANCE && balance<=MAX_BALANCE) {
			this.balance= balance;
		}
		
	}
	
	
}
