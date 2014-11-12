package lettres;

import courrier.Inhabitant;
import courrier.Money;

public class PromissoryNote extends Letter<Money> {

	private final float DEFAULT_COST = 1+(0.1*content.getValue());
	
	public PromissoryNote(Inhabitant sender, Inhabitant reciever, Money content) {
		super(sender, reciever, content);
	}

	public float getCost(){
		return DEFAULT_COST;
	}
	
	public String toString(){
		return super.toString();
	}
	
	public void action(){
		sender.getAccount().debit(content.getValue());
		receiver.getAccount().credit(content.getValue());
		sender.postsLetter(new ThanksLetter(this));
	}
	
	
}
