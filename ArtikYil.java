package javaBaslangic;

import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {
		int yil;

		Scanner input = new Scanner(System.in);
		System.out.print("Y�l Giriniz: ");
		yil = input.nextInt();

		if (yil % 4 == 0) {
			System.out.println(yil + " bir art�k y�ld�r!");
		} else if (yil % 100 == 0) {
			if (yil % 400 == 0) {
				System.out.println(yil + " bir art�k y�ld�r!");
			} else {
				System.out.println(yil + " bir art�k y�l de�ildir!");
			}
		} else {
			System.out.println(yil + " bir art�k y�l de�ildir!");

		}
	}
}
