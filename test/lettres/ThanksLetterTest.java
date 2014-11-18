package lettres;

import static org.junit.Assert.*;

import org.junit.Test;

import courrier.Money;

public class ThanksLetterTest extends SimpleLetterTest {

	@Test
	public void testToString() {
		assertEquals("thanks letter", l.toString());
	}
	

	@Override
	public Letter<?> createLetter() {
		return new ThanksLetter(new PromissoryNote(mockIn1, mockIn2, new Money(1)));
	}

}
