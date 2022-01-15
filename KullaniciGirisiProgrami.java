package javaBaslangic;

import java.util.Scanner;

public class KullaniciGirisiProgrami {

	public static void main(String[] args) {
		String userName = "patika";
		String password = "java123";
		String inpUserName, inpPassword, inputPassword;
		int select;

		Scanner input = new Scanner(System.in);

		System.out.print("Kullanýcý Adýnýz: ");
		inpUserName = input.nextLine();

		System.out.print("Þifreniz: ");
		inpPassword = input.nextLine();

		if (inpUserName.equals("patika") && inpPassword.equals("java123")) {
			System.out.println("Giriþ Yaptýnýz!");
		} else if (inpUserName.equals(userName) && inpPassword != password) {
			System.out.println("Hatalý Þifre!");
			System.out.print("Þifrenizi deðiþtirmek için 1'e çýkýþ yapmak için 2'ye basýnýz: ");
			select = input.nextInt();
			if (select == 1) {
				Scanner girdi = new Scanner(System.in);
				System.out.print("Lütfen yeni þifrenizi giriniz: ");
				inputPassword = girdi.nextLine();
				if (inputPassword.equals(inpPassword)) {
					System.out.println("Þifre oluþturulamadý lütfen baþka þifre giriniz.");
				} else if (inputPassword.contentEquals(password)) {
					System.out.println("Þifre oluþturulamadý lütfen baþka þifre giriniz.");
				} else {
					System.out.println("Þifre baþarýyla oluþturuldu!");
				}
			} else if (select == 2) {
				System.out.println("Çýkýþ yapýldý!");
			}

			else {
				System.out.println("Hatalý giriþ yaptýnýz!");
			}
		} else if (inpUserName != userName && inpPassword.equals(password)) {
			System.out.println("Hatalý kullanýcý adý!");

		} else {
			System.out.println("Kullanýcý adý ve þifre hatalý!");
		}
	}
}
