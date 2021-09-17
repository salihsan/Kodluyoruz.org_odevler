package odevler;

import java.util.Scanner;

public class KullaniciGirisi {


    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        String user,password;
        System.out.println("Kullanici Adiniz : ");
        user = giris.nextLine();
        System.out.println("Sifrenizi Giriniz : ");
        password =giris.nextLine();
        if (user.equals("patika") && password.equals("java123")){
            System.out.println("Giris Basarili");
        }else{
            System.out.println("hatali giris yaptiniz !!");
        }
    }
}
