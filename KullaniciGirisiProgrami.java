package javaBaslangic;

import java.util.Scanner;

public class KullaniciGirisiProgrami {

	public static void main(String[] args) {
		String userName = "patika";
		String password = "java123";
		String inpUserName, inpPassword, inputPassword;
		int select;

		Scanner input = new Scanner(System.in);

		System.out.print("Kullan�c� Ad�n�z: ");
		inpUserName = input.nextLine();

		System.out.print("�ifreniz: ");
		inpPassword = input.nextLine();

		if (inpUserName.equals("patika") && inpPassword.equals("java123")) {
			System.out.println("Giri� Yapt�n�z!");
		} else if (inpUserName.equals(userName) && inpPassword != password) {
			System.out.println("Hatal� �ifre!");
			System.out.print("�ifrenizi de�i�tirmek i�in 1'e ��k�� yapmak i�in 2'ye bas�n�z: ");
			select = input.nextInt();
			if (select == 1) {
				Scanner girdi = new Scanner(System.in);
				System.out.print("L�tfen yeni �ifrenizi giriniz: ");
				inputPassword = girdi.nextLine();
				if (inputPassword.equals(inpPassword)) {
					System.out.println("�ifre olu�turulamad� l�tfen ba�ka �ifre giriniz.");
				} else if (inputPassword.contentEquals(password)) {
					System.out.println("�ifre olu�turulamad� l�tfen ba�ka �ifre giriniz.");
				} else {
					System.out.println("�ifre ba�ar�yla olu�turuldu!");
				}
			} else if (select == 2) {
				System.out.println("��k�� yap�ld�!");
			}

			else {
				System.out.println("Hatal� giri� yapt�n�z!");
			}
		} else if (inpUserName != userName && inpPassword.equals(password)) {
			System.out.println("Hatal� kullan�c� ad�!");

		} else {
			System.out.println("Kullan�c� ad� ve �ifre hatal�!");
		}
	}
}
