package odevler;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double armut = 2.14,
                elma = 3.67,
                domates = 1.11,
                muz = 0.95,
                patlican = 5.00;
        System.out.println("========= Sepet ============");
        Scanner girdi =new Scanner(System.in);
        System.out.println("Armut Kac kg : ");
        double armutKg = girdi.nextDouble();
        System.out.println("Elma Kac kg : ");
        double elmaKg = girdi.nextDouble();
        System.out.println("Domates Kac kg : ");
        double domatesKg = girdi.nextDouble();
        System.out.println("Muz Kac kg : ");
        double muzKg = girdi.nextDouble();
        System.out.println("Patlican Kac kg : ");
        double patlicankg = girdi.nextDouble();
        double artmutTl=armut*armutKg;
        double elmaTl=elma*elmaKg;
        double domatesTl=domates*domatesKg;
        double muzTl=muz*muzKg;
        double patlicanTl=patlican*patlicankg;

        System.out.println("Armut Toplam Tutar : "+artmutTl+" TL");
        System.out.println("Elma Toplam Tutar : "+elmaTl+" TL");
        System.out.println("Domates Toplam Tutar : "+domatesTl+" TL");
        System.out.println("Muz Toplam Tutar : "+ muzTl+" TL");
        System.out.println("Patlican Toplam Tutar : "+patlicanTl+" TL");
        System.out.println("================TOPLAM TUTAR=================");
        double toplam = Math.floor(artmutTl+elmaTl+domatesTl+muzTl+patlicanTl);
        System.out.println("Toplam Sepet Tutari : "+toplam+" TL");

    }
}
