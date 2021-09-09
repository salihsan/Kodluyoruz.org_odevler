package odevler;

import java.util.Scanner;

public class TaksiMetre {
    public static void main(String[] args) {

        int km;
        double perKm=2.20,toplam,acilisFiyati=10;
        Scanner girdi= new Scanner(System.in);
        System.out.println("mesafeyi km cinsinden giriniz : ");
        km = girdi.nextInt();
        toplam= km*perKm;
        toplam += acilisFiyati;

        toplam = (toplam<20)? 20:toplam;
        System.out.println("Toplam Tutar : " +toplam);


    }
}
