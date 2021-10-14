package odevler.donguler;

import java.util.Scanner;

public class RecursiveDesen {
    public static int RecursiveDeseni(int n){

        if (0>n ||n==0) {
            System.out.print(" "+n);
            return n+5;
        }else {
            System.out.print(" "+n);
            n =RecursiveDeseni(n-5 );
            System.out.print(" "+n);
            return n+5;

        }


    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayi giriniz : ");
       int  n = scan.nextInt();
        RecursiveDeseni(n);

    }

}
