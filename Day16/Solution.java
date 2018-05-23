package Day16;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		
		try {
			int num = Integer.parseInt(S);
			System.out.println(num);
		} catch(NumberFormatException e) {
			System.out.println("Bad String");
		}
	}
	
}
