package odevler.kosulluifadeler;

import java.util.Scanner;

public class UcakBiletiHesapla {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Gidececeginiz Mesafeyi (km) Giriniz :");
        int mesafe = giris.nextInt();
        System.out.println("Yasinizi Giriniz :");
        int yas = giris.nextInt();
        System.out.println("1-Tek Yön,\n2-Gidiş-Dönüş\n icin secim yapiniz :");
        int yon = giris.nextInt();

        double normalTutar =0.10*mesafe;
        double yasindirimi,indirimliTutar,toplamTutar;
        double onIkiYas=0.5,onIkiYirmiDortYas=0.1,altmisBesYas=0.3,yonIndirim=0.2;

        if (yon==1) {
            if (12 > yas) {
                yasindirimi = normalTutar * onIkiYas;
                indirimliTutar = normalTutar - yasindirimi;
                System.out.println(indirimliTutar);
            } else if (12 < yas && yas <= 24) {
                yasindirimi=normalTutar*onIkiYirmiDortYas;
                indirimliTutar=normalTutar-yasindirimi;
                System.out.println(indirimliTutar);

            }else if (yas>65){
                yasindirimi=normalTutar*altmisBesYas;
                indirimliTutar=normalTutar-yasindirimi;
                System.out.println(indirimliTutar);
            }else{
                System.out.println(normalTutar);
            }
        }else if (yon==2){
            if (12 > yas) {
                yasindirimi = normalTutar * onIkiYas;
                indirimliTutar = normalTutar - yasindirimi;
                double gidisDonusIndirimi=indirimliTutar*yonIndirim;
                toplamTutar=(indirimliTutar-gidisDonusIndirimi)*2;
                System.out.println(toplamTutar);

            } else if (12 < yas && yas <= 24) {
                yasindirimi=normalTutar*onIkiYirmiDortYas;
                indirimliTutar=normalTutar-yasindirimi;
                double gidisDonusIndirimi=indirimliTutar*yonIndirim;
                toplamTutar=(indirimliTutar-gidisDonusIndirimi)*2;
                System.out.println(toplamTutar);

            }else if (yas>65){
                yasindirimi=normalTutar*altmisBesYas;
                indirimliTutar=normalTutar-yasindirimi;
                double gidisDonusIndirimi=indirimliTutar*yonIndirim;
                toplamTutar=(indirimliTutar-gidisDonusIndirimi)*2;
                System.out.println(toplamTutar);
            }else{
                double gidisDonusIndirimi=normalTutar*yonIndirim;
                toplamTutar=(normalTutar-gidisDonusIndirimi)*2;
                System.out.println(toplamTutar);
            }

        }else {
            System.out.println("HatalıVeriGirdiniz!");

        }






    }
}
