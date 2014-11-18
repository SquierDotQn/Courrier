package lettres;

import org.junit.Test;

import courrier.Inhabitant;
import courrier.Text;
import static org.junit.Assert.*;

public abstract class AbstractLetterDecoratorTest extends LetterTest {
	protected Text exampleText = new Text("test");
	protected Letter<?> exampleLetter = new SimpleLetter(mockIn1, mockIn2,
			exampleText);
	
}
