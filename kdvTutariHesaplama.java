package javaBaslangic;

import java.util.Scanner;

public class kdvTutariHesaplama {

	public static void main(String[] args) {
		double veri, kdvOrani1 = 0.18, kdvOrani2 = 0.08;
		
		Scanner tutar = new Scanner(System.in);
		System.out.print("Lütfen tutarý giriniz: ");
		veri = tutar.nextDouble();
		
		double kdvTutari = veri <=  1000 ? veri*kdvOrani1 : veri*kdvOrani2;
		double kdvliTutar = veri + kdvTutari;
		
		System.out.println("KDV'siz tutar: " + veri + " TL");
		System.out.println("KDV tutarý: " + kdvTutari + " TL");
		System.out.println("KDV'li Tutar: " + kdvliTutar + " TL'dir.");
		
	}

}
