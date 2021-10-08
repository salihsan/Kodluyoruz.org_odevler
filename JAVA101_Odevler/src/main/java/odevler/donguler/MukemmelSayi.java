package odevler.donguler;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz : ");
        int n =scan.nextInt();
        int toplam=0;
        for (int i=1;i<n;i++){
            if (n%i==0){
                toplam +=i;
            }
        }
        System.out.println("Rakamalari Toplami = "+toplam);
        if(n==toplam){
            System.out.println(n+" sayisi Mukemmel sayidir");
        }else{
            System.out.println(n+"sayisi Mukemmel sayi degildir");
        }
    }
}
