package courrier;

import static org.junit.Assert.*;
import lettres.Letter;
import lettres.SimpleLetter;

import org.junit.Before;
import org.junit.Test;

public class CityTest {

	City lille;
	Letter<?> letter;
	Inhabitant sender;
	Inhabitant receiver;
	
	@Before
	public void initialisation() {
		lille = new City("Lille");
		letter = new SimpleLetter(sender, receiver, null);
	}

	@Test
	public void testGetName() {
		assertEquals("Lille", lille.getName());
	}

	@Test
	public void testSendLetter() {
		lille.sendLetter(letter);
		assertEquals(letter, lille.getLetterBox().get(0));
	}

	@Test
	public void testAddInhabitant() {
		lille.addInhabitant(receiver);
		assertEquals(receiver, lille.getInhabitants().get(0));
	}

	@Test
	public void testDistributeLetter() {
		lille.distributeLetter();
		assertTrue(lille.getLetterBox().isEmpty());
	}
}
