package javaBaslangic;

import java.util.Scanner;

public class MukemmelSayi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Bir say� giriniz: ");
		int number = input.nextInt();
		int total = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total + i;
			}
		}
		if (total == number) {
			System.out.println(number + " M�kemmel Say�d�r.");
		} else {
			System.out.println(number + " M�kemmel say� de�ildir.");
		}

	}

}
