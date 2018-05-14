package Day08;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Map<String, Integer> phoneBook = new HashMap<String, Integer>();
		Scanner in = new Scanner(System.in);
		
		// additions
		int numOfInputs = in.nextInt();
		for(int i = 0; i < numOfInputs; i++){
			String name = in.next();
			int phone = in.nextInt();
			
			phoneBook.put(name, phone);
		}
		
		// searching
		while(in.hasNext()){
			String str = in.next();
			
			if(phoneBook.containsKey(str)) {
				System.out.println(str + "=" + phoneBook.get(str));
			}
			else {
				System.out.println("Not found");
			}
		}
		in.close();
		
	}

}
