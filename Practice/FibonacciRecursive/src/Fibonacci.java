
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//fibRecursive();
		fibIterative();
		
	}
	
	public static int fibDynamicProgramming(int n1, int n2)
	{
		int n3 = n1 + n2;
		if (n3 > 1000)
			return 0;
		return 1;
	}
	public static void fibIterative()
	{
		int n1 = 1, n2 = 1, n3 = -1;
		System.out.println(n1 + "\n" + n2);
		while (true)
		{
			n3 = n1 + n2;
			if (n3 > 1000)
				break;
			n1 = n2;
			n2 = n3;
			System.out.println(n3);
		}
	}
	public static void fibRecursive()
	{
		int n1 = 1, n2 = 1;
		System.out.println(n1 + "\n" + n2);
		printRecursiveFib(n1, n2);
	}

	public static void printRecursiveFib(int n1, int n2)
	{
		int n3 = n1 + n2;
		if (n3 > 1000)
			return;
		System.out.println(n3);
		printRecursiveFib(n2, n3);
	}
}
