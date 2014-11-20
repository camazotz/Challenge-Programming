import java.util.*;

public class GenerateAnagrams {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String input = key.nextLine();

		getAnagrams(input);
	}

	public static void getAnagrams(String inString)
	{
		getPermutations("", inString);
	}
	
	public static void getPermutations(String prefix, String complete)
	{
		int n = complete.length();
		if (n == 0)
			System.out.println(prefix);
		else
		{
			for (int i = 0; i < n; i++)
			{
				getPermutations(prefix + complete.charAt(i), complete.substring(0, i) + complete.substring(i+1, n));
			}
		
		}
	}
	
	/*public static void permutation(String str) { 
	    permutation("", str); 
	}

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}*/
}
