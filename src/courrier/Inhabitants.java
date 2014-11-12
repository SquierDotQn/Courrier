package courrier;

import lettres.Letter;

public class Inhabitant {

	private String name;
	private City address;
	private BankAccount account;

	public Inhabitant(String name, City address, BankAccount account) {
		this.address = address;
		this.account = account;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public City getAdress() {
		return address;
	}

	public BankAccount getAccount() {
		return account;
	}

	public void postsLetter(Letter<?> letter) {
		this.account.debit(letter.getCout());
		this.address.sendLetter(letter);
	}

	public void receiveLetter(Letter<?> letter) {
		letter.action();
	}

}
