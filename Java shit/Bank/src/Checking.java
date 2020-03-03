
public class Checking extends Account
{
	protected static double fees = 5;
	
	public Checking(String n, String s, String a, String p, double b, String aN)
	{
		super(n,s,a,p,b,aN);
	}
	
	public static double getFees() {
		return fees;
	}

	public void applyFees()
	{
		this.withdrawl(fees);
	}
}
