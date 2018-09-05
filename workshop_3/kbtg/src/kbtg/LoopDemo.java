package kbtg;

import java.util.Iterator;

public class LoopDemo {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		for (int i : numbers) {
			System.out.println(i);
		}
	}

}
