package javaBaslangic;

import java.util.Scanner;

public class KombinasyonHesaplama {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Eleman Sayýsý:");
		int n = scan.nextInt();
		
		System.out.print("Kombinasyon Sayýsý: ");
		int r = scan.nextInt();
		
		int nFac = 1;
		int rFac = 1;
		int kFac = 1;
		for(int i = 1; i <= n; i++) {
			nFac = nFac * i;
		}
		for(int j = 1; j <= r; j++) {
		rFac = rFac * j;
		}
		for(int k = 1; k <= n-r; k++) {
			kFac = kFac *k;
		}
		int total = nFac / (rFac * kFac);
		System.out.println("("+n + "," +r+ ")" + ": "+ total );
	}

}
