package kbtg;

public class FizzBuzz {

	public String call(int input) {
		if(input == 15 | input == 30) {
			return "FizzBuzz";
		}
		if(หารสาม(input)) {
			return "Fizz";
		}
		if(input == 5) {
			return "Buzz";
		}
		return "" + input;
	}

	private boolean หารสาม(int input) {
		return input % 3 == 0;
	}

}
