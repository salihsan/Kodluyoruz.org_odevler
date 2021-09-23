package odevler.donguler;

import java.util.Scanner;

public class UcDordeBolunenOrtalama {
    public static void main(String[] args) {


                Scanner scan = new Scanner(System.in);
                int sayi = 0;
                System.out.println("çarpanlarına ayrılacak sayıyı giriniz: ");
                sayi = scan.nextInt();
                int toplam=0;
                int count=0;

                for (int i=1;i<=sayi;i++){
                    if (i % 3==0 && i % 4==0){
                        toplam +=i;
                        count++;

                    }
                }
        System.out.println(count+"-"+toplam);
        System.out.println("3 ve 4'e Bolunen Sayilarin Ortalamasi : "+(toplam/count));


            }
        }






