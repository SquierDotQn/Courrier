package lettres;

import static org.junit.Assert.*;

import org.junit.Test;

import courrier.Money;
import courrier.Text;

public class PromissoryNoteTest extends LetterTest {
	private int testMoney = 1;
	@Test
	public void testGetCost() {
		assertEquals((1.0+(0.1*testMoney)), l.getCost(), 0.1);
	}

	@Test
	public void testToString() {
		assertEquals("promissory note", l.toString());
	}

	@Override
	public Letter<?> createLetter() {
		return new PromissoryNote(mockIn1, mockIn2, new Money(testMoney));
	}

}
