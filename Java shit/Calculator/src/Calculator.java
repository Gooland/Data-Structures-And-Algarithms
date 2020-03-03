
public class Calculator 
{
	private List operands;
	

	
	public Calculator()
	{
		operands = new List();
		
	}
	
	public double calculate(String in) throws CalculationExeption
	{
		if(in.length()==0)
			return 0;
		
		char ch;
		for(int i=0;i<in.length();i++)
		{
			ch=in.charAt(i);
			if(Character.isDigit(ch))
				operands.addOnTop((int)ch);
			else if(ch == '+')
			{
				int temp = operands.getTopVal();
				operands.deleteTop();
				temp = temp + operands.getTopVal();
				operands.addOnTop(temp);
			}
			else if(ch == '-')
			{
				int temp = operands.getTopVal();
				operands.deleteTop();
				temp = temp - operands.getTopVal();
				operands.addOnTop(temp);
			}
			else if(ch == '*')
			{
				int temp = operands.getTopVal();
				operands.deleteTop();
				temp = temp * operands.getTopVal();
				operands.addOnTop(temp);
			}
			else if(ch == '/')
			{
				int temp = operands.getTopVal();
				operands.deleteTop();
				temp = temp / operands.getTopVal();
				operands.addOnTop(temp);
			}
		}
		
		if(operands.getSize()!=1)
			throw new CalculationExeption("calculation failed");
		else
			return operands.getTopVal();
	}
	
	
}
