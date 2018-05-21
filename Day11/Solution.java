package Day11;


import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[][] arr = new int[6][6];
		
		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			
			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}
		
		scanner.close();
		
		// find hourglasses and sums
		int row1Sum, row2Sum, row3Sum; // individual sums of each hourglass row
		int maxHourglass;
		for (int i = 0; i < 4; i++) { // columns
			
			for (int j = 0; j < 4; j++) { // row1
				
				for (int k = 1; k < 5; k++) { // row2
					
					for (int l = 0; l < 4; l++) { // row3
					
					}
				}
			}
		}
		
		// return largest sum
		System.out.println(maxHourglass);
	}

}
