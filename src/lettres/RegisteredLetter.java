package lettres;

import courrier.Inhabitant;

public class RegisteredLetter extends AbstractLetterDecorator<Letter<?>> {

	public RegisteredLetter(Inhabitant sender, Inhabitant reciever, Letter<?> content) {
		super(sender, reciever, content);
	}

	@Override
	public float getCost() {
		return content.getCost()+15;
	}
	
	@Override
	public void action(){
		sender.postsLetter(new ReceiptAcknowledgmentLetter(this));
	}
	
	@Override
	public String toString(){
		return "registered letter";
	}

}
