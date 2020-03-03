
public class Loan extends Account
{
	protected double interestRate;
	protected int endDate;
	
	public Loan(String n, String s, String a, String p, double b, String aN, double iR, int eD)
	{
		super(n,s,a,p,b,aN);
		interestRate = iR;
		endDate = eD;
	}
	
	public double getInterestRate() {
		return interestRate;
	}

	public int getEndDate() {
		return endDate;
	}

	public void makePayment(double amount)
	{
		deposit(amount);
		endDate--;
	}
	
	public void applyInterest()
	{
		double interest = balance*interestRate;
		deposit(interest);
	}
	
	public void payOff()
	{
		balance=0;
		endDate=0;
	}
}
