package odevler;

import java.util.Scanner;

public class KdvHesapla {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Para miktariniz : ");
        int miktar = giris.nextInt();
        if (miktar>0 && miktar<=1000) {
           double Kdv= miktar*0.18;
            double Kdvli= miktar*1.18;
            System.out.println("Hesaplanan Kdv : "+Kdv);
            System.out.println("Hesaplanan Kdv'li Miktar : "+Kdvli);

        }else if(miktar>1000){
            double Kdv= miktar*0.08;
            double Kdvli= miktar*1.08;

            System.out.println("Hesaplanan Kdv : "+Kdv);
            System.out.println("Hesaplanan Kdv'li Miktar : "+Kdvli);

        }
    }
}
