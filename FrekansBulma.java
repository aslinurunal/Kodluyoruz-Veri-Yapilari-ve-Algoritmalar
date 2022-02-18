package javaBaslangic;

import java.util.Arrays;

public class FrekansBulma {

	public static void main(String[] args) {

		int[] list = { 10, 20, 20, 10, 10, 20, 5, 20 };
		int count = 0;

		Arrays.sort(list);
		System.out.println("Tekrar Sayýlarý: ");
		System.out.println(Arrays.toString(list));

		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				if (list[i] == list[j]) {
					count++;
				}
			}
			if (list[i] != list[i + 1]) {
				System.out.println(list[i] + " sayýsý " + count + " kez tekrar edildi.");
			}
			if ((list[i] == list[list.length - 1]) && (i == list.length - 2)) {
				System.out.println(list[list.length - 1] + " sayýsý " + count + " kez tekrar edildi.");
			}
			count = 0;
		}

	}

}
