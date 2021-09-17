package odevler.kosulluifadeler;

import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {
        int sicaklik;
        Scanner input=new Scanner(System.in);
        System.out.println("Hava sicakligini giriniz : ");
        sicaklik = input.nextInt();


        if (sicaklik <5 ){
            System.out.println("Kayak yapabilirsiniz");
        }else if (sicaklik<=25){
            if (sicaklik<=15 && sicaklik >= 10){
                System.out.println("Sinemaya Veya Piknige Gidebilirsiniz");
            }else if(sicaklik<=10 && sicaklik >5 ){
                System.out.println("Sinemaya Gidebilirsiniz");
            }else if (sicaklik<25 && sicaklik >15){
                System.out.println("Piknige Gidebilirsiniz");
            }
        }else{
            System.out.println("Yuzmeye Gidebilirsiniz");
        }



    }
}
