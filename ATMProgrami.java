package javaBaslangic;

import java.util.Scanner;

public class ATMProgrami {

	public static void main(String[] args) {
		String userName, password;

		Scanner input = new Scanner(System.in);
		int right = 3;
		int balance = 1500;
		int select;

		while (right > 0) {
			System.out.print("Kullan�c� Ad�n�z: ");
			userName = input.nextLine();
			System.out.print("Parolan�z: ");
			password = input.nextLine();
			if (userName.equals("patika") && password.equals("dev123")) {
				System.out.println("Merhaba, Kodluyoruz Bankas�na Ho�geldiniz!");
				do {

					System.out.println("1-Para Yat�rma\n" + "2-Para �ekme\n" + "3-Bakiye Sorgulama\n" + "4-��k�� Yap");
					System.out.print("L�tfen yapmak istedi�iniz i�lemi se�iniz:");
					select = input.nextInt();
					switch (select) {
					case 1:
						System.out.println("Para Miktar�: ");
						int price = input.nextInt();
						balance += price;
						System.out.println("Yeni bakiyeniz : " + balance);
						break;
					case 2:
						System.out.println("Para Miktar�: ");
						price = input.nextInt();
						if (price > balance) {
							System.out.println("Yetersiz Bakiye");
						} else {
							balance -= price;
							System.out.println("Yeni bakiyeniz: " + balance);
						}
					case 3:
						System.out.println("Bakiyeniz:" + balance);

					}
				} while (select != 4);
				System.out.println("Ho��akal�n");
				break;
			} else {
				right--;
				System.out.println("Hatal� kullan�c� ad� ya da �ifre. Tekrar Deneyiniz");
				if (right == 0) {
					System.out.println("Hesab�n�z bloke olmu�tur l�tfen banka ile ileti�ime ge�iniz. ");
				} else {
					System.out.println("Kalan hakk�n�z: " + right);
				}
			}

		}
	}

}
