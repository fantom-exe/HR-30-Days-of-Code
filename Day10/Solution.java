package Day10;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
	
	public static void main(String[] args) {
		// input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		scanner.close();
		
		// find binary representation
		Stack<Integer> binaryRep = new Stack<Integer>();
		
		int stackSize = 0;
		while(n > 0) {
			binaryRep.push(n%2);
			
			n /= 2;
			
			stackSize++;
		}
		
		// count number of consecutive 1's
		int numOfBin = 0;
		
		for (int i = 0; i < binaryRep.; i++) {
			if(binaryRep[i] == 1) {
				numOfBin += 1;
				for (int j = i; j < binaryRep.length; j++) {
					if(binaryRep[j] == 1) {
						numOfBin += 1;
					}
					else {
						break;
					}
				}
			}
		}
		
		// print result
//		System.out.println(numOfBin);
	}

}
