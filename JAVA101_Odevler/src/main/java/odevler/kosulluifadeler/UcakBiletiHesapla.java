package odevler.kosulluifadeler;

import java.util.Scanner;

public class UcakBiletiHesapla {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Gidececeginiz Mesafeyi (km) Giriniz :");
        int mesafe = giris.nextInt();
        System.out.println("Gidececeginiz Mesafeyi (km) Giriniz :");
        int yas = giris.nextInt();
        System.out.println("1-Tek Yön,\n 2-Gidiş-Dönüş icin secim yapiniz :");
        int yon = giris.nextInt();
        double mesafetoplamFiyat =0.10*mesafe;
        double tekCiftYon = (yon == 1 ? mesafetoplamFiyat:(yon==2 ? 2*mesafetoplamFiyat:' '));
        double toplamFiyat =mesafetoplamFiyat+tekCiftYon;
        System.out.println(toplamFiyat);
    }
}
