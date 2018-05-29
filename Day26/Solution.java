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
		
		// calculate
		int fine;
		
		if(actualDate[2] < dueDate[2]) { // actualDate[year] < dueDate[year]
			fine = 0;
		}
		else if(actualDate[2] == dueDate[2]) { // actualDate[year] == dueDate[year]
			if(actualDate[1] <= dueDate[1]) { // actualDate[month] == dueDate[month]
				if(actualDate[0] <= dueDate[0]) { 
					fine = 0;
				}
			}
		}
		else { // actualDate[year] > dueDate[year]
			fine = 10000;
		}
	
	}
	
}
