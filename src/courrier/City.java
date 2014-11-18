package courrier;

import java.util.ArrayList;
import java.util.List;

import lettres.Letter;

/**
 * Class to modelize the mail management of a city.
 * 
 * @author Théo Plockyn - Marion Tommasi
 *
 */
public class City {

	private String name;
	private List<Letter<?>> letterBox;
	private List<Inhabitant> inhabitants;

	/**
	 * Constructor.
	 * 
	 * @param name
	 *            the name of the city
	 */
	public City(String name) {
		this.name = name;
		this.letterBox = new ArrayList<Letter<?>>();
		this.inhabitants = new ArrayList<Inhabitant>();
	}

	/**
	 * Gives the name of the city.
	 * 
	 * @return the name of the city
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the LetterBox of the city.
	 * 
	 * @return the List of the letters in the LetterBox
	 */
	public List<Letter<?>> getLetterBox() {
		return letterBox;
	}

	/**
	 * Returns the inhabitants of the city.
	 * 
	 * @return the List of the inhabitants
	 */
	public List<Inhabitant> getInhabitants() {
		return inhabitants;
	}

	/**
	 * Puts a letter in the letterBox.
	 * 
	 * @param letter
	 *            the letter to put in the letterBox
	 */
	public void sendLetter(Letter<?> letter) {
		this.letterBox.add(letter);
	}

	/**
	 * Delivers all the letter int the letterBox.
	 */
	public void distributeLetter() {
		System.out.println("It's time for mail delivery in " + this);
		for (Letter<?> l : this.letterBox) {
			l.getReceiver().receiveLetter(l);
		}
		this.letterBox.clear();
	}

	/**
	 * Adds an inhabitant to the list of inhabitants of a city.
	 * 
	 * @param newcommer
	 *            the inhabitant to add
	 */
	public void addInhabitant(Inhabitant newcommer) {
		System.out.println("Welcome to " + this + " " + newcommer + " !");
		getInhabitants().add(newcommer);
	}

	public String toString() {
		return this.getName();
	}
}
