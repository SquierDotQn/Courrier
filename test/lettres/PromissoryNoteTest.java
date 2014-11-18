package lettres;

import static org.junit.Assert.*;

import org.junit.Test;

import courrier.Money;
import courrier.Text;

public class PromissoryNoteTest extends LetterTest {
	private Money testMoney = new Money(1);
	@Test
	public void testGetCost() {
		assertEquals((1.0+(0.1*testMoney.getValue())), l.getCost(), 0.1);
	}

	@Test
	public void testToString() {
		assertEquals("promissory note", l.toString());
	}

	@Override
	public Letter<?> createLetter() {
		return new PromissoryNote(mockIn1, mockIn2, testMoney);
	}

	@Test
	public void testAction() {
		float expectedMoneyIn1 = mockIn1.getAccount().getAccount()-testMoney.getValue();
		float expectedMoneyIn2 = mockIn2.getAccount().getAccount()+testMoney.getValue()-SimpleLetter.DEFAULT_COST;
		
		l.action();
		
		float resultMoneyIn1 = mockIn1.getAccount().getAccount();
		float resultMoneyIn2 = mockIn2.getAccount().getAccount();
		assertEquals(expectedMoneyIn1,resultMoneyIn1,0.1);
		assertEquals(expectedMoneyIn2,resultMoneyIn2,0.1);
	}
	
}
