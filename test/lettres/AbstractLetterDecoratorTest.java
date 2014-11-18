package lettres;

import courrier.Money;

public abstract class AbstractLetterDecoratorTest extends LetterTest {
	protected Money exampleMoney = new Money(10);
	protected Letter<?> exampleLetter = new PromissoryNote(mockIn1, mockIn2, exampleMoney);

}
