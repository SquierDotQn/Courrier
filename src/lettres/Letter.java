package lettres;

import courrier.Content;
import courrier.Inhabitant;

public abstract class Letter<T extends Content> {
	T content;
	Inhabitant receiver;
	Inhabitant sender;

	
	public Letter(Inhabitant sender, Inhabitant reciever, T content){
		this.content = content;
		this.receiver= reciever;
		this.sender  = sender;
	}
	
	public void action(){
		
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
	
	public String toString(){
		return "From : "+sender+" to : "+receiver+" :\n content : "+content;
	}
	
}
