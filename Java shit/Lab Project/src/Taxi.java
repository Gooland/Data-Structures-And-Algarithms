
public class Taxi extends Vehicle
{
	protected boolean customers;
	
	public Taxi(boolean c, int doors, int cylinders, String color, double initialFuel, int transmission)
	{
		super(doors, cylinders, color, initialFuel, transmission);
		customers = c;
		setClassName("Taxi");
	}

	public boolean isCustomers() {
		return customers;
	}

	public void setCustomers(boolean customers) {
		this.customers = customers;
	}

	public String toString()
	{
		String val = super.toString();
		if(customers)
			val = val + "        The taxi has passengers.\n";
		else
			val = val + "        The taxi has no passengers.\n";
		return val;
	}

}
