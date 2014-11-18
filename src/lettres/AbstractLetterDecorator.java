package lettres;

import courrier.Inhabitant;

/**
 * Abstract class for the special letters to contain other letters.
 * 
 * @author Théo Plockyn - Marion Tommasi
 *
 * @param <T>
 *            any letter that we want to put in a special letter
 */
public abstract class AbstractLetterDecorator<T extends Letter<?>> extends Letter<T> {
	/**
	 * Constructor.
	 * 
	 * @param sender
	 *            the inhabitant sending the letter
	 * @param reciever
	 *            the inhabitant receiving the letter
	 * @param content
	 *            the content of the letter
	 */
	public AbstractLetterDecorator(Inhabitant sender, Inhabitant reciever,
			T content) {
		super(sender, reciever, content);
	}
	
	

}
