package odevler.kosulluifadeler;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner yil =new Scanner(System.in);
        System.out.println("yil giriniz  : ");
        int year = yil.nextInt();
        if (year%100==0){
            if (year%400==0){
                System.out.println(year+" Artik yildir");
            }else {
                System.out.println(year+" Artik yil Degildir");
            }
        }else {
            if (year%4==0){
                System.out.println(year+" Artik yildir");
            }else {
                System.out.println(year+" Artik yil Degildir");
            }


        }
    }
}
