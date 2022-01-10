package javaBaslangic;

import java.util.Scanner;

public class UcgenAlaniHesaplama {

	public static void main(String[] args) {
		
		//Deðiþken oluþturma
		double a, b, c, u, alan;
		
		//Kullanýcýdan veri alma
		Scanner girdi = new Scanner(System.in);
		
		System.out.print("1. Kenarý Giriniz: ");
		a = girdi.nextDouble();
		
		System.out.print("2. Kenarý Giriniz: ");
		b = girdi.nextDouble();
		
		System.out.print("3. Kenarý Giriniz: ");
		c = girdi.nextDouble();
		
		u = (a + b + c)/2;
		
		alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
		System.out.println("Üçgenin Alaný: " + alan);
		}

}
