import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingClouds {

    // Complete the jumpingOnClouds function below.
    // input 6 and 0 0 0 0 1 0
    // Output is 3
    // 0 means ok and 1 means avoid. Number of jumps to reach end 
    // plus 1 and plus 2 is allowed 
    static int jumpingOnClouds(int[] c) {

	ArrayList <Integer> path = new ArrayList <Integer>();
	int l = c.length;

	int j = 0;
	if (c[j] == 0) path.add(j);
	while (j+2<l && j+1<l) {
		System.out.println("j " + c[j]+ " " + c[j+1]); 
		if (c[j+2] == 0) {
			path.add(j+2);
			j=j+2;
			System.out.println("j+2 " + j); 
		} else if (c[j+1] == 0) {
			path.add(j+1);
			j = j+1;
			System.out.println("j+1 " + j); 
		} else {
			System.out.println("End of path " + j); 
			break;			
		}	
	}
	if (j+1 < l && c[j+1] == 0) path.add(j+1);

	for (int ch: path) System.out.println(ch);
	return path.size()-1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

