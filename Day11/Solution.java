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
		int rowSum1, rowSum2, rowSum3; // individual sums of each hourglass row
		int currentHourglassSum, maxHourglass = 0;
		
		for (int i = 0; i < 4; i++) { // rows
			
			for (int j = 0; j < 4; j++) { // hourglasses
				// row1
				rowSum1 = arr[i][j] + arr[i][j+1] + arr[i][j+2];
				
				// row2
				rowSum2 = arr[i+1][j+1];
				
				// row3
				rowSum3 = arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
				
				currentHourglassSum = rowSum1 + rowSum2 + rowSum3;
				
				System.out.println(currentHourglassSum);
				
				if (currentHourglassSum > maxHourglass || (i == 0 && j == 0)) {
					maxHourglass = currentHourglassSum;
				}
			}
		}
		
		// return largest hourglass sum
		System.out.println(maxHourglass);
	}

}
