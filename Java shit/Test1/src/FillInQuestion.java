
public class FillInQuestion extends Question 
{
	String awnser;

	public FillInQuestion() 
	{
		super();
		awnser= "";
	}

	public FillInQuestion(int i, String s) 
	{
		super(i, s);
		awnser = "";
	}

	public String getAwnser() {
		return awnser;
	}

	public void setAwnser(String awnser) {
		this.awnser = awnser;
	}

	
}
