package javaBaslangic;

import java.util.Scanner;

public class DaireAlaniHesaplama {
	public static void main(String[] args) {
		
		int r;
		double pi = 3.14;
		int a;
		
		Scanner girdi = new Scanner(System.in);
		
		System.out.print("Dairenin Yarý Çapýný Giriniz: ");
		r = girdi.nextInt();
		
		System.out.print("Merkez Açý Ölçüsünü Giriniz:");
		a = girdi.nextInt();
		
		double cevre = 2 * pi * r;
		double alan = pi * r * r;
		double daireDilimiAlani = (pi * (r*r) * a)/360;
		
		System.out.println("Dairenin Çevresi: " + cevre);
		System.out.println("Dairenin Alaný: " + alan);
		System.out.println("Merkez Açýsýnýn Ölçüsü " + a + " Olan Daire Diliminin Alaný: " + daireDilimiAlani);
		
		
	}

}
