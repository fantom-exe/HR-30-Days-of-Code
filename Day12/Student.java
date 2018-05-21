package Day12;

class Student extends Person {
	private int[]  testScores;
	
	/*
	 *   Class Constructor
	 *
	 *   @param firstName - A string denoting the Person's first name.
	 *   @param lastName - A string denoting the Person's last name.
	 *   @param id - An integer denoting the Person's ID number.
	 *   @param scores - An array of integers denoting the Person's test scores.
	 */
	Student(String firstName, String lastName, int id, int[] scores) {
		super(firstName, lastName, id);
		this.testScores = scores;
	}
	
	/*
	 *   Method Name: calculate
	 *   @return A character denoting the grade.
	 */
	public char calculate() {
		int sum = 0, avg;
		char grade = ' ';
		
		for (int i = 0; i < testScores.length; i++) {
			sum += testScores[i];
		}
		
		avg = sum / testScores.length;
		
		if (avg >= 90) {
			grade = 'O';
		}
		else if (avg >= 80) {
			grade = 'E';
		}
		else if (avg >= 70) {
			grade = 'A';
		}
		else if (avg >= 55) {
			grade = 'P';
		}
		else if (avg >= 40) {
			grade = 'D';
		}
		else { // a < 40
			grade = 'T';
		}
		
		return grade;
	}
}