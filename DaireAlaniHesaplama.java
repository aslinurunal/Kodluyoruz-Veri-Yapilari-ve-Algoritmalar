package javaBaslangic;

import java.util.Scanner;

public class DaireAlaniHesaplama {
	public static void main(String[] args) {
		
		int r;
		double pi = 3.14;
		int a;
		
		Scanner girdi = new Scanner(System.in);
		
		System.out.print("Dairenin Yar� �ap�n� Giriniz: ");
		r = girdi.nextInt();
		
		System.out.print("Merkez A�� �l��s�n� Giriniz:");
		a = girdi.nextInt();
		
		double cevre = 2 * pi * r;
		double alan = pi * r * r;
		double daireDilimiAlani = (pi * (r*r) * a)/360;
		
		System.out.println("Dairenin �evresi: " + cevre);
		System.out.println("Dairenin Alan�: " + alan);
		System.out.println("Merkez A��s�n�n �l��s� " + a + " Olan Daire Diliminin Alan�: " + daireDilimiAlani);
		
		
	}

}
