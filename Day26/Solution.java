package Day26;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int     num;
		
		int[] actualDate = new int[3];
		int[] dueDate    = new int[3];
		
		// input 1st line
		for (int i = 0; i < 3; i++) {
			num = input.nextInt();
			
			actualDate[i] = num;
		}
		
		input.nextLine();
		
		// input 2nd line
		for (int i = 0; i < 3; i++) {
			num = input.nextInt();
			
			dueDate[i] = num;
		}
		
		// calculate
		int fine = -1;
		
		if(actualDate[2] < dueDate[2]) { // actual year < due year
			fine = 0;
		}
		else if(actualDate[2] == dueDate[2]) { // actual year == due year
			if(actualDate[1] < dueDate[1]) { // actual month < due month
				fine = 0;
			}
			else if(actualDate[1] == dueDate[1]) { // actual month == due month
				if(actualDate[0] <= dueDate[0]) { // actual day <= due day
					fine = 0;
				}
				else { // actual day > due day
					fine = 15 * (actualDate[0] - dueDate[0]);
				}
			}
			else { // actual month > due month
				fine = 500 * (actualDate[1] - dueDate[1]);
			}
		}
		else { // actual year > due year
			fine = 10000;
		}
		
		System.out.println(fine);
	}
	
}
