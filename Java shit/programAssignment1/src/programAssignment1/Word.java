package programAssignment1;


public class Word 
{
	
	String word;
	
	public Word()
	{
		word = "";
	}
	
	public Word(String w) throws IllegalArgumetnException
	{
		if(!isWord(w))
			throw new IllegalArgumetnException("not a word");
		else
			word=w;
	}
	
	protected boolean isWord(String s) 
	{
		/*USED: https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html
		 * https://docs.oracle.com/javase/tutorial/i18n/text/charintro.html
		 * https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html#getType(char)
		 * https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
		 * https://www.geeksforgeeks.org/character-gettype-method-in-java-with-examples/
		 */
		if(!s.isEmpty())
		{
			for(int i=0; i<s.length(); i++)
			{
				char ch = s.charAt(i);
				if(!Character.isLetter(ch))
					return false;
			}
			return true;
		}
		else
			return false;
	}
	
	protected String getWord() {
		return word;
	}
	
	public boolean equals(Object obj)//USED:https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
	{
		if(this == obj)
			return true;
		if(!(obj instanceof Word))
			return false;
		Word objW = (Word)obj;
		return(word.equals(objW.getWord()));
	}
	

	public boolean equalsIgnoreCase(Object obj)//USED:https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
	{
		if(this == obj)
			return true;
		if(!(obj instanceof Word))
			return false;
		Word objW = (Word)obj;
		return(word.equalsIgnoreCase(objW.getWord()));
	}
	
}
