package programAssignment1;

public class ProperNoun extends Word
{
	public ProperNoun()
	{
		super();
	}
	
	public ProperNoun(String w)throws IllegalArgumetnException
	{
		if(!(isWord(w)))
			throw new IllegalArgumetnException("not a word");
		else if(!(isPNoun(w)))
			throw new IllegalArgumetnException("not a proper noun");
		else
			word=w;
	}
	
	private boolean isPNoun(String s)//USED:https://docs.oracle.com/javase/7/docs/api/java/lang/String.html, https://www.geeksforgeeks.org/character-gettype-method-in-java-with-examples/
	{
		char ch = s.charAt(0);
		if(!Character.isUpperCase(ch))
			return false;
		else
		{
			for(int i=1; i<s.length(); i++)
			{
				ch = s.charAt(i);
				if(!Character.isLowerCase(ch))
					return false;
			}
			return true;
		}
	}
}

