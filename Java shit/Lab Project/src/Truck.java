
public class Truck extends Vehicle 
{
	protected boolean cargo;
	
	public Truck(boolean c, int doors, int cylinders, String color, double initialFuel, int transmission)
	{
		super(doors, cylinders, color, initialFuel, transmission);
		cargo = c;
		setClassName("Truck");
	}

	public boolean hasCargo() 
	{
		return cargo;
	}

	public void setCargo(boolean cargo) 
	{
		this.cargo = cargo;
	}
	
	public String toString()
	{
		String val = super.toString();
		if(cargo)
			val = val + "        The truck is carrying cargo.\n";
		else
			val = val + "        The truck is not carrying cargo.\n";
		return val;
	}
}
