package kbtg;

public class IfElse {

	public static void main(String[] args) {
		int score = 60;
		if (score == 60) {
			System.out.println("C");
		} else if (score == 50) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		String grade = 
				score == 60 ? "C" : 
					score == 50 ? "D" : "F";
	}

}
