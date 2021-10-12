package odevler.donguler;

import java.util.Scanner;

public class PalindromSayi {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        isPalindrom(16661);
    }

    public static void isPalindrom(int n) {

        int length =String.valueOf(n).length();
        int ilkdeger=n;
        int kalan=0,tersi=0;
            for (int i = 0; i <length ; i++) {
                kalan = n % 10;
                tersi = tersi * 10 + kalan;
                n /= 10;

            }

        System.out.println("Sayi : "+ilkdeger);

        System.out.println("tersi : "+tersi);

        if(tersi == ilkdeger){
            System.out.println(tersi + " Palindrom Sayidir.");
        }else{
            System.out.println(tersi + " Palindrom Sayi Degildir.");
        }
        }



}
