package pl.koderka.arrays;

import java.util.Arrays;

public class Main2 {

	public static void main(String[] args) {
		int[] tab = new int[10];
		Arrays.fill(tab, 2);
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
	}
}