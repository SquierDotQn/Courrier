package lettres;

import courrier.Inhabitant;

public class UrgentLetter extends AbstractLetterDecorator<Letter<?>> {

	public UrgentLetter(Inhabitant sender, Inhabitant reciever, Letter<?> content) {
		super(sender, reciever, content);
	}

	@Override
	public float getCost() {
		return content.getCost()*2;
	}
	
	@Override
	public void action(){
		content.action();
	}
	
	@Override
	public String toString(){
		return "urgent letter";
	}

}
