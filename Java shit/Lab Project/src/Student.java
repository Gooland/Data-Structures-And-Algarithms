/* 
 Ryan Upham
 Lab 1
 Data Structures and Algorithms 
 1/30/2020
 1/30/2020
*/
public class Student 
{
	private String name;
	private int stuID;
	private double gpa;
	
	public Student()
	{
		name = "newStudent";
		stuID = 000000;
		gpa = 4;
	}
	
	public Student( String s, int i, double d)
	{
		name = s;
		stuID=i;
		gpa=d;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getStuID()
	{
		return stuID;
	}
	
	public double getGpa()
	{
		return gpa;
	}
	
	public void setName(String s)
	{
		name = s;
	}
	
	public void setStuID(int i)
	{
		stuID = i;
	}
	
	public void setGpa(double d)
	{
		gpa = d;
	}
	
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		else if (!(obj instanceof Student))
			return false;
		Student s = (Student) obj;
		if (name == s.getName() && stuID == s.getStuID() && gpa == s.getGpa())
			return true;
		else 
			return false;
	}
	
	public String toString()
	{
		return "/nName:    " + this.getName() + "/nStudent ID:    " + this.getStuID() + "/nGPA:    " + this.getGpa()+"/n";
	}
}
