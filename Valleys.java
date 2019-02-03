import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;

public class Valleys {

    // Complete the countingValleys function below.
    // Input: 8 
    // UDDDUDUU
    // Output: 1
    static int countingValleys(int n, String s) {

	int seaLevel = 0;
	int countV = 0, countM = 0;
	boolean hasV = false, hasM = false;
       
	for (char ch : s.toCharArray()) {
		if (ch == 'D') {
			seaLevel--;
		} else if (ch == 'U') {
			seaLevel++;
		}

		System.out.println("seaLevel = "+seaLevel);
		if (seaLevel > 0) hasM = true;
		if (seaLevel < 0) hasV = true;

		if (hasM && seaLevel == 0) { hasM = false; countM++; }
		if (hasV && seaLevel == 0) { hasV = false;  countV++; }

		System.out.println("countM = "+countM + " countV "+countV);
	} 
	
	return countV;
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

