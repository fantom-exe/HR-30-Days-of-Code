package Day08;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Map<String, Integer> phoneBook = new HashMap<String, Integer>();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt(); // number of inputs
		for(int i = 0; i < n; i++){
			String name = in.next();
			int phone = in.nextInt();
			
			phoneBook.put(name, phone);
		}
		
		while(in.hasNext()){
			String s = in.next();
			
			
		}
		in.close();
		
	}

}
