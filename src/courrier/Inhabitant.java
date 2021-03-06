package courrier;

import exception.NegativeAmountException;
import exception.NotEnoughMoneyException;
import lettres.Letter;

/**
 * Class for the inhabitants. An inhabitant lives in a city and can post and
 * receive letters.
 * 
 * @author Théo Plockyn - Marion Tommasi
 *
 */
public class Inhabitant {

	private String name;
	private City address;
	private BankAccount account;

	/**
	 * Constructor.
	 * 
	 * @param name
	 *            the name of the inhabitant
	 * @param address
	 *            the city where lives the inhabitant
	 */
	public Inhabitant(String name, City address) {
		this.address = address;
		this.account = new BankAccount();
		this.name = name;
		address.addInhabitant(this);
	}

	/**
	 * 
	 * @return the name of the inhabitant
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @return the city where lives the inhabitant
	 */
	public City getAdress() {
		return address;
	}

	/**
	 * 
	 * @return the bank account of the inhabitant
	 */
	public BankAccount getAccount() {
		return account;
	}

	public void debit(float amount) throws NotEnoughMoneyException {
		try {
			this.account.debit(amount);
			System.out.println(amount + " was debited from " + this.name
					+ "'s account, whose balance is now "
					+ this.account.getAccount() + ".");
		} catch (NegativeAmountException e) {
			System.out
					.println("Don't try to rip off the bank ! You can't debit a negative amount of money.");
		}
	}

	public void credit(float amount) throws NegativeAmountException {
		this.account.credit(amount);
		System.out.println(amount + " was credited onto " + this.name
				+ "'s account, whose balance is now "
				+ this.account.getAccount() + ".");
	}


	/**
	 * Posts a letter.
	 * 
	 * @param letter
	 *            the letter sent
	 */
	public void postsLetter(Letter<?> letter) {
		try {
			this.debit(letter.getCost());
			this.address.sendLetter(letter);
			System.out.println(this.name + " mails a " + letter);
		} catch (NotEnoughMoneyException e) {
			System.out.println(this.name + "can't post a " + letter
					+ ". It's too expensive !");
		}
	}

	/**
	 * Receives a letter.
	 * 
	 * @param letter
	 *            the letter received
	 */
	public void receiveLetter(Letter<?> letter) {
		System.out.println(letter.getReceiver() +" received a "+letter+" from "+ letter.getSender()+" containing "+letter.getContent());
		letter.action();
	}

	public String toString() {
		return this.getName();
	}

}
