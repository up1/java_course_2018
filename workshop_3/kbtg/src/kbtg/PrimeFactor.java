package kbtg;

public class PrimeFactor {
	
	public static void main(String[] args) {
		PrimeFactor pf = new PrimeFactor();
		pf.of(8);
	}

	public String of(int input) {
		String result = "";
		int prime = 2;
		for (; input > 1; prime++) {
			for (;input % prime == 0; input /= prime) {
				result += prime;
			}
		}
		
		return result;
	}

}
