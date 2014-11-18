package lettres;

import static org.junit.Assert.*;

import org.junit.Test;

import courrier.Money;
import courrier.Text;

public class ReceiptAcknowledgmentLetterTest extends SimpleLetterTest {

	@Test
	public void testToString() {
		assertEquals("receipt acknowledgment letter", l.toString());
	}
	

	@Override
	public Letter<?> createLetter() {
		return new ReceiptAcknowledgmentLetter(new RegisteredLetter(new SimpleLetter(mockIn1, mockIn2, new Text("toto"))));
	}
}
