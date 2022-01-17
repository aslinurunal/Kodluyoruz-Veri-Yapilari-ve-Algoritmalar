package javaBaslangic;

import java.util.Scanner;

public class UcakBiletiHesaplama {

	public static void main(String[] args) {
		double mesafe, tutar, yasIndirimi, yolculukTipiIndirimi, indirimliTutar, toplamTutar;
		int yas, secim;

		Scanner input = new Scanner(System.in);

		System.out.print("Lütfen yaþýnýzý giriniz: ");
		yas = input.nextInt();

		System.out.print("Lütfen gideceðiniz mesafeyi giriniz: ");
		mesafe = input.nextDouble();

		tutar = mesafe * 0.10;

		System.out.println("Yolculuk Tipi: Gidiþ Dönüþ ise 1'e \nYolculuk Tipi: Tek Yön ise 2'ye basýnýz. ");
		secim = input.nextInt();

		if (yas < 12 && yas <= 0) {
			if (secim == 1) {
				yasIndirimi = tutar * 0.50;
				indirimliTutar = tutar - yasIndirimi;
				yolculukTipiIndirimi = indirimliTutar * 0.20;
				toplamTutar = (indirimliTutar - yolculukTipiIndirimi) * 2;
				System.out.println("Toplam tutar : " + toplamTutar + " TL'dir");
			} else if (secim == 2) {
				yasIndirimi = tutar * 0.50;
				indirimliTutar = tutar - yasIndirimi;
				toplamTutar = indirimliTutar;
				System.out.println("Toplam tutar : " + toplamTutar + " TL'dir");
			} else {
				System.out.println("Hatalý seçim yaptýnýz!");
			}

		} else if (yas >= 12 && yas <= 24) {
			if (secim == 1) {
				yasIndirimi = tutar * 0.10;
				indirimliTutar = tutar - yasIndirimi;
				yolculukTipiIndirimi = indirimliTutar * 0.20;
				toplamTutar = (indirimliTutar - yolculukTipiIndirimi) * 2;
				System.out.println("Toplam tutar : " + toplamTutar + " TL'dir");
			} else if (secim == 2) {
				yasIndirimi = tutar * 0.10;
				indirimliTutar = tutar - yasIndirimi;
				toplamTutar = indirimliTutar;
				System.out.println("Toplam tutar : " + toplamTutar + " TL'dir");
			} else {
				System.out.println("Hatalý seçim yaptýnýz!");
			}

		} else if (yas > 65 && yas <= 100) {
			if (secim == 1) {
				yasIndirimi = tutar * 0.30;
				indirimliTutar = tutar - yasIndirimi;
				yolculukTipiIndirimi = indirimliTutar * 0.20;
				toplamTutar = (indirimliTutar - yolculukTipiIndirimi) * 2;
				System.out.println("Toplam tutar : " + toplamTutar + " TL'dir");
			} else if (secim == 2) {
				yasIndirimi = tutar * 0.30;
				indirimliTutar = tutar - yasIndirimi;
				toplamTutar = indirimliTutar;
				System.out.println("Toplam tutar : " + toplamTutar + " TL'dir");
			} else {
				System.out.println("Hatalý seçim yaptýnýz!");
			}

		}else if (yas <= 65 && yas > 24) {
			if (secim == 1) {
				yolculukTipiIndirimi = tutar * 0.20;
				toplamTutar = (tutar - yolculukTipiIndirimi) * 2;
				System.out.println("Toplam tutar : " + toplamTutar + " TL'dir");
			}else if (secim == 2) {
				indirimliTutar = tutar;
				toplamTutar = indirimliTutar;
				System.out.println("Toplam tutar : " + toplamTutar + " TL'dir");
			}
		}else {
			System.out.println("Hatalý veri girdiniz!");
		}
	}
}