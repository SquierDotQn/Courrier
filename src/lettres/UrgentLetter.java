package lettres;

import courrier.Inhabitant;
/**
 * Class for the urgent letter, containing another letter.
 * 
 * @author Théo Plockyn - Marion Tommasi
 */
public class UrgentLetter extends AbstractLetterDecorator<Letter<?>> {
	/**
	 * Constructor.
	 * 
	 * @param sender
	 *            the inhabitant sending the letter
	 * @param reciever
	 *            the inhabitant receiving the letter
	 * @param content
	 *            the content of the letter, which is a letter
	 */
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
