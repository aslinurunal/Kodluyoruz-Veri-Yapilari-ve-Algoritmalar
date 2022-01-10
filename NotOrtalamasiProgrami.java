package javaBaslangic;

import java.util.Scanner;

public class NotOrtalamasiProgrami {

	public static void main(String[] args) {
		//Deðiþken Oluþturma
		int mat,fizik,kimya,turkce,tarih,muzik;
		
		//Scanner sýnýfý tanýmlama
		Scanner girdi = new Scanner(System.in);
		
		//Kullanýcýdan deðer alma
		System.out.print("Matematik Notunuz: ");
		mat = girdi.nextInt();
		
		System.out.print("Fizik Notunuz: ");
		fizik = girdi.nextInt();
		
		System.out.print("Kimya Notunuz: ");
		kimya = girdi.nextInt();
		
		System.out.print("Türkçe Notunuz: ");
		turkce = girdi.nextInt();
		
		System.out.print("Tarih Notunuz: ");
		tarih = girdi.nextInt();
		
		System.out.print("Müzik Notunuz: ");
		muzik = girdi.nextInt();
		
		//Hesaplama
		int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
		double sonuc = toplam / 6;
		
		int not = 60;
		String cevap = sonuc >= not ? " Sýnýfý Geçti!" : " Sýnýfta Kaldý!";
		System.out.println("Ortalama:" + sonuc + cevap);
		

	}

}
