package javaBaslangic;

import java.util.Scanner;

public class UsluSayilar {

	public static void main(String[] args) {

		int n, i, j;

		Scanner scan = new Scanner(System.in);

		System.out.print("Bir Say� Giriniz: ");
		n = scan.nextInt();
		System.out.println("4'�n kuvvetleri:");
		for (i = 1; i <= n; i *= 4) {
			System.out.println(i);
		}
		System.out.println("5'in kuvvetleri");
		for (j = 1; j <= n; j *= 5) {
			System.out.println(j);
		}
	}
}
