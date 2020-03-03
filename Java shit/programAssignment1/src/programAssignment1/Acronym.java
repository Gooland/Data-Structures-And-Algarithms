package programAssignment1;

public class Acronym extends Word
{
	public Acronym()
	{
		super();
	}
	
	public Acronym(String w)throws IllegalArgumetnException
	{
		if(!(isWord(w)))
			throw new IllegalArgumetnException("not a word");
		else if(!(isAcronym(w)))
			throw new IllegalArgumetnException("not a Acronym");
		else
			word=w;
	}
	
	private boolean isAcronym(String s)//USED:https://docs.oracle.com/javase/7/docs/api/java/lang/String.html, https://www.geeksforgeeks.org/character-gettype-method-in-java-with-examples/
	{
		
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(!Character.isUpperCase(ch))
				return false;
		}
		return true;
		
	}
	
}
