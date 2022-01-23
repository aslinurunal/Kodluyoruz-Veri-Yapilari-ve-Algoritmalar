package javaBaslangic;

import java.util.Scanner;

public class MinMaxDeger {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Kaç tane sayý gireceksiniz: ");
		int n = input.nextInt();

		int inp = 1;
		int max = 0, min = 0;

		while (inp <= n) {
			System.out.print(inp + ". sayýyý giriniz: ");
			int number = input.nextInt();
			if (inp < min) {
				min = number;
			} else if (inp > min) {
				max = number;
			}else if(inp == inp) {
				if(inp < min) {
					min = number;
				}else if(inp >min){
					max = number;
				}
			}
			inp++;
		}
		System.out.println("En küçük sayý: " + min + "\nEn büyük sayý: " + max);
	}

}
