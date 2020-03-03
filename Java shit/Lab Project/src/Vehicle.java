
public class Vehicle 
{
	protected int numberOfDoors;
	protected int numberOfCylinders;
	protected String vehicleColor;
	protected double fuelLevel;
	protected int transmissionType;
	protected String className;
	
	public Vehicle(int doors, int cylinders, String color, double initialFuel, int transmission)
	{
		numberOfDoors = doors;
		numberOfCylinders = cylinders;
		vehicleColor = color;
		fuelLevel = initialFuel;
		transmissionType = transmission;
		className = "Vehicle";
	}
	
	
	public String getVehicleColor() {
		return vehicleColor;
	}


	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}


	public double getFuelLevel() {
		return fuelLevel;
	}


	public void setFuelLevel(double fuelLevel) {
		this.fuelLevel = fuelLevel;
	}


	public String getClassName() {
		return className;
	}


	public void setClassName(String className) {
		this.className = className;
	}


	public int getNumberOfDoors() {
		return numberOfDoors;
	}


	public int getNumberOfCylinders() {
		return numberOfCylinders;
	}


	public int getTransmissionType() {
		return transmissionType;
	}


	public String toString()
	{
		final String spaces = "        ";
		String val = this.className;
		val = val + "\n" + spaces + "Number of doors: " + this.numberOfDoors;
		val = val + "\n" + spaces + "Number of cylinders: " + numberOfCylinders;
		val = val + "\n" + spaces + "Transmission type: " + transmissionType;
		val = val + "\n" + spaces + "Color: " + vehicleColor;
		val = val + "\n" + spaces + "Fuel level: " + fuelLevel + "\n";
		return val;
	}
}
