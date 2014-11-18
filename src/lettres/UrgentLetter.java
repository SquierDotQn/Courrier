package lettres;
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
	public UrgentLetter(Letter<?> content) {
		super(content);
	}

	@Override
	public float getCost() {
		return content.getCost()*2;
	}
	
	@Override
	public String toString(){
		return "urgent letter";
	}

}
