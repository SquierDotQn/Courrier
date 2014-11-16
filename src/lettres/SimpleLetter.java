package lettres;

import courrier.Inhabitant;
import courrier.Text;


public class SimpleLetter extends Letter<Text> {

	private float DEFAULT_COST=1;

	public SimpleLetter(Inhabitant sender, Inhabitant reciever, Text content) {
		super(sender, reciever, content);
	}
	
	public void action(){
		super.action();
	}
	
	public float getCost(){
		return DEFAULT_COST;
	}
	
	@Override
	public String toString(){
		return "simple letter";
	}
	
}
