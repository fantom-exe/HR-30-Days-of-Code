package Day10;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		// input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		scanner.close();
		
		// find binary representation
		int[] binaryRep = new int[15];
		
		for (int i = n%2; i < n; i++) { // fix
			binaryRep[i] = n%2;
			n--;
		}
		
		// count number of consecutive 1's
		int numOfBin = binaryRep.length;
		
		// print result
		System.out.println(numOfBin);
	}

}
