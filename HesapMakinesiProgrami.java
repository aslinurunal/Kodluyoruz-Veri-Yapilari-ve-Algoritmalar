package javaBaslangic;

import java.util.Scanner;

public class HesapMakinesiProgrami {
	public static void main(String[] args) {
		int number1, number2, select;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ýlk sayýyý giriniz: ");
		number1 = input.nextInt();
		
		System.out.print("Ýkinci sayýyý giriniz: ");
		number2 = input.nextInt();
		
		System.out.println("1-Toplama \n2-Çýkarma \n3-Çarpma \n4-Bölme");
		System.out.print("Seçiminiz: ");
		select = input.nextInt();
		
		
		switch (select){
			case 1:
				System.out.println("Toplam: " + (number1 + number2));
			break;
			case 2:
				System.out.println("Çýkarma: " + (number1 - number2));
			break;
			case 3:
				System.out.println("Çarpým: " + (number1 * number2));
			break;
			case 4: 
				if(number2 != 0) {
				System.out.println("Bölüm: " + (number1 / number2));
				}else {
					System.out.println("Bir sayý sýfýra bölünemez!");
				}
			break;
			default:
				System.out.println("Hatalý Giriþ Yaptýnýz!");
				
		}
		
	}

}
