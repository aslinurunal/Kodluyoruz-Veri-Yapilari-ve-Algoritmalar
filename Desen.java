package javaBaslangic;

import java.util.Scanner;

public class Desen {
    static int minus(int n, int numb) {
        System.out.print(n + " ");
        if (n <= 0) {
            return plus(n + 5, numb);
        } else {
            return minus(n - 5, numb);
        }
   
    }

    static int plus(int n,int numb){
        System.out.print(n + " ");
        if(n == numb){
            return 0;
        }
        else {
        return plus(n + 5, numb);
    }
    }
    public static void main(String[] args){ 

        int n, numb;
        Scanner scan= new Scanner(System.in);

        System.out.print("Bir Sayı giriniz: ");
        n= scan.nextInt();
        numb = n;
        minus(n, numb);
    }
}