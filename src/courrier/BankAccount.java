package courrier;

public class BankAccount {

	private static final float DEFAULT_ACCOUNT = 0;
	private float account;
	
	public BankAccount() {
		this.account = DEFAULT_ACCOUNT;
	}
	
	public void credit(int sum) {
		this.account += sum;
	}

	public void debit(int sum) {
		this.account += sum;
	}
	
	public float getAccount() {
		return this.account;
	}

}
