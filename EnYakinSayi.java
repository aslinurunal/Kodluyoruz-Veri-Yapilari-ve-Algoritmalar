package javaBaslangic;

import java.util.Arrays;
import java.util.Scanner;

public class EnYakinSayi {

	public static void main(String[] args) {
		int number;

		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen bir sayý giriniz: ");
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
		System.out.println("Girilen sayý: " + number);
		System.out.println("Girilen sayýdan küçük en yakýn sayý: " + min);
		System.out.println("Girilen sayýdan büyük en yakýn sayý: " + max);
	}

}
