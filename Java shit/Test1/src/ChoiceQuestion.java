
public class ChoiceQuestion extends Question 
{
	int choices;
	
	public ChoiceQuestion() 
	{
		super();
		choices=0;
	}

	public ChoiceQuestion(int i, String s, int c) 
	{
		super(i, s);
		choices = c;
	}

	public int getChoices() {
		return choices;
	}

	public void setChoices(int choices) {
		this.choices = choices;
	}

	
}
