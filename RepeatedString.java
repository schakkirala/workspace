import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    // s = abc and n = 10; output is 7 a's
    static long repeatedString(String s, long n) {
	if (s.isEmpty()) return 0;

	long count = 0, count2 = 0;
	int l = s.length();
	long  n1 = (long) Math.ceil(n/l);
	long n2 = (long) n % l;

	for (int i=0; i<l; i++) {
		if (i == n2) count2 = count;
		if (s.charAt(i) == 'a') count++;	
	}

 	System.out.println("Initial count = " + count);	
	if (n == l) return count;
 	System.out.println("n1  = " + n1);	
 	System.out.println("n2  = " + n2);	

	// count multiples of character
	count = count * n1 + count2;
 	System.out.println("Final count = " + count);	

	return count;
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

