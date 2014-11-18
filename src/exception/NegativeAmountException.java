package exception;

public class NegativeAmountException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NegativeAmountException(){
		super("Can't have a negative amount");
	}

}
