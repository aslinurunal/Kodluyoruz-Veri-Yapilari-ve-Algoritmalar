package javaBaslangic;

import java.util.Scanner;

public class GelismisHesapMakinesi {

	static void plus() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Kaç adet sayý gireceksiniz: ");
		int counter = scan.nextInt();
		int number, result = 0;

		for (int i = 1; i <= counter; i++) {
			System.out.print(i + ". sayý: ");
			number = scan.nextInt();

			result += number;
		}
		System.out.println("Sonuç: " + result);
	}

	static void minus() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Kaç adet sayý gireceksiniz: ");
		int counter = scan.nextInt();
		int number, result = 0;

		for (int i = 1; i <= counter; i++) {
			System.out.print(i + ". sayý: ");
			number = scan.nextInt();
			if (i == 1) {
				result += number;
				continue;
			}
			result -= number;
		}
		System.out.println("Sonuç: " + result);
	}

	static void times() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Kaç adet sayý gireceksiniz: ");
		int counter = scan.nextInt();
		int number, result = 1;

		for (int i = 1; i <= counter; i++) {
			System.out.print(i + ". sayý: ");
			number = scan.nextInt();

			if (number == 0) {
				result = 0;
				break;
			} else {
				result *= number;
			}
		}
		System.out.println("Sonuç: " + result);

	}

	static void divided() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Kaç adet sayý gireceksiniz: ");
		int counter = scan.nextInt();
		double number, result = 0.0;

		for (int i = 1; i <= counter; i++) {
			System.out.print(i + ". sayý: ");
			number = scan.nextDouble();
			if (i != 1 && number == 0) {
				System.out.println("Böleni 0 giremezsiniz!");
				continue;
			}
			if (i == 1) {
				result = number;
				continue;
			}
			result /= number;
		}
		System.out.println("Sonuç: " + result);
	}

	static void power() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Taban deðeri giriniz: ");
		int base = scan.nextInt();
		System.out.println("Üs deðeri giriniz: ");
		int exponent = scan.nextInt();
		int result = 1;

		for (int i = 1; i <= exponent; i++) {
			result *= base;
		}
		System.out.println("Sonuç: " + result);
	}

	static void factorial() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Sayý giriniz: ");
		int n = scan.nextInt();
		int result = 1;

		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		System.out.println("Sonuç: " + result);
	}

	static void mod() {
		Scanner scan = new Scanner(System.in);
		System.out.print("1. sayýyý giriniz: ");
		int a = scan.nextInt();
		System.out.print("2. sayýyý giriniz: ");
		int b = scan.nextInt();

		if (b == 0) {
			System.out.println("Deðeri 0 giremezsiniz!");
		} else {
			int result = a % b;
			System.out.println("Sonuç: " + result);
		}
	}

	static void rectangle() {
		Scanner scan = new Scanner(System.in);
		System.out.print("1. kenarý giriniz: ");
		int a = scan.nextInt();
		System.out.print("2. kenarý giriniz: ");
		int b = scan.nextInt();

		int perimeter = (2 * a) + (2 * b);
		int recArea = a * b;
		if (a == 0 || b == 0) {
			System.out.println("Deðer 0 girilemez!");
		} else {
			System.out.println("Çevresi: " + perimeter + "\nAlaný:" + recArea);
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int select;
		String menu = "1- Toplama Ýþlemi\n" + "2- Çýkarma Ýþlemi\n" + "3- Çarpma Ýþlemi\n" + "4- Bölme Ýþlemi\n"
				+ "5- Üslü Sayý Hesaplama\n" + "6- Faktoriyel Hesaplama\n" + "7- Mod Alma\n"
				+ "8- Dikdörtgen Alan ve Çevre Hesabý\n" + "0- Çýkýþ Yap";

		do {
			System.out.println(menu);
			System.out.print("Lütfen bir iþlem seçiniz: ");
			select = scan.nextInt();

			switch (select) {
			case 1:
				plus();
				break;
			case 2:
				minus();
				break;
			case 3:
				times();
				break;
			case 4:
				divided();
				break;
			case 5:
				power();
				break;
			case 6:
				factorial();
				break;
			case 7:
				mod();
				break;
			case 8:
				rectangle();
				break;
			case 0:
				break;
			default:
				System.out.println("Yanlýþ bir deðer girdiniz, tekrar deneyiniz.");
			}

		} while (select != 0);

	}

}
