package javaBaslangic;

import java.util.Scanner;

public class UcgenAlaniHesaplama {

	public static void main(String[] args) {
		
		//De�i�ken olu�turma
		double a, b, c, u, alan;
		
		//Kullan�c�dan veri alma
		Scanner girdi = new Scanner(System.in);
		
		System.out.print("1. Kenar� Giriniz: ");
		a = girdi.nextDouble();
		
		System.out.print("2. Kenar� Giriniz: ");
		b = girdi.nextDouble();
		
		System.out.print("3. Kenar� Giriniz: ");
		c = girdi.nextDouble();
		
		u = (a + b + c)/2;
		
		alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
		System.out.println("��genin Alan�: " + alan);
		}

}
