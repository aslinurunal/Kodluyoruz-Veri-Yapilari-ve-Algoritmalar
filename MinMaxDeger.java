package javaBaslangic;

import java.util.Scanner;

public class MinMaxDeger {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Ka� tane say� gireceksiniz: ");
		int n = input.nextInt();

		int inp = 1;
		int max = 0, min = 0;

		while (inp <= n) {
			System.out.print(inp + ". say�y� giriniz: ");
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
		System.out.println("En k���k say�: " + min + "\nEn b�y�k say�: " + max);
	}

}
