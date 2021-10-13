package odevler.donguler;

import java.util.Scanner;

public class RecursiveExponantial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int taban = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int us = scan.nextInt();
        System.out.println( recursiveUsAlma(taban,us));
    }
    public static int recursiveUsAlma(int taban, int us) {
        if (us != 0) {
            return (taban * recursiveUsAlma(taban, us - 1));
        }
        else {
            return 1;
        }

    }
}
