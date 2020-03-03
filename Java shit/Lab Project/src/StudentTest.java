import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/* 
 Ryan Upham
 Lab 1
 Data Structures and Algorithms 
 1/30/2020
 1/30/2020
*/
class StudentTest {

	@Test
	void testGetName()
	{
		Student s = new Student();
		assertEquals("newStudent", s.getName());
	}
	@Test
	void testGetStuID()
	{
		Student s = new Student();
		assertEquals(000000, s.getStuID());
	}
	@Test
	void testGetGpa()
	{
		Student s = new Student();
		assertEquals(4, s.getGpa());
	}
	@Test
	void testSetName()
	{
		Student s = new Student();
		s.setName("John");
		assertEquals("John", s.getName());
	}
	@Test
	void testSetStuID()
	{
		Student s = new Student();
		s.setStuID(101010);
		assertEquals(101010, s.getStuID());
	}
	@Test
	void testSetGpa() 
	{
		Student s = new Student();
		s.setGpa(3.3);
		assertEquals(3.3, s.getGpa());
	}
	@Test
	void testMultiStudent()
	{
		Student s = new Student("Mark", 111111, 3.2);
		assertEquals("Mark", s.getName());
		assertEquals(111111, s.getStuID());
		assertEquals(3.2, s.getGpa());
	}
	@Test
	void testEquals()
	{
		Student s = new Student();
		String str = "ahahaha";
		assertFalse(s.equals(str));
		
		Object obj = s;
		assertTrue(s.equals(obj));
		
		s.setGpa(1.2);
		obj = new Student("newStudent", 000000, 1.2);
		assertTrue(s.equals(obj));
		
		obj = new Student("Mark", 111111, 3.2);
		assertFalse(s.equals(obj));
		
	}
	@Test
	void testToString()
	{
		Student s = new Student("mark", 101010, 2.8);
		String expected = "/nName:    mark/nStudent ID:    101010/nGPA:    2.8/n";
		assertEquals(expected, s.toString());
		s.setGpa(3.2);
		expected = "/nName:    mark/nStudent ID:    101010/nGPA:    3.2/n";
		assertEquals(expected, s.toString());
	}

	
	
	
	
}
