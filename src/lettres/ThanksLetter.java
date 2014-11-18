package lettres;

import courrier.Text;
/**
 * Class for the thanks letter, a simple letter.
 * 
 * @author Théo Plockyn - Marion Tommasi
 */
public class ThanksLetter extends SimpleLetter {

	/**
	 * Constructor
	 * @param pn
	 * 			the promissory note this letter responds to
	 */
	public ThanksLetter(PromissoryNote pn) {
		super(pn.reciever,pn.sender, new Text("Thanks "+pn.sender.getName()+" !"));
	}

	@Override
	public String toString(){
		return "thanks letter";
	}
	
}
