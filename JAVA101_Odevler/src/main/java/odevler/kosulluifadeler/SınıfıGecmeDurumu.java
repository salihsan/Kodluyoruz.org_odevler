package odevler.kosulluifadeler;

import java.util.Scanner;

public class SınıfıGecmeDurumu {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce,muzik;
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik Notunuz : ");
        mat = input.nextInt();
        System.out.println("Fizik Notunuz : ");
        fizik = input.nextInt();
        System.out.println("Kimya Notunuz : ");
        kimya = input.nextInt();
        System.out.println("Turkce Notunuz : ");
        turkce = input.nextInt();
        System.out.println("Muzik Notunuz : ");
        muzik = input.nextInt();
        int toplam =(mat+fizik+kimya+turkce+muzik);
        double sonuc=toplam/5;
        if(sonuc>55 && sonuc<=100 && sonuc >= 0){
            System.out.println("Sinifi Gecti : "+sonuc);

        }else {
            System.out.println("Sinifta Kaldi : "+sonuc);
        }
    }
}
