import java.util.*;

public class GenerateStrings {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		String input = key.nextLine();
		int numDollars = 0;
		for (int i = 0; i < input.length(); i++)
		{
			if (input.charAt(i) == '$')
			{
				numDollars++;
			}
		}
		
		String[] possibilities = new String[numDollars];
		int index = 0;
		int i = 0;
		while (numDollars > 0)
		{
			if (input.charAt(i) == '$')
			{
				String tmp = input;
				tmp = tmp.substring(0,i) + "0" + tmp.substring(i+1);
				possibilities[index] = tmp;
				numDollars--;
				index++;
			}
			i++;
		}
		
		System.out.println(possibilities);
	}

}
