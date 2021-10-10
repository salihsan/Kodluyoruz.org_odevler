package odevler.donguler;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi giriniz : ");
        int s = scan.nextInt();
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        System.out.print(num1 + " " + num2);
        for (int i = 0; i < s; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(" " + num3);
        }
    }
}
