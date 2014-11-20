package duplicateInArray;

import java.util.HashMap;

public class DuplicateArray {

	public static void main(String[] args)
	{
		String[] someArray = {"hi", "me", "you", "3", "5", "2", "ih", "ui"};
		
		System.out.println(isDuplicate(someArray));
	}
	
	public static boolean isDuplicate(String[] anArray)
	{
		HashMap<Integer, String> aMap = new HashMap<Integer, String>();
		for (String s : anArray)
		{
		//	int key = getId(s);
			if (aMap.containsKey(s.hashCode()))
			{
				return true;
			}
			
			aMap.put(s.hashCode(), s);
		}
		
		return false;
	}
	
	public static int getId(String ex)
	{
		int hash = 7;
		for (int i = 0; i < ex.length(); i++)
		{
			hash *= ex.charAt(i) * 33;
		}
		
		return hash;
	}

}
