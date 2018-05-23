package Day17;

class Calculator {
	
	int power(int n, int p) throws Exception {
		int pow = 1;
		
		if(n < 0 || p < 0) {
			throw new Exception("n and p should be non-negative");
		}
		
		while(p > 0) {
			pow *= n;
			p--;
		}
		
		return pow;
	}
	
}
