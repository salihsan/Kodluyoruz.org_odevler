package odevler.donguler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BasamakDegerlerininToplami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi giriniz : ");
        int s = scan.nextInt();
        //136
        int adet=0;
        int rakamlarToplami=0;

            while (s != 0){
                rakamlarToplami+= s%10;
                s/=10;
                adet++;
            }
        System.out.println(adet+" Basamakli Sayinin Rakamlar Toplami : "+rakamlarToplami);

    }

}

