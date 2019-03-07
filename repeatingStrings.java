import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        int count=0;
        long divisor=0,total=0,remainder=0;
        
      for(int i=0; i < s.length(); i++){
      if(s.charAt(i) =='a'){
          count++; //how many a's are there in the given substring
         }
      }

         divisor = n/s.length(); //how many repetitions
         total += divisor * count; //min no of a's in the string
         remainder = n % s.length(); //how many more a's can be there

         for(int j=0; j < remainder; j++){
             if(s.charAt(j)=='a')
             total++;
         }

      
    return total;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
