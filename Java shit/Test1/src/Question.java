
public class Question implements Comparable
{
	String text;
	int number;
	
	public Question() 
	{
		text = "No Text Given";
		number = -1;
	}
	
	public Question(int i, String s)
	{
		text = s;
		number = i;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Question other = (Question) obj;
		if (number != other.number)
			return false;
		if (text == null) 
		{
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

	public String toString() 
	{
		return number +". "+ text;
	}

	@Override
	public int compareTo(Object obj) 
	{
		if(!(obj instanceof Question))
			return -1;
		Question q = (Question)obj;
		if(number<q.getNumber())
			return -1;
		else if(number>q.getNumber())
			return 1;
		else
		{
			if(text.compareTo(q.getText())>0)
				return 1;
			else if(text.compareTo(q.getText())<0)
				return -1;
			else 
				return 0;
		}
	}
	
	

}
