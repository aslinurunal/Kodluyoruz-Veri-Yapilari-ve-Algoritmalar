package javaBaslangic;

import java.util.Scanner;

public class SinifGecmeDurumu {

	public static void main(String[] args) {
		int mat, fizik, turkce, kimya, muzik;
		double avarage;

		Scanner input = new Scanner(System.in);

		System.out.print("Matematik notunuz: ");
		mat = input.nextInt();

		System.out.print("Fizik notunuz: ");
		fizik = input.nextInt();

		System.out.print("T�rk�e notunuz: ");
		turkce = input.nextInt();

		System.out.print("Kimya notunuz: ");
		kimya = input.nextInt();

		System.out.print("M�zik notunuz: ");
		muzik = input.nextInt();

		if (mat >= 100 && mat <= 0) {
			if (fizik >= 100 && fizik <= 0) {
				avarage = (mat + fizik + turkce + kimya + muzik) / 5;
				if (turkce >= 100 && turkce <= 0) {
					avarage = (mat + fizik + turkce + kimya + muzik) / 5;
					if (kimya >= 100 && kimya <= 0) {
						avarage = (mat + fizik + turkce + kimya + muzik) / 5;
						if (muzik >= 100 && muzik <= 0) {
							avarage = (mat + fizik + turkce + kimya + muzik) / 5;

						} else {
							avarage = (mat + fizik + turkce + kimya) / 5;
						}
					} else {
						avarage = (mat + fizik + turkce + muzik) / 5;
					}
				} else {
					avarage = (mat + fizik + kimya + muzik) / 5;
				}

			} else {
				avarage = (mat + turkce + kimya + muzik) / 5;
			}

		} else {
			avarage = (fizik + turkce + kimya + muzik) / 5;
		}
		if (avarage >= 55) {
			System.out.println("Tebrikler s�n�f� ge�tiniz!");
		} else {
			System.out.println("S�n�fta kald�n�z, seneye g�r��mek �zere!");
		}

	}

}
