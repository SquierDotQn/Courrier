package lettres;

import courrier.Inhabitant;
import courrier.Text;

/**
 * Class for the simple letter, containing text.
 * 
 * @author Théo Plockyn - Marion Tommasi
 */
public class SimpleLetter extends Letter<Text> {

	public static float DEFAULT_COST=1;

	public SimpleLetter(Inhabitant sender, Inhabitant reciever, Text content) {
		super(sender, reciever, content);
	}
	
	public void action(){
		super.action();
	}
	
	@Override
	public float getCost(){
		return DEFAULT_COST;
	}
	
	@Override
	public String toString(){
		return "simple letter";
	}
	
}
