package javaBaslangic;

public class Transpose {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
		System.out.println("Matrix: ");

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println("");
		}
		System.out.println("=================");
		System.out.println("Transpose: ");
		for (int row = 0; row < matrix[0].length; row++) {
			for (int col = 0; col < matrix.length; col++) {
				System.out.print(matrix[col][row] + " ");
			}
			System.out.println("");
		}
	}
}
