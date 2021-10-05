package odevler.donguler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MaxMinDegeriBulanProgram {
    public static void main(String[] args) {

//        Kaç tane sayı gireceksiniz: 4
//        1. Sayıyı giriniz: 16
//        2. Sayıyı giriniz: -22
//        3. Sayıyı giriniz: -15
//        4. Sayıyı giriniz: 100
//        En büyük sayı: 100
//        En küçük sayı: -22

        Scanner scan =new Scanner(System.in);
        int min = 0;
        int max = 0;

        int[] dizi = new int[4];
        for(int i=0; i<dizi.length; i++){
            System.out.print((i+1) + "." + "Sayıyı Giriniz. :" );


             int sayi =scan.nextInt();
                if (i==0){
                    min=sayi;
                    max=sayi;
                }else {
                    if (sayi>max){ max=sayi;}
                    if (sayi<min){ min=sayi;}
                }

            }

        // Dizinin en küçük ve en büyük elemanlarını bulduk
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);







    }
}
