package odevler.donguler;

import java.util.Scanner;

public class RecursiveAsalSayiBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int num = scan.nextInt();

        if(asalSayi(2,num)==0)
            System.out.println("Bu bir Asal sayidir");
        else
            System.out.println("Bu bir Asal sayi degildir");

    }

    static int asalSayi(int i,int num){
        if(num==i)
            return 0;
        else
        if(num%i==0)
            return 1;
        else{
            return asalSayi(i+1,num);
        }
    }
}
