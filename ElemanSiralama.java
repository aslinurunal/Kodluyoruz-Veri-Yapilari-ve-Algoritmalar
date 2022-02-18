package javaBaslangic;

import java.util.Arrays;
import java.util.Scanner;

public class ElemanSiralama {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Dizinin Boyutu n: ");
		int dimension = input.nextInt();
		int[] list = new int[dimension];
		System.out.println("Dizinin elemanlar�n� giriniz:");

		for (int i = 1; i <= dimension; i++) {
			System.out.print(i + ". Eleman�: ");
			list[i - 1] = input.nextInt();
		}
		Arrays.sort(list);

		System.out.print("S�ralama: ");

		for (int i : list) {

			System.out.print(i + " ");
		}
	}
}