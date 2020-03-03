import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
/*Ryan Upham
 * Homework 2
 * Data Structures and Algorithms 
 * 2/9/2020
 * 2/10/2020
 */


class AccountTest {

	@Test
	void testSavings6Param() 
	{
		Savings s = new Savings("carlos", "social33", "adress34", "phone308", 7512, "accountNum666");
		assertEquals("carlos", s.getName());
		assertEquals("social33", s.getSocial());
		assertEquals("adress34", s.getAddress());
		assertEquals("phone308", s.getPhone());
		assertEquals(7512, s.getBalance());
		assertEquals("accountNum666", s.getAccountNum());
		
	}
	
	@Test
	void testSavings8Param() 
	{
		Savings s = new Savings("carlos", "social33", "adress34", "phone308", 7512, "accountNum666", .5, 20);
		assertEquals("carlos", s.getName());
		assertEquals("social33", s.getSocial());
		assertEquals("adress34", s.getAddress());
		assertEquals("phone308", s.getPhone());
		assertEquals(7512, s.getBalance());
		assertEquals("accountNum666", s.getAccountNum());
		assertEquals(.5, s.getInterestRate());
		assertEquals(20, s.getInterestPeriod());
	}
	
	@Test
	void testInterestAdded() 
	{
		Savings s = new Savings("carlos", "social33", "adress34", "phone308", 7512, "accountNum666", .5, 20);
		s.interestAdded();
		assertEquals(11268, s.getBalance());
	}
	
	@Test
	void testSetInterestRate() 
	{
		Savings s = new Savings("carlos", "social33", "adress34", "phone308", 7512, "accountNum666", .5, 20);
		s.setInterestRate(.3);
		assertEquals(.3, s.getInterestRate());
	}
	
	@Test
	void testChecking() 
	{
		Checking c = new Checking("carlos", "social33", "adress34", "phone308", 7512, "accountNum666");
		assertEquals("carlos", c.getName());
		assertEquals("social33", c.getSocial());
		assertEquals("adress34", c.getAddress());
		assertEquals("phone308", c.getPhone());
		assertEquals(7512, c.getBalance());
		assertEquals("accountNum666", c.getAccountNum());
	}
	
	@Test
	void testGetFees() 
	{
		assertEquals(5, Checking.getFees());	
	}
	
	@Test
	void testApplyFees() 
	{
		Checking c = new Checking("carlos", "social33", "adress34", "phone308", 7512, "accountNum666");
		c.applyFees();
		assertEquals(7507, c.getBalance());
	}
	
	@Test
	void testLoan() 
	{
		Loan l = new Loan("carlos", "social33", "adress34", "phone308", 7512, "accountNum666", .5, 250);
		assertEquals("carlos", l.getName());
		assertEquals("social33", l.getSocial());
		assertEquals("adress34", l.getAddress());
		assertEquals("phone308", l.getPhone());
		assertEquals(7512, l.getBalance());
		assertEquals("accountNum666", l.getAccountNum());
		assertEquals(.5, l.getInterestRate());
		assertEquals(250, l.getEndDate());
	}
	
	@Test
	void testMakePayment() 
	{
		Loan l = new Loan("carlos", "social33", "adress34", "phone308", 7512, "accountNum666", .5, 250);
		l.makePayment(488);
		assertEquals(8000, l.getBalance());
		assertEquals(249, l.getEndDate());
	}
	
	@Test
	void testApplyInterest() 
	{
		Loan l = new Loan("carlos", "social33", "adress34", "phone308", 7512, "accountNum666", .5, 250);
		l.applyInterest();
		assertEquals(11268, l.getBalance());
	}
	
	@Test
	void testPayOff() 
	{
		Loan l = new Loan("carlos", "social33", "adress34", "phone308", 7512, "accountNum666", .5, 250);
		l.payOff();
		assertEquals(0, l.getBalance());
		assertEquals(0, l.getEndDate());
	}
	
	@Test
	void testSetAddress() 
	{
		Account a = new Account("carlos", "social33", "adress34", "phone308", 7512, "accountNum666");
		a.setAddress("adress yall");
		assertEquals("adress yall", a.getAddress());
	}
	
	@Test
	void testToString() 
	{
		Account a = new Account("carlos", "social33", "adress34", "phone308", 7512, "accountNum666");
		assertEquals("name: carlos\nadress: adress34\naccount number: accountNum666", a.toString());
	}
	
	@Test
	void testEquals()
	{
		Account a = new Account("carlos", "social33", "adress34", "phone308", 7512, "accountNum666");
		String str = "ahahaha";
		assertFalse(a.equals(str));
		
		Object obj = a;
		assertTrue(a.equals(obj));
		
		Account b = new Account("carlos", "social33", "adress34", "phone308", 7512, "accountNum777");
		assertFalse(a.equals(b));
		
	
		
	}
	

}
