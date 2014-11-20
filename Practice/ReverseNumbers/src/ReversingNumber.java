import java.util.Scanner;


public class ReversingNumber {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		int someNum = key.nextInt();
		
		int reverse = 0;
		
		while (someNum != 0)
		{
			reverse *= 10;
			
			reverse += someNum % 10;
			
			someNum /= 10;
			
		}
		
		System.out.println(reverse);
		
		key.close();
	}

}
