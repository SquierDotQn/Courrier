package courrier;

import exception.NegativeAmountException;
import exception.NotEnoughMoneyException;

/**
 * Class for the bank account. A bank account is used to manage the money of the
 * inhabitants of a city who can post letters.
 * 
 * @author Théo Plockyn - Marion Tommasi
 *
 */
public class BankAccount {

	private static final float DEFAULT_ACCOUNT = 100;
	private float account;

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
	 * @throws NegativeAmountException 
	 */
	public void credit(float amount) throws NegativeAmountException {
		if (amount >= 0)
			this.account += amount;
		else
			throw new NegativeAmountException();
	}

	/**
	 * Subtracts money to the bank account.
	 * 
	 * @param amount
	 *            the amount of money to substract.
	 * @throws NegativeAmountException 
	 * @throws NotEnoughMoneyException 
	 */
	public void debit(float amount) throws NegativeAmountException, NotEnoughMoneyException {
		if (amount >=0) {
			if (account - amount >= 0)
				this.account -= amount;
			else
				throw new NotEnoughMoneyException();
		}
		else 
			throw new NegativeAmountException(); 
	}

	/**
	 * Returns the amount of money in the bank account.
	 * 
	 * @return the actual amount of money in the bank account.
	 */
	public float getAccount() {
		return this.account;
	}

}
