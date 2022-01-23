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
			System.out.print("Kullanýcý Adýnýz: ");
			userName = input.nextLine();
			System.out.print("Parolanýz: ");
			password = input.nextLine();
			if (userName.equals("patika") && password.equals("dev123")) {
				System.out.println("Merhaba, Kodluyoruz Bankasýna Hoþgeldiniz!");
				do {

					System.out.println("1-Para Yatýrma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgulama\n" + "4-Çýkýþ Yap");
					System.out.print("Lütfen yapmak istediðiniz iþlemi seçiniz:");
					select = input.nextInt();
					switch (select) {
					case 1:
						System.out.println("Para Miktarý: ");
						int price = input.nextInt();
						balance += price;
						System.out.println("Yeni bakiyeniz : " + balance);
						break;
					case 2:
						System.out.println("Para Miktarý: ");
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
				System.out.println("Hoþçakalýn");
				break;
			} else {
				right--;
				System.out.println("Hatalý kullanýcý adý ya da þifre. Tekrar Deneyiniz");
				if (right == 0) {
					System.out.println("Hesabýnýz bloke olmuþtur lütfen banka ile iletiþime geçiniz. ");
				} else {
					System.out.println("Kalan hakkýnýz: " + right);
				}
			}

		}
	}

}
