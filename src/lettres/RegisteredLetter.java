package lettres;

import courrier.Inhabitant;

public class RegisteredLetter<T extends Letter<?>> extends AbstractLetterDecorator<T> {

	public RegisteredLetter(Inhabitant sender, Inhabitant reciever, T content) {
		super(sender, reciever, content);
	}

	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return 0;
	}

}
