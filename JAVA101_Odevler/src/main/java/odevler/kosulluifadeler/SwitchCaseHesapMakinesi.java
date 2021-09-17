package odevler.kosulluifadeler;

import java.util.Scanner;

public class SwitchCaseHesapMakinesi {
    public static void main(String[] args) {
        int s1=0,s2=0,secim=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Islem secinizi yapiniz : \n01-Toplama\n02-Cikarma\n03-Carpma\n04-Bolme\n");
        secim = input.nextInt();
        System.out.println("Birinci Sayiyi giriniz : ");
        s1= input.nextInt();
        System.out.println("Ikinci Sayiyi giriniz : ");
        s2= input.nextInt();


        switch (secim) {
            case 1:
                System.out.println("Toplama islemi Sonucu : "+(s1+s2));
                break;
            case 2:
                System.out.println("Cikarma islemi Sonucu : "+(s1-s2));
                break;
            case 3:
                System.out.println("Carpma islemi Sonucu : "+(s1*s2));
                break;
            case 4:

                if (s2!= 0){
                    System.out.println("Bolme islemi Sonucu : "+(s1/s2));
                }else{
                    System.out.println("Payda da '0' Olamaz");
                }
                break;
            default:
                System.out.println("Hatali islem yaptiniz!!!");
                break;
        }

    }
}
