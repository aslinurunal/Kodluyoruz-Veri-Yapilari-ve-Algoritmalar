package javaBaslangic;

import java.util.Arrays;
import java.util.Scanner;

public class EnYakinSayi {

	public static void main(String[] args) {
		int number;

		Scanner scan = new Scanner(System.in);
		System.out.print("L�tfen bir say� giriniz: ");
		number = scan.nextInt();

		int[] list = { 15, 12, 788, 1, -1, -778, 2, 0 };

		Arrays.sort(list);

		int min = 0, max = 0;
		

		for (int i : list) {
			if (i < number) {
				min = i;
			}
			if (i > number) {
				max = i;
				break;
			}
		}
		System.out.println("Girilen say�: " + number);
		System.out.println("Girilen say�dan k���k en yak�n say�: " + min);
		System.out.println("Girilen say�dan b�y�k en yak�n say�: " + max);
	}

}
