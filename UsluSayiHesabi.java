package javaBaslangic;

import java.util.Scanner;

public class UsluSayiHesabi {
	static int power(int a, int b) {
		int result = 1;
		for (int i = 1; i <= b; i++) {
			result *= a;
		}
		return result;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Taban deðeri giriniz: ");
		int a = scan.nextInt();
		System.out.print("Üs deðerini giriniz: ");
		int b = scan.nextInt();

		System.out.println("Sonuç: " + power(a, b));
	}

}
