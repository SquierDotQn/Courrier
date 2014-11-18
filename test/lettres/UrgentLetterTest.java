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
	
	@Test
	public void testAction() {
		float expectedMoneyIn1 = mockIn1.getAccount().getAccount()-exampleMoney.getValue();
		float expectedMoneyIn2 = mockIn2.getAccount().getAccount()+exampleMoney.getValue()-SimpleLetter.DEFAULT_COST;
		
		l.action();
		
		float resultMoneyIn1 = mockIn1.getAccount().getAccount();
		float resultMoneyIn2 = mockIn2.getAccount().getAccount();
		assertEquals(expectedMoneyIn1,resultMoneyIn1,0.1);
		assertEquals(expectedMoneyIn2,resultMoneyIn2,0.1);
	}

}
