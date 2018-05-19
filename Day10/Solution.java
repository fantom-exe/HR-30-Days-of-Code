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
			
			if(n == 0) {
				binaryRep.push(n%2);
				break;
			}
		}
		
		// count number of consecutive 1's
		int consecutiveBinaryNums = 0,
			binaryNum = -1;
		boolean isConsecutive = false;
		for (int i = 0; i < stackSize; i++) {
			binaryNum = binaryRep.pop();
			
			if(binaryNum == 1) {
				if(consecutiveBinaryNums == 0) {
					consecutiveBinaryNums = 0;
					consecutiveBinaryNums += 1;
					isConsecutive = true;
				}
				else {
					consecutiveBinaryNums += 1;
				}
			}
			else if (binaryNum == 0) {
				isConsecutive = false;
			}
		}
		
		// print result
		System.out.println(consecutiveBinaryNums);
	}

}
