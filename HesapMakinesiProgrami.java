package javaBaslangic;

import java.util.Scanner;

public class HesapMakinesiProgrami {
	public static void main(String[] args) {
		int number1, number2, select;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("?lk say?y? giriniz: ");
		number1 = input.nextInt();
		
		System.out.print("?kinci say?y? giriniz: ");
		number2 = input.nextInt();
		
		System.out.println("1-Toplama \n2-??karma \n3-?arpma \n4-B?lme");
		System.out.print("Se?iminiz: ");
		select = input.nextInt();
		
		
		switch (select){
			case 1:
				System.out.println("Toplam: " + (number1 + number2));
			break;
			case 2:
				System.out.println("??karma: " + (number1 - number2));
			break;
			case 3:
				System.out.println("?arp?m: " + (number1 * number2));
			break;
			case 4: 
				if(number2 != 0) {
				System.out.println("B?l?m: " + (number1 / number2));
				}else {
					System.out.println("Bir say? s?f?ra b?l?nemez!");
				}
			break;
			default:
				System.out.println("Hatal? Giri? Yapt?n?z!");
				
		}
		
	}

}
