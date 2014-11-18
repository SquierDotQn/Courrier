package lettres;

import static org.junit.Assert.*;

import org.junit.Test;

import courrier.BankAccount;

public class UrgentLetterTest extends AbstractLetterDecoratorTest {

	@Test
	public void testGetCost() {
		assertEquals(exampleLetter.getCost()*2, l.getCost(), 0.1);
	}

	@Test
	public void testToString() {
		assertEquals("urgent letter", l.toString());
	}

	@Override
	public Letter<?> createLetter() {
		return new UrgentLetter(exampleLetter);
	}
	

}
