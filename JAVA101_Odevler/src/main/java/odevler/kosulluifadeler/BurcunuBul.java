package odevler.kosulluifadeler;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class BurcunuBul {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        System.out.println("Ay Seciminizi yapiniz :");
        String month = giris.nextLine();
        System.out.println("Gun Seciminizi yapiniz :");
        int day = giris.nextInt();


        if ((19 < day && month.equalsIgnoreCase("şubat")) || (day <= 20 && month.equalsIgnoreCase("Mart"))) {
            System.out.println("Balik Burcu");
            } else if ((22 <= day && month.equalsIgnoreCase("ocak")) || (day <= 19 && month.equalsIgnoreCase("şubat"))) {
            System.out.println("Kova Burcu");
            } else if ((22 <= day && month.equalsIgnoreCase("aralık")) || (day <= 21 && month.equalsIgnoreCase("ocak"))) {
                System.out.println("Oğlak Burcu");
            } else if ((22 <= day && month.equalsIgnoreCase("kasım")) || (day <= 21 && month.equalsIgnoreCase("aralık"))) {
                System.out.println("Yay Burcu");
            } else if ((22 < day && month.equalsIgnoreCase("ekim")) || (day <= 21 && month.equalsIgnoreCase("kasım"))) {
                System.out.println("Akrepk Burcu");
            } else if ((22 < day && month.equalsIgnoreCase("eylül")) || (day <= 22 && month.equalsIgnoreCase("ekim"))) {
                System.out.println("Terazi Burcu");
            } else if ((22 < day && month.equalsIgnoreCase("ağustos")) || (day <= 22 && month.equalsIgnoreCase("eylül"))) {
                System.out.println("Başak Burcu");
            } else if ((22 < day && month.equalsIgnoreCase("temmuz")) || (day <= 22 && month.equalsIgnoreCase("ağustos"))) {
                System.out.println("Aslan Burcu");
            } else if ((22 < day && month.equalsIgnoreCase("haziran")) || (day <= 22 && month.equalsIgnoreCase("temmuz"))) {
                System.out.println("Yengeç Burcu");
            } else if ((21 < day && month.equalsIgnoreCase("mayıs")) || (day <= 22 && month.equalsIgnoreCase("haziran"))) {
                System.out.println("ikizler Burcu");
            } else if ((20 < day && month.equalsIgnoreCase("nisan")) || (day <= 21 && month.equalsIgnoreCase("mayıs"))) {
                System.out.println("Boğa Burcu");
            } else if ((20 < day && month.equalsIgnoreCase("mart")) || (day < 21 && month.equalsIgnoreCase("nisan"))) {
                System.out.println("Koç Burcu");
            }else {
            System.out.println("Gecerli secim yapiniz");
        }

    }
}