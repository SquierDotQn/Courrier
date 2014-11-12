package courrier;

/**
 * Class for the bank account. A bank account is used to manage the money of the
 * inhabitants of a city who can post letters.
 * 
 * @author Théo Plockyn - Marion Tommasi
 *
 */
public class BankAccount {

	private static final double DEFAULT_ACCOUNT = 100;
	private double account;

	/**
	 * A bank account is initialized with a certain amount of money (100).
	 */
	public BankAccount() {
		this.account = DEFAULT_ACCOUNT;
	}

	/**
	 * Adds money to the bank account.
	 * 
	 * @param amount
	 *            the amount of money to add.
	 */
	public void credit(int amount) {
		this.account += amount;
	}

	/**
	 * Subtracts money to the bank account.
	 * 
	 * @param amount
	 *            the amount of money to substract.
	 */
	public void debit(int amount) {
		this.account -= amount;
	}

	/**
	 * Returns the amount of money in the bank account.
	 * 
	 * @return the actual amount of money in the bank account.
	 */
	public double getAccount() {
		return this.account;
	}

}
