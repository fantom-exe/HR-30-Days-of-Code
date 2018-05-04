package Day03;

import java.util.*;

public class Solution {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		String ans="";
		
		// if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
		if(n%2==1){
			ans = "Weird";
		}
		else{
		  /*
		  If  is even and in the inclusive range of  to , print Weird
		  If  is even and greater than , print Not Weird
		  */
			if(n >= 2){
				if(n <= 5){
					ans = "Not Weird";
				}
				else{
					if(n <= 20){
						ans = "Weird";
					}
					else{
						ans = "Not Weird";
					}
				}
			}
		}
		System.out.println(ans);
	}
	
}
