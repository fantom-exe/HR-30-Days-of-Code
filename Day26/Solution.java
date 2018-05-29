package Day26;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] actualDate = new int[3];
		int[] dueDate    = new int[3];
		
		// input
		for (int i = 0; i < 6; i++) {
			int num = input.nextInt();
			
			if(i < 3) {
				actualDate[i] = num;
			}
			else {
				dueDate[i-3] = num;
			}
		}
		
		int fine = 0;
		// calculate
		for (int i = 2; i >= 0; i--) {
			
			if(actualDate[i] <= dueDate[i]) {
				fine = 0;
			}
			else if () {
				
			}
		}
		
	}
	
}
