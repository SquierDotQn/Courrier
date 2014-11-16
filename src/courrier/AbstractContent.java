package courrier;

/**
 * Abstract class for the content of a letter.
 * 
 * @author Théo Plockyn - Marion Tommasi
 *
 * @param <T>
 *            any object that we want to put in a letter (String, Float,
 *            Integer, Double, ...)
 */
public abstract class AbstractContent<T> implements Content {

	private T value;

	public AbstractContent(T val) {
		this.value = val;
	}

	public T getValue() {
		return this.value;
	}
	
}
