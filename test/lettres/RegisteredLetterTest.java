package lettres;

import static org.junit.Assert.*;

import org.junit.Test;

public class RegisteredLetterTest extends AbstractLetterDecoratorTest {

	@Test
	public void testGetCost() {
		assertEquals(exampleLetter.getCost()+15, l.getCost(), 0.1);
	}

	@Test
	public void testToString() {
		assertEquals("registered letter", l.toString());
	}

	@Override
	public Letter<?> createLetter() {
		return new RegisteredLetter(exampleLetter);
	}

}
