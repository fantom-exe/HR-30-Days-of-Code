package Day14;

class Difference {
	private int[] elements;
	public int maximumDifference;
	
	Difference(int[] array) {
		elements = array;
	}
	
	void computeDifference() {
		int current;
		
		for (int i = 0; i < elements.length - 1; i++) {
			
			for (int j = i + 1; j < elements.length; j++) {
				current = Math.abs(elements[i] - elements[j]);
				
				if(current > maximumDifference) {
					maximumDifference = current;
				}
			}
		}
		
	}
	
}