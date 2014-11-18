package courrier;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exception.NegativeAmountException;
import exception.NotEnoughMoneyException;

public class BankAccountTest {

	BankAccount ba;
	double first_amount;
	
	@Before
	public void initialisation() {
		ba = new BankAccount();
		first_amount = ba.getAccount(); //permet de garder un test valable si la valeur de base d'un compte change.
	}
	
	@Test
	public void testCredit() {
		try {
			ba.credit(20);
		} catch (NegativeAmountException e) {
			e.printStackTrace();
			fail("Should never happen");
		}
		assertEquals(first_amount+20, ba.getAccount(), 0.0001);
	}
	
	@Test(expected=NegativeAmountException.class)
	public void testCreditNegative() throws NegativeAmountException, NotEnoughMoneyException {
		ba.credit(-1);
	}
	
	@Test
	public void testDebit() {
		try {
			ba.debit(50);
		} catch (NotEnoughMoneyException | NegativeAmountException e) {
			fail("Should never happen");
		}
		assertEquals(first_amount-50, ba.getAccount(), 0.0001);
	}
	
	@Test(expected=NotEnoughMoneyException.class)
	public void testDebitTooMuch() throws NegativeAmountException, NotEnoughMoneyException {
		ba.debit(50000000);
	}
	
	@Test(expected=NegativeAmountException.class)
	public void testDebitNegative() throws NegativeAmountException, NotEnoughMoneyException {
		ba.debit(-1);
	}

	
}
