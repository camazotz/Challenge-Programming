
public class MergeSort {
	
	public static void main(String[] args) {	
		
		int[] someArray = {3, 4, 2, 8, 3, 4, 8, 2};
		int[] helper;
		
		mergesort(someArray);
		
		for (int o = 1; o < someArray.length; o++)
		{
			System.out.println(someArray[o]);
		}
	}
	
	
	public static void mergesort(int[] someArray)
	{
		int[] helper = new int[someArray.length];
		mergesort(someArray, helper, 0, someArray.length -1);
	}
	
	public static void mergesort (int [] someArray, int[] helper, int low, int high)
	{
		if (low < high)
		{
			int mid = (high + low) /2;
			//System.out.println(mid);
			mergesort(someArray, helper, low, mid);
			mergesort(someArray, helper, mid+1, high);
			merge(someArray, helper, low, mid, high);
		}
	}
	
	public static void merge(int[] someArray, int[] helper, int low, int mid, int high)
	{
		for (int i = 0; i <= high; i++)
		{
			helper[i] = someArray[i];
		}
		
		int helperLeft = low;
		int helperRight = mid + 1;
		int current = low;
		
		while (helperLeft <= mid && helperRight <= high)
		{
			if (helper[helperLeft] <= helper[helperRight])
			{
				someArray[current] = helper[helperLeft];
				helperLeft++;
			}
			
			else
			{
				someArray[current] = helper[helperRight];
				helperRight++;
			}
			
			current++;
		}
		
		int remaining = mid - helperLeft;
		for (int i = 0; i <= remaining; i++)
		{
			someArray[current + i] = helper[helperLeft + i];
		}
	}

}
