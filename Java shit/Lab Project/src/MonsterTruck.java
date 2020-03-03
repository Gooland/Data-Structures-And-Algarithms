
public class MonsterTruck extends Vehicle
{
	protected String name;
	
	public MonsterTruck(String n, int door, int cyl, String col, double fu, int tran)
	{
		super(door, cyl, col, fu, tran);
		name = n;
		setClassName("Monster Truck");
	}

	public String getName() {
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		String val = super.toString();
		val = val + "        Name: " + name + "\n";
		
		return val;
		
	}
	
}
