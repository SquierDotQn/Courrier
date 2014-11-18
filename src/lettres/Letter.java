package lettres;

import courrier.Content;
import courrier.Inhabitant;
/**
 * Abstract class for the letter.
 * 
 * @author Théo Plockyn - Marion Tommasi
 *
 * @param <T>
 *            any object that we want to put in a letter (String, Float,
 *            Integer, Double, ...)
 */
public abstract class Letter<T extends Content> implements Content {
	T content;
	Inhabitant reciever;
	Inhabitant sender;

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
	public Letter(Inhabitant sender, Inhabitant reciever, T content){
		this.content = content;
		this.reciever= reciever;
		this.sender  = sender;
	}
	
	
	public void action(){
	}
	
	public T getContent(){
		return content;
	}
	
	/**
	 * 
	 * @return the price of sending the letter
	 */
	public abstract float getCost();
	
	/**
	 * 
	 * @return the inhabitant receiving the letter
	 */
	public Inhabitant getReceiver(){
		return reciever;
	}

	/**
	 * 
	 * @return the inhabitant sending the letter
	 */
	public Inhabitant getSender(){
		return sender;
	}
	
}
