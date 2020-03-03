import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VehicleTest {

	@Test
	void testTaxi() 
	{
		Taxi v = new Taxi( false, 2, 6, "blue", 14.6, 3);
		assertFalse(v.isCustomers());
		assertEquals(2, v.getNumberOfDoors());
		assertEquals(6,v.getNumberOfCylinders());
		assertEquals("blue", v.getVehicleColor());
		assertEquals(14.6,v.getFuelLevel());
		assertEquals(3,v.getTransmissionType());
		assertEquals("Taxi", v.getClassName());
	}
	
	@Test
	void testTruck() 
	{
		Truck v = new Truck(true, 2, 6, "blue", 14.6, 3);
		assertTrue(v.hasCargo());
		assertEquals(2, v.getNumberOfDoors());
		assertEquals(6,v.getNumberOfCylinders());
		assertEquals("blue", v.getVehicleColor());
		assertEquals(14.6,v.getFuelLevel());
		assertEquals(3,v.getTransmissionType());
	}
	
	@Test
	void testMonsterTruck() 
	{
		MonsterTruck v = new MonsterTruck("tina",2, 6, "blue", 14.6, 3);
		assertEquals("tina", v.getName());
		assertEquals(2, v.getNumberOfDoors());
		assertEquals(6,v.getNumberOfCylinders());
		assertEquals("blue", v.getVehicleColor());
		assertEquals(14.6,v.getFuelLevel());
		assertEquals(3,v.getTransmissionType());
	}
	
	@Test
	void testTaxiSets() 
	{
		Taxi v = new Taxi( false, 2, 6, "blue", 14.6, 3);
		v.setVehicleColor("gray");
		assertEquals("gray", v.getVehicleColor());
		v.setFuelLevel(15);
		assertEquals(15, v.getFuelLevel());
		v.setCustomers(false);
		assertFalse(v.isCustomers());
	}
	
	@Test
	void testTruckSets() 
	{
		Truck v = new Truck( false, 2, 6, "blue", 14.6, 3);
		v.setCargo(true);
		assertTrue(v.hasCargo());
	}
	
	@Test
	void testMonsterTruckSets() 
	{
		MonsterTruck v = new MonsterTruck( "big", 2, 6, "blue", 14.6, 3);
		v.setName("dave");
		assertEquals("dave",v.getName());
	}
	
	@Test
	void testVehicleToString() 
	{
		Vehicle v = new Vehicle( 2, 6, "blue", 14.6, 3);
		String s = "Vehicle\n        Number of doors: 2\n        Number of cylinders: 6\n        Transmission type: 3\n        Color: blue\n        Fuel level: 14.6\n";
		assertEquals(s,v.toString());
	}
	
	@Test
	void testTaxiToString() 
	{
		Taxi v = new Taxi(true, 2, 6, "blue", 14.6, 3);
		String s = "Taxi\n        Number of doors: 2\n        Number of cylinders: 6\n        Transmission type: 3\n        Color: blue\n        Fuel level: 14.6\n        The taxi has passengers.\n";
		assertEquals(s,v.toString());
		
		v.setCustomers(false);
		s = "Taxi\n        Number of doors: 2\n        Number of cylinders: 6\n        Transmission type: 3\n        Color: blue\n        Fuel level: 14.6\n        The taxi has no passengers.\n";
		assertEquals(s,v.toString());
	}
	
	@Test
	void testTruckToString() 
	{
		Truck v = new Truck(true, 2, 6, "blue", 14.6, 3);
		String s = "Truck\n        Number of doors: 2\n        Number of cylinders: 6\n        Transmission type: 3\n        Color: blue\n        Fuel level: 14.6\n        The truck is carrying cargo.\n";
		assertEquals(s,v.toString());
		
		v.setCargo(false);
		s = "Truck\n        Number of doors: 2\n        Number of cylinders: 6\n        Transmission type: 3\n        Color: blue\n        Fuel level: 14.6\n        The truck is not carrying cargo.\n";
		assertEquals(s,v.toString());
	}
	
	@Test
	void testMonsterTruckToString() 
	{
		MonsterTruck v = new MonsterTruck( "name", 2, 6, "blue", 14.6, 3);
		String s = "Monster Truck\n        Number of doors: 2\n        Number of cylinders: 6\n        Transmission type: 3\n        Color: blue\n        Fuel level: 14.6\n        Name: name\n";
		assertEquals(s,v.toString());
	}
	
	
}
 