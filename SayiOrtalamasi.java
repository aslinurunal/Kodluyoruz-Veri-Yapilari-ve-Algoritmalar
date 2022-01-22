package javaBaslangic;

import java.util.Scanner;

public class SayiOrtalamasi {

	public static void main(String[] args) {

		int k, toplam = 0, sonuc;
		int count = -1;

		Scanner inp = new Scanner(System.in);

		System.out.println("Bir sayý giriniz:");
		k = inp.nextInt();

		for (int i = 0; i <= k; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				toplam += i;
				count++;
			}
		}

		System.out.println(sonuc = toplam / count);
	}

}
