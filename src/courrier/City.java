package courrier;

import java.util.List;

import lettres.Letter;

public class City {

	private String name;
	private List<Letter<?>> letterBox;
	private List<Inhabitant> inhabitants;

	public String getName() {
		return name;
	}

	public List<Letter<?>> getLetterBox() {
		return letterBox;
	}

	public List<Inhabitant> getInhabitants() {
		return inhabitants;
	}
	
	public City(String name){
		this.name = name;
	}
	
	public void sendLetter(Letter<?> letter) {
		this.letterBox.add(letter);
	}
	
	public void distributeLetter() {
		for(Letter<?> l : this.letterBox) {
			l.getDestinataire().receiveLetter(l);
		}
	}
	
	public void addInhabitant(Inhabitant newcommer) {
		getInhabitants().add(newcommer);
	}

}
