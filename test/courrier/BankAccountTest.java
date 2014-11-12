package courrier;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

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
		ba.credit(20);
		assertEquals(first_amount+20, ba.getAccount(), 0.0001);
	}
	
	@Test
	public void testDebit() {
		ba.debit(50);
		assertEquals(first_amount-50, ba.getAccount(), 0.0001);
	}

	
}
