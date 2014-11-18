package lettres;

import courrier.Inhabitant;
import courrier.Money;
/**
 * Class for the promissory letter, containing money.
 * 
 * @author Théo Plockyn - Marion Tommasi
 */
public class PromissoryNote extends Letter<Money> {

	public final float DEFAULT_COST = (float) (1.0+(0.1*content.getValue()));
	
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
	public PromissoryNote(Inhabitant sender, Inhabitant reciever, Money content) {
		super(sender, reciever, content);
	}

	/**
	 * 
	 * @return the price of sending the letter
	 */
	@Override
	public float getCost(){
		return DEFAULT_COST;
	}

	/**
	 * Do the action :
	 * - debit the sender of the money contained in the letter
	 * - debit the sender of the money contained in the letter
	 * - posts a thanks letter from receiver to the sender 
	 */
	@Override
	public void action(){
		super.action();
		sender.getAccount().debit(content.getValue());
		reciever.getAccount().credit(content.getValue());
		reciever.postsLetter(new ThanksLetter(this));
	}
	
	@Override
	public String toString(){
		return "promissory note";
	}
}
