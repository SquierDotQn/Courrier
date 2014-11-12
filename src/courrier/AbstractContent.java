package courrier;

public abstract class AbstractContent<T> implements Content {

	private T value;
	
	public AbstractContent (T val) {
		this.value = val;
	}
	
	public T getValue() {
		return this.value;
	}
}
