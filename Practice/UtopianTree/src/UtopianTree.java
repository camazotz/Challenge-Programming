
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UtopianTree {

    public static void main(String[] args) {
        
        Scanner key = new Scanner(System.in);
        int numIter = key.nextInt();
        key.nextLine();
        for (int i = 0; i < numIter; i++)
        {
            int numCycles = key.nextInt();
            key.nextLine();
            int height = 1;

                    while (numCycles != 0)
                    {
                        height *= 2;
                        numCycles--;
                        if (numCycles != 0)
                        {
                            height++;
                            numCycles--;
                        }
                        
                    }
         
            System.out.println(height);
        }
    }
}
