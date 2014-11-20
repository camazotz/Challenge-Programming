import java.util.Scanner;


public class ReverseString {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		String toReverse = key.nextLine();
		
		String[] words = toReverse.split(" ");
		for (int i = words.length - 1; i >= 0; i--)
		{
			System.out.print(words[i] + " ");
			/*for (int j = words[i].length() - 1; j >= 0; j--)
			{
				System.out.print(words[i].charAt(j));
			}
			
			System.out.println();*/
		}
		
		key.close();
	}

}
