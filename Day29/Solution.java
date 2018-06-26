package Day29;

import java.util.*;

public class Solution {
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		String binStrA, binStrB;
		Integer A, B;
		Integer AandB;
		
		for (int tItr = 0; tItr < t; tItr++) {
			String[] nk = scanner.nextLine().split(" ");
			
			int N = Integer.parseInt(nk[0]);
			
			int K = Integer.parseInt(nk[1]);
			
			// Find two integers, A and B (where A < B), from set S such that
			// the value of A&B is the maximum possible and also less than a given integer, K
			
			// test cases
			int max = 0;
			
			for(int i = 1; i < N; i++) {
				for(int j = i+1; j <= N; j++) {
					A = i;
					B = j;
					
//					binStrA = A.toBinaryString(A);
//					binStrB = B.toBinaryString(B);
//					for(int k = 0; k < binStrB.length(); k++) {
//						A   = Integer.parseInt(binStrA.);
//						B   = Integer.parseInt(k);
						
						AandB = A & B;
						System.out.println(AandB);
						System.out.println(AandB.toBinaryString(AandB));
						
						if() {
						
						}
//					}
				
				
				}
				
			}
			
			
		}
		
		scanner.close();
		
		
	}
}

class BinaryString {
	
	BinaryString(String string, Integer integer){
		String binaryInteger = Integer.toBinaryString(integer);
		
		byte[] bytes = string.getBytes( );
		for(int i = 0; i < bytes.length; i++) {
			byte b = bytes[i];
			// Perform a bitwise operation using byte and integer operands, save result as tmp:
			int tmp = b | integer;
			System.out.println(Integer.toBinaryString(b) + " OR " + Integer.toBinaryString(integer)
					+ " = " + Integer.toBinaryString(tmp) + " = " + tmp);
		}
	}
	
	public static void main(String[] args) {
		new BinaryString("HackerRank", 8675309);
	}
}

