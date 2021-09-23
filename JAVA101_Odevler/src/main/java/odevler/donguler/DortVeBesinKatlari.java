package odevler.donguler;

import java.util.Scanner;

public class DortVeBesinKatlari {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        int n = scan.nextInt();

        System.out.println("============= 4'in Katlari ==========");
        for (int i=1;i<n;i*=4){
            System.out.println(i);

        }
//        int k;
//        do {
//             k = 1;
//             k++;
//            k*=4;
//            System.out.println(k);
//        }while (k<n);
        System.out.println("============= 5'in Katlari ==========");

        for (int i=1;i<n;i*=5){
            System.out.println(i);

        }

    }
}
