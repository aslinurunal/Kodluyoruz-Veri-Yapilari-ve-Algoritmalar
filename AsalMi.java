package javaBaslangic;

import java.util.Scanner;

public class AsalMi {
	static boolean asalSayi(int a) {
		int count = 0;
		for (int i = 2; i < a; i++) {
				if(a % i == 0) {
					count ++;
				}
				
			}
			if(count == 0) {
			return true;
			}else {
				return false;
			}
		}

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Sayý giriniz: ");
	int a = scan.nextInt();
	
if (asalSayi(a)) {
	System.out.println(a + " sayýsý ASALDIR !");
}else {
	System.out.println(a + " sayýsý ASAL deðildir !");
}

	}

}
