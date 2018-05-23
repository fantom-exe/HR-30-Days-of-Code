package Day19;

class Calculator implements AdvancedArithmetic {
	public int divisorSum(int n) {
		int sum = 0, divisor = n;
		
		while(divisor > 0) {
			if(n % divisor == 0) {
				sum += divisor;
			}
			
			divisor--;
		}
		
		return sum;
	}
}
