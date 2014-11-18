package lettres;

import org.junit.Before;
import org.junit.Test;

import courrier.City;
import courrier.Content;
import courrier.Inhabitant;

public abstract class LetterTest {
	Letter<?> l;
	Inhabitant mockIn1;
	Inhabitant mockIn2;
	City testCity;
	public abstract Letter<?> createLetter();
	
	@Before
	public void setUp(){
		testCity = new City("testCity");
		mockIn1 = new Inhabitant("mockIn1", testCity);
		mockIn2 = new Inhabitant("mockIn2", testCity);
		l = createLetter();
	}

	@Test
	public void testGetContent(){
		assert((l.getContent() instanceof Content));
	}
	
}
