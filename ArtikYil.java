package javaBaslangic;

import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {
		int yil;

		Scanner input = new Scanner(System.in);
		System.out.print("Yýl Giriniz: ");
		yil = input.nextInt();

		if (yil % 4 == 0) {
			System.out.println(yil + " bir artýk yýldýr!");
		} else if (yil % 100 == 0) {
			if (yil % 400 == 0) {
				System.out.println(yil + " bir artýk yýldýr!");
			} else {
				System.out.println(yil + " bir artýk yýl deðildir!");
			}
		} else {
			System.out.println(yil + " bir artýk yýl deðildir!");

		}
	}
}
