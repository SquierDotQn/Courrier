package lettres;

import org.junit.Test;

import courrier.Inhabitant;
import courrier.Money;
import courrier.Text;
import static org.junit.Assert.*;

public abstract class AbstractLetterDecoratorTest extends LetterTest {
	protected Text exampleText = new Text("test");
	protected Letter<?> exampleLetter = new SimpleLetter(mockIn1,mockIn2, exampleText)/*new PromissoryNote(mockIn1, mockIn2, exampleMoney)*/;

	@Test
	public void testAction() {
		assertEquals(exampleText, exampleLetter.content);
		l.action(); // In the MockUpLetter action, the content is changed
		assertNotEquals(exampleText, exampleLetter.content);
	}

}

class MockUpLetter extends SimpleLetter{

	public MockUpLetter(Inhabitant sender, Inhabitant reciever, Text content) {
		super(sender, reciever, content);
	}
	
	@Override
	public void action(){
		content = new Text("mock");
	}
	
}
