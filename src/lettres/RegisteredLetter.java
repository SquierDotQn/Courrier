package lettres;

import courrier.Inhabitant;
/**
 * Class for the registered letter, containing another letter.
 * 
 * @author Théo Plockyn - Marion Tommasi
 */
public class RegisteredLetter extends AbstractLetterDecorator<Letter<?>> {
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
	public RegisteredLetter(Inhabitant sender, Inhabitant reciever, Letter<?> content) {
		super(sender, reciever, content);
	}

	@Override
	public float getCost() {
		return content.getCost()+15;
	}
	
	/**
	 * posts a receipt acknowledgment letter from the reciever to the sender 
	 */
	@Override
	public void action(){
		reciever.postsLetter(new ReceiptAcknowledgmentLetter(this));
	}
	
	@Override
	public String toString(){
		return "registered letter";
	}

}
