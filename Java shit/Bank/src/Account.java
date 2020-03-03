
public class Account 
{
	protected String name;
	protected String social;
	protected String address;
	protected String phone;
	protected double balance;
	protected String accountNum;
	
	public Account(String n, String s, String a, String p, double b, String aN)
	{
		name = n;
		social = s;
		address = a;
		phone = p;
		balance = b;
		accountNum = aN;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	public String getSocial() {
		return social;
	}

	public String getPhone() {
		return phone;
	}
	
	public String getAccountNum()
	{
		return accountNum;
	}
	
	public boolean equals(Object obj)
	{
		if (this==obj)
			return true;
		else if(!(obj instanceof Account))
			return false;
		return accountNum.equals(((Account)obj).accountNum);
	}
	
	public String toString()
	{
		return "name: "+ name +"\nadress: "+ address + "\naccount number: "+ accountNum;
	}
	
	public void deposit(double a)
	{
		balance +=a;
	}
	
	public void withdrawl(double a)
	{
		balance -=a;
	}
	
	
}
