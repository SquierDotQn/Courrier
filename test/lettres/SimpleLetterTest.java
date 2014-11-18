package lettres;

import static org.junit.Assert.*;

import org.junit.Test;

import courrier.Text;

public class SimpleLetterTest extends LetterTest {

	@Test
	public void testGetCost() {
		assertEquals(l.getCost(), SimpleLetter.DEFAULT_COST, 0.1);
	}

	@Test
	public void testToString() {
		assertEquals("simple letter", l.toString());
	}

	@Override
	public Letter<?> createLetter() {
		return new SimpleLetter(mockIn1, mockIn2, new Text("test"));
	}

}
