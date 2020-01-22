
class Account{
	private String name;
	private int account_number;
	private int current_balance;
	private String address;
	private String type;
	private int initial_amount;
	
	public Account(String name,int account_number,int initial_amount) {
		this.name = name;
		this.account_number = account_number;
		this.initial_amount = initial_amount;
		this.current_balance = initial_amount;
	}

	public Account(String name, int account_number, String address, String type, int current_balance) {
		this.account_number = account_number;
		this.name = name;
		this.address = address;
		this.type = type;
		this.current_balance = current_balance;
	}
	
	public void Deposit(int deposit) {
		this.current_balance += deposit;
	}
	
	public void Withdraw(int withdraw) {
		if(withdraw > current_balance) {
			System.out.println("Can't withdraw");
		}
		else {
			this.current_balance -= withdraw;
		}
		return;
	}

	public int getCurrent_balance() {
		return current_balance;
	}
}

class AccessAccount extends Account{

	public AccessAccount(String name, int account_number, int initial_amount) {
		super(name, account_number, initial_amount);
	}

	public AccessAccount(String name, int account_number, String address, String type, int current_balance) {
		super(name, account_number, address, type, current_balance);
	}
	
}

public class Problem2{
	// TODO Auto-generated constructor stub
	static AccessAccount a = new AccessAccount("ab", 123, 1000);
	public static void main(String[] args) {
		int cb = a.getCurrent_balance();
		System.out.println(cb);
	}
	
}
