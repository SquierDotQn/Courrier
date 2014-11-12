package lettres;

import courrier.Inhabitant;

public class UrgentLetter<T extends Letter<?>> extends AbstractLetterDecorator<T> {

	public UrgentLetter(Inhabitant sender, Inhabitant reciever, T content) {
		super(sender, reciever, content);
	}

	@Override
	public float getCost() {
		return 0;
	}
	
	

}
