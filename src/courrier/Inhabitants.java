package courrier;

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

	/**
	 * Posts a letter.
	 * 
	 * @param letter
	 *            the letter sent
	 */
	public void postsLetter(Letter<?> letter) {
		this.account.debit(letter.getCout());
		this.address.sendLetter(letter);
	}

	/**
	 * Receives a letter.
	 * 
	 * @param letter
	 *            the letter received
	 */
	public void receiveLetter(Letter<?> letter) {
		letter.action();
	}

}
