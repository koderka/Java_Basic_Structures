package pl.koderka.arrays;

public class Main5 {

	public static void main(String[] args) {

		int[][] task2Array = { { 2, 3, 4 }, { 12, 32, 12, 11 }, { 3, 2, 1, 4, 5 }, { 5, 1, 6, 7, 8 } };

		System.out.println(task2Array[1].length);

		for (int i = 0; i < task2Array.length; i++) {
			for (int j = 0; j < task2Array[i].length; j++) {
				System.out.format("%02d ", task2Array[i][j]);
			}
			System.out.println();
		}
	}
}
