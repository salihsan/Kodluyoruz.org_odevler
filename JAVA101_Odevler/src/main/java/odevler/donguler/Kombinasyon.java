package odevler.donguler;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1' inci sayiyi Giriniz : ");
        int n = scan.nextInt();
        System.out.print("2'ci sayiyi giriniz : ");
        int r = scan.nextInt();
        int total =1;
        for (int i=1;i<=n;i++){
            total *=i;
        }
        System.out.println("n! : "+total);
        System.out.println("========================");
        int total2 =1;
        for (int i=1;i<=r;i++){
            total2 *=i;
        }
        System.out.println("r! : "+total2);
        System.out.println("==========================");

        int total3=1;
        for (int i=1;i<=(n-r);i++){
            total3 *=i;
        }
        System.out.println("(n-r)! : "+total3);
        System.out.println("==========================");
        double c =total/(total2*total3);
        System.out.println("C(n,r) = n!/(r!*(n-r)!) : "+c);
    }
}
