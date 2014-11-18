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

	}
}
