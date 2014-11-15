package courrier;

/**
 * Class for the money. The money is a Double that can be send in a letter.
 * 
 * @author Théo Plockyn - Marion Tommasi
 *
 */
public class Money extends AbstractContent<Double> {

	public Money(float sum) {
		super(sum);
	}
}
