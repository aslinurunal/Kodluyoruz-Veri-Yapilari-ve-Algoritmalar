package javaBaslangic;

import java.util.Scanner;

public class ManavKasaProgrami {

	public static void main(String[] args) {
		double armut = 2.14;
		double elma = 3.67;
		double domates = 1.11;
		double muz = 0.95;
		double patlican = 5.00;
		int kiloArmut, kiloElma, kiloDomates, kiloMuz, kiloPatlican;
		
		Scanner girdi = new Scanner (System.in);
		
		System.out.print("Armut ka� kilo: ");
		kiloArmut = girdi.nextInt();
		
		System.out.print("Elma ka� kilo: ");
		kiloElma = girdi.nextInt();
		
		System.out.print("Domates ka� kilo: ");
		kiloDomates = girdi.nextInt();
		
		System.out.print("Muz ka� kilo: ");
		kiloMuz = girdi.nextInt();
		
		System.out.print("Patl�can ka� kilo: ");
		kiloPatlican = girdi.nextInt();
		
		double toplam = (armut*kiloArmut) + (elma*kiloElma) + (domates*kiloDomates) + (muz*kiloMuz) + (patlican*kiloPatlican);
		System.out.print("Toplam Tutar: " + toplam + " TL");
	}

}
