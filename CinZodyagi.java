package javaBaslangic;

import java.util.Scanner;

public class CinZodyagi {

	public static void main(String[] args) {
		int dogumYili, zodiac;
		String burc = "";
		
		Scanner input = new Scanner(System.in);
		System.out.print("Do�um y�l�n�z� giriniz: ");
		dogumYili = input.nextInt();
		
		zodiac = dogumYili % 12;
		
		switch (zodiac) {
		case 0:
			burc = "Maymun";
			break;
		case 1:
			burc = "Horoz";
			break;
		case 2:
			burc = "K�pek";
			break;
		case 3: 
			burc = "Domuz";
			break;
		case 4:
			burc = "Fare";
			break;
		case 5: 
			burc = "�k�z";
			break;
		case 6: 
			burc = "Kaplan";
			break;
		case 7: 
			burc = "Tav�an";
			break;
		case 8: 
			burc = "Ejderha";
			break;
		case 9: 
			burc = "Y�lan";
			break;
		case 10: 
			burc = "At";
			break;
		case 11: 
			burc = "Koyun";
			break;
			
		}System.out.println("�in Zodya�� Burcunuz: " + burc);

	}

}
