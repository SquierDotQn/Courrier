package lettres;

import courrier.Text;
/**
 * Class for the receipt acknowledgment letter, a simple letter.
 * 
 * @author Théo Plockyn - Marion Tommasi
 */
public class ReceiptAcknowledgmentLetter extends SimpleLetter {
	/**
	 * Constructor
	 * @param rl
	 * 			the registered letter this letter responds to
	 */
	public ReceiptAcknowledgmentLetter(RegisteredLetter rl) {
		super(rl.reciever, rl.sender, new Text(rl.reciever + " received a registered letter from "+rl.sender));
	}
	
	@Override
	public String toString(){
		return "receipt acknowledgment letter";
	}

}
