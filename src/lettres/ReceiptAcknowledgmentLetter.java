package lettres;

import courrier.Text;

public class ReceiptAcknowledgmentLetter extends SimpleLetter {

	public ReceiptAcknowledgmentLetter(RegisteredLetter rl) {
		super(rl.receiver, rl.sender, new Text(rl.receiver + " received a registered letter from "+rl.sender));
	}
	
	@Override
	public String toString(){
		return "receipt acknowledgment letter";
	}

}
