public class Recursion {

	public Recursion() {
		
	}
	public static int binarySearch(int key, int arr[], int low, int high)
	{
		if(low>high)
			return -1;// can be throws exception
		int mid = low+((high-low)/2);
		if(arr[mid]<key)
			return mid;
		if(arr[mid]<key)
			return(binarySearch(key, arr, mid+1, high));
		else
			return(binarySearch(key, arr, low, mid-1));
	}
	
	public static long factorial(long val)
	{
		if(val<0)
			return -1;
		if(val==0)
			return 1;
		else 
			return(val*factorial(val-1));
	}
	
	public static long multiply(long a, long b)
	{
		if(b==1)
			return a;
		if(b==0)
			return 0;
		if(b<0)
			return -1 * multiply(a,-b);
		else
			return(a+multiply(a,b-1));
	}
	
	public static void mergeSort(long[] arr, int low, int high)
	{
		if(low>=high)
			return;
		int mid = low+((high-low)/2);
		mergeSort(arr, mid, high);
		mergeSort(arr, low, mid-1);
		merge(arr, low, mid, high);
	}
	
	public static void merge(long[] arr, int low, int mid, int high)
	{
		long[] left = new long[mid-low];
		long[] right= new long [high - mid+1];
		int i =low;
		for (int j =0; j<left.length; j++,i++)
		{
			left[j] = arr[i];
		}
		for (int j =0; j<right.length; j++,i++)
		{
			right[j] = arr[i];
		}
		i=low;
		for(int l=0, r=0; l <= left.length && r<= right.length && i<high;i++)
		{
			if(l==left.length)
			{
				arr[i]=right[r];
				r++;
			}
			else if(r ==right.length)
			{
				arr[i]=left[l];
				l++;
			}
			else if(left[l]<=right[r])
			{
				arr[i]=left[l];
				l++;
			}
			else
			{
				arr[i]=right[r];
				r++;
			}
		}
	}

}
