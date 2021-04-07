import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BankAccountTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		BankAccount SBI = new BankAccount("Elton", "9876543210", 10000);
		float bal = SBI.balance = 10000;
		
		assertTrue(bal>0);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDeposit() {
		BankAccount SBI = new BankAccount("Elton", "9876543210", 10000);
		int res = SBI.Deposit(2000);
		System.out.println("\n");
		System.out.println("After Depositing");
		SBI.getBalance();
		assertEquals(res, 12000);
	}

	@Test
	public void testWithdraw() {
		BankAccount SBI = new BankAccount("Elton", "9876543210", 10000);
		int res = SBI.Withdraw(8000);
		System.out.println("After Withdrawing");
		SBI.getBalance();
		assertEquals(res, 2000);
	}

	@Test
	public void testGetBalance() {
		BankAccount SBI = new BankAccount("Elton", "9876543210", 10000);
		System.out.println("Get Balance Test: \n");
		SBI.getBalance();
	}

}
