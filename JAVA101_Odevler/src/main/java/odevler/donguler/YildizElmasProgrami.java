package odevler.donguler;

import java.util.Scanner;

public class YildizElmasProgrami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = scan.nextInt();
        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = 0; i <= n ; i++) {
            for (int j =0; j<=(i-1); j++) {
                System.out.print(" ");
            }
            for (int k =(2 *(n-i)+1) ; k >0;k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}





