
public class BinarySearch {

	public static int[] sortedArray = {2,2,3,4,6,7,8,8,8,9,11,13};
	
	public static void main(String[] args) {
		System.out.println(binSearch(4));
	}

	public static int binSearch(int x)
	{
		int low = 0, high = sortedArray.length - 1;
		int mid;
		
		while (low < high)
		{
			mid = (low + high) / 2;
			if (sortedArray[mid] < x)
			{
				low = mid+1;
			}
			
			else if (sortedArray[mid] > x)
			{
				high = mid-1;
			}
			
			else
			{
				return mid;
			}
		}
		
		return -1;
	}
}
