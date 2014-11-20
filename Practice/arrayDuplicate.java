import java.util.Scanner;

public class arrayDuplicate
{
	public static void main(String[] args)
	{
		String[] someArray = {"hi", "me", "you", "3", "5", "2", "hi", "ui"};
		
		isDuplicate(someArray);
	}
	
	public static void isDuplicate(String[] anArray)
	{
		HashMap<Integer, String> aMap = new HashMap<key, String>();
		for (String s : someArray)
		{
			aMap.put(s.getId(), s);
		}
		
	}
}