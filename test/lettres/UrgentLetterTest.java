package lettres;

import static org.junit.Assert.*;

import org.junit.Test;

import courrier.BankAccount;

public class UrgentLetterTest extends AbstractLetterDecoratorTest {

	@Test
	public void testAction() {
		assertEquals(BankAccount.DEFAULT_ACCOUNT,mockIn1.getAccount().getAccount(),0.1);
		assertEquals(BankAccount.DEFAULT_ACCOUNT,mockIn2.getAccount().getAccount(),0.1);
		l.action();
	}

	@Test
	public void testGetCost() {
		assertEquals(exampleLetter.getCost()*2, l.getCost(), 0.1);
	}

	@Test
	public void testToString() {
		assertEquals("urgent letter", l);
	}

	@Override
	public Letter<?> createLetter() {
		return new UrgentLetter(exampleLetter);
	}

}
