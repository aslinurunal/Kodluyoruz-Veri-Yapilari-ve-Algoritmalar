package javaBaslangic;

import java.util.Scanner;

public class NotOrtalamasiProgrami {

	public static void main(String[] args) {
		//De�i�ken Olu�turma
		int mat,fizik,kimya,turkce,tarih,muzik;
		
		//Scanner s�n�f� tan�mlama
		Scanner girdi = new Scanner(System.in);
		
		//Kullan�c�dan de�er alma
		System.out.print("Matematik Notunuz: ");
		mat = girdi.nextInt();
		
		System.out.print("Fizik Notunuz: ");
		fizik = girdi.nextInt();
		
		System.out.print("Kimya Notunuz: ");
		kimya = girdi.nextInt();
		
		System.out.print("T�rk�e Notunuz: ");
		turkce = girdi.nextInt();
		
		System.out.print("Tarih Notunuz: ");
		tarih = girdi.nextInt();
		
		System.out.print("M�zik Notunuz: ");
		muzik = girdi.nextInt();
		
		//Hesaplama
		int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
		double sonuc = toplam / 6;
		
		int not = 60;
		String cevap = sonuc >= not ? " S�n�f� Ge�ti!" : " S�n�fta Kald�!";
		System.out.println("Ortalama:" + sonuc + cevap);
		

	}

}
