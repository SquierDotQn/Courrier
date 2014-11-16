package courrier;

/**
 * Class for the money. The money is a Double that can be send in a letter.
 * 
 * @author Théo Plockyn - Marion Tommasi
 *
 */
public class Money extends AbstractContent<Float> {

	public Money(float sum) {
		super(sum);
	}
	
	@Override
	public String toString(){
		return "Money : "+super.getValue();
	}
	
}
