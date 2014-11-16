package lettres;

import courrier.Inhabitant;

public abstract class AbstractLetterDecorator<T extends Letter<?>> extends Letter<T> {

	public AbstractLetterDecorator(Inhabitant sender, Inhabitant reciever,
			T content) {
		super(sender, reciever, content);
	}
	
	

}
