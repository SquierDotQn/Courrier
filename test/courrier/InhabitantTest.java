package courrier;

import static org.junit.Assert.*;
import lettres.Letter;
import lettres.SimpleLetter;

import org.junit.Before;
import org.junit.Test;

public class InhabitantTest {

	Inhabitant totoro;
	Inhabitant calcifer;
	City theTree;
	float economies;
	Letter<?> letter;
	
	@Before
	public void initialsation() {
		theTree= new City("The great tree");
		totoro = new Inhabitant("Totoro", theTree);
		economies = totoro.getAccount().getAccount();
		letter = new SimpleLetter(totoro, calcifer, null);
	}
	
	@Test
	public void testGetters() {
		assertEquals("Totoro", totoro.getName());
		assertEquals(theTree, totoro.getAdress());
	}

	@Test
	public void testPostALetterDebitAccount(){
		totoro.postsLetter(letter);
		assertTrue(theTree.getLetterBox().contains(letter));
		assertEquals(economies-letter.getCost(), totoro.getAccount().getAccount(), 0.0001);
	}
}
