package Day20;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int a_i=0; a_i < n; a_i++){
			a[a_i] = in.nextInt();
		}
		
		// output vars
		int numSwaps = 0;   // 1.
		int firstElement;   // 2.
		int lastElement;    // 3.
		
		// sort
		for (int i = 0; i < n; i++) {
			// Track number of elements swapped during a single array traversal
			int numberOfSwaps = 0;
			int tmp;
			
			for (int j = 0; j < n - 1; j++) {
				// Swap adjacent elements if they are in decreasing order
				if (a[j] > a[j + 1]) {
					tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
					
					numberOfSwaps++;
				}
			}
			
			numSwaps += numberOfSwaps;
			
			// If no elements were swapped during a traversal, array is sorted
			if (numberOfSwaps == 0) {
				break;
			}
		}
		
	// 1.
		System.out.println("Array is sorted in " + numSwaps + " swaps.");
		
	// 2.
		firstElement = a[0];
		System.out.println("First Element: " + firstElement);
		
	// 3.
		lastElement = a[a.length-1];
		System.out.println("Last Element: " + lastElement);
	
	}
	
}