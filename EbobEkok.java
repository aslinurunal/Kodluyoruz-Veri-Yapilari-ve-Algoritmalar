package javaBaslangic;

import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("n1 sayýsýný giriniz: ");
		int n1 = input.nextInt();

		System.out.print("n2 sayýsýný giriniz: ");
		int n2 = input.nextInt();
		int i = 1, ebob = 1, ekok = 1;
		while (i <= n1) {
			if (n1 % i == 0 && n2 % i == 0) {
				ebob = i;
				ekok = (n1 * n2) / ebob;
			}
			i++;

		}
		System.out.println("EBOB: " + ebob + "\nEKOK: " + ekok);
	}

}
