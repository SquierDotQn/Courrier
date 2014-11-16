package lettres;

import courrier.Content;
import courrier.Inhabitant;

public abstract class Letter<T extends Content> implements Content {
	T content;
	Inhabitant receiver;
	Inhabitant sender;

	
	public Letter(Inhabitant sender, Inhabitant reciever, T content){
		this.content = content;
		this.receiver= reciever;
		this.sender  = sender;
	}
	
	public void action(){
		System.out.println(this);
	}
	
	public T getContent(){
		return content;
	}
	
	public abstract float getCost();
	
	public Inhabitant getReceiver(){
		return receiver;
	}
	
	public Inhabitant getSender(){
		return sender;
	}
	
}
