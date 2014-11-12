package lettres;

import courrier.Inhabitant;
import courrier.Text;

public class ThanksLetter extends SimpleLetter {

	public ThanksLetter(PromissoryNote pn) {
		super(pn.receiver,pn.sender, new Text("Thanks "+pn.sender.getName()+" !"));
	}

}
