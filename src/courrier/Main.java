package courrier;

import lettres.*;

public class Main {

	public static void main(String[] args) {
		City villeneuve = new City("Villeneuve d'Ascq");
		Inhabitant theo = new Inhabitant("Theo", villeneuve);
		Inhabitant marion = new Inhabitant("Marion", villeneuve);
		Text message = new Text("Bonjour !");
		Letter<Text> salut = new SimpleLetter(marion, theo, message);
		marion.postsLetter(salut);
		villeneuve.distributeLetter();
		Money content = new Money(10);
		Letter<Money> present = new PromissoryNote(theo, marion, content);
		theo.postsLetter(present);
		villeneuve.distributeLetter();
		// There's a thanks letter in the city's mailbox
		Letter<?> urgent = new UrgentLetter(salut);
		marion.postsLetter(urgent);
		villeneuve.distributeLetter();
		Letter<?> registered = new RegisteredLetter(present);
		theo.postsLetter(registered);
		villeneuve.distributeLetter();
		// There's a thanks letter and a receipt in the city's mailbox
		villeneuve.distributeLetter();
		
		
	}
}
