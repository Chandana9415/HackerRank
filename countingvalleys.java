import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        boolean belowSeaLevel = false;
        int level = 0;
        int valley =0;
        char arr[]= s.toCharArray();
        for(int i=0;i<n;i++){
            char a = arr[i];
            if(a == 'U')
                level++;
            else if(a == 'D') 
                level--;

            if(!belowSeaLevel && level<0){
              
                valley++;
                belowSeaLevel=true;
            }

            if(level>=0){
            belowSeaLevel=false;
            }
            
        }
    
        return valley;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
