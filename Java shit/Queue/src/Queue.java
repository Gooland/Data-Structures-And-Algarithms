import java.util.Arrays;

public class Queue <T>
{
	protected Object[] data;
	protected int capacity;
	protected int end;
	
	public Queue() 
	{
		capacity = 10;
		data = new Object[capacity];
		end=0;
	}
	
	public void enQueue(T value)
	{
		while(end>=capacity)
		{
			data = Arrays.copyOf(data, capacity*3/2);
			capacity = capacity*3/2;
		}
		data[end]=value;
		end++;
	}

}
