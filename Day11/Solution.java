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
		int rowSum1 = 0, rowSum2 = 0, rowSum3 = 0; // individual sums of each hourglass row
		int currentHourglassSum, maxHourglass = 0;
		
		for (int i = 0; i < 4; i++) { // hourglass
			currentHourglassSum = 0;
			
			for (int j = 0; j < 4; j++) { // row1
				rowSum1 = arr[i][j];
				
				for (int k = 1; k < 5; k++) { // row2
					rowSum2 = arr[i+1][k];
					
					for (int l = 0; l < 4; l++) { // row3
						rowSum3 = arr[i+2][l];
					}
				}
			}
			
			currentHourglassSum = rowSum1 + rowSum2 + rowSum3;
			
			if(currentHourglassSum > maxHourglass) {
				maxHourglass = currentHourglassSum;
			}
		}
		
		// return largest hourglass sum
		System.out.println(maxHourglass);
	}

}
