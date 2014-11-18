package courrier;

import exception.NegatifAmountException;
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
	 * @throws NegatifAmountException 
	 */
	public void credit(float amount) throws NegatifAmountException {
		if (amount >= 0)
			this.account += amount;
		else
			throw new NegatifAmountException();
	}

	/**
	 * Subtracts money to the bank account.
	 * 
	 * @param amount
	 *            the amount of money to substract.
	 * @throws NegatifAmountException 
	 * @throws NotEnoughMoneyException 
	 */
	public void debit(float amount) throws NegatifAmountException, NotEnoughMoneyException {
		if (amount >=0) {
			if (account - amount >= 0)
				this.account -= amount;
			else
				throw new NotEnoughMoneyException();
		}
		else 
			throw new NegatifAmountException(); 
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
