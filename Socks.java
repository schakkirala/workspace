import java.io.*;
import java.util.*;


public class Socks {



    // Complete the sockMerchant function below.
    // return the number of pairs in the array 
    // Identied a pair - increase pairs 
    // store 1st in a table - when a pair is found delete 
    static int sockMerchant(int n, int[] ar) {

	int pairs = 0;
      	ArrayList<Integer> socks = new ArrayList <Integer> ();
 
        for (int i=0; i < n; i++) {
		// Found a single
                if (socks.indexOf(ar[i]) == -1) {
                    socks.add(new Integer(ar[i]));
                } else {
                    socks.remove(new Integer(ar[i]));
		    pairs++;
                }
        }

        return pairs;
    }

    private static final Scanner scanner = new Scanner(System.in);
    
    
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = 
        			new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

	System.out.println(result);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.close();


    }
}
