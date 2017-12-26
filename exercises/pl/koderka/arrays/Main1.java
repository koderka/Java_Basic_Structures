package pl.koderka.arrays;

import java.util.Random;

public class Main1 {

	public static void main(String[] args) {
		int minValue = 100;
		int[] randNumbers = new int[20];

		for (int i = 0; i < randNumbers.length; i++) {
			Random r = new Random();
			randNumbers[i] = r.nextInt(100);

			if (randNumbers[i] < minValue) {
				minValue = randNumbers[i];
			}
		}
		System.out.println(minValue);
	}
}
