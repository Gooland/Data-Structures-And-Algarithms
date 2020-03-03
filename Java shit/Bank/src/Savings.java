
public class Savings extends Account
{
	protected double interestRate;
	protected int interestPeriod;
	
	public Savings(String n, String s, String a, String p, double b, String aN)
	{
		super(n,s,a,p,b,aN);
	}
	
	public Savings(String n, String s, String a, String p, double b, String aN, double iR, int iP)
	{
		super(n,s,a,p,b,aN);
		interestRate=iR;
		interestPeriod=iP;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double iR) {
		interestRate=iR;
	}

	public int getInterestPeriod() {
		return interestPeriod;
	}

	public void interestAdded()
	{
		double a = balance*interestRate;
		this.deposit(a);
	}
}
