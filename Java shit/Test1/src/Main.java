
public class Main 
{
	
	public static void main(String[] args) 
	{
		Question q1 = new Question();
		Question q2 = new Question(1, "Who is the inventor of Java?");
		q1.setNumber(15);
		System.out.println(q1);
		System.out.println(q2);
		
	}
	
	public static int seqSearch(int intArr[],int n,int key)
	{
		for(int i=0; i<n;i++)
		{
			if(intArr[i]==key)
				return i;
		}
		
		return -1;
	}
	
	public static boolean checkSorted(int intArr[], int n)
	{
		for(int i=0; i<n-1 ;i++)
		{
			if(!(intArr[i] <= intArr[i+1]))
				return false;
		}
		return true;
	}
}

