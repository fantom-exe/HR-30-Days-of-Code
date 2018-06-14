package Day28;

import java.util.Scanner;

public class Solution {
	
	
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		for (int NItr = 0; NItr < N; NItr++) {
			String[] firstNameEmailID = scanner.nextLine().split(" ");
			
			String firstName = firstNameEmailID[0];
			
			String emailID = firstNameEmailID[1];
		}
		
		scanner.close();
	}
	
}
