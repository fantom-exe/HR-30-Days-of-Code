package Day25;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int runs = input.nextInt();
		
		while(runs > 0) {
			int num = input.nextInt();
			boolean prime = true;
			
			if(num % 2 == 0) { // even number
				prime = false;
			}
			else {
				for(int i = num / 2; i > 1; i--) {
					if(num % i == 0) {
						prime = false;
						break;
					}
				}
			}
			
			// output
			if(prime) {
				System.out.println("Prime");
			}
			else {
				System.out.println("Not prime");
			}
			
			runs--;
		}
		
	}
	
}
