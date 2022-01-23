package javaBaslangic;

import java.util.Scanner;

public class ArmstrongSayi {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Sayi Giriniz: ");
		int number = input.nextInt();
		int result = 0;

		while (number >= 1) {
			result += (number % 10);
			number = number / 10;
		}
		System.out.println(result);
	}
}
