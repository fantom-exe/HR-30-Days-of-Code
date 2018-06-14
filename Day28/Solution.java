package Day28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		Pattern p = Pattern.compile(".+@gmail\\.com$");
		List<String> sortedNames = new ArrayList<>();
		for (int NItr = 0; NItr < N; NItr++) {
			String[] firstNameEmailID = scanner.nextLine().split(" ");
			
			String firstName = firstNameEmailID[0];
			
			String emailID = firstNameEmailID[1];
			
			Matcher m = p.matcher(emailID);
			
			if(m.find()) {
				sortedNames.add(firstName);
			}
		}
		
		// sort
		Collections.sort(sortedNames);
		
		// print
		for(int i = 0; i < sortedNames.size(); i++) {
			System.out.println(sortedNames.get(i));
		}
		
		scanner.close();
	}
	
}
