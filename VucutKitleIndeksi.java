package javaBaslangic;

import java.util.Scanner;

public class VucutKitleIndeksi {

	public static void main(String[] args) {
		double boy, indeks;
		int kilo;
		
		Scanner girdi = new Scanner(System.in);
		
		System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
		boy = girdi.nextDouble();
		
		System.out.print("Lütfen kilonuzu giriniz: ");
		kilo = girdi.nextInt();
		
		indeks = kilo / (boy * boy);
		
		System.out.println("Vücut kitle indeksiniz: " + indeks);
		
	}

}
