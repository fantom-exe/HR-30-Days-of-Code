package Day06;

import java.util.*;

public class Solution {
	
	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		int t;
		String s;
		int n;
		
		Scanner in = new Scanner(System.in);
		
		t = in.nextInt();
		in.nextLine(); // clear buffer
		
		for(int i = 0; i < t; i++) {
			StringBuilder evenStr = new StringBuilder( ),
							oddStr = new StringBuilder();
			
			s = in.nextLine();
			n = s.length();
			
			// even index
			for(int j = 0; j < n; j += 2) {
				evenStr.append(s.charAt(j));
			}
			
			// odd index
			for(int k = 1; k < n; k += 2) {
				oddStr.append(s.charAt(k));
			}
			
			System.out.println(evenStr + " " + oddStr);
		}
		
	}
	
}
