package odevler.donguler;

import java.util.Scanner;

public class YuzeKadarAsalSayilar {
    public static void main(String[] args) {

        int sayac = 0;

        for(int i = 2; i <=100; i++)
        {
            for (int j = 2; j <i ; j++) {
                if (i%j !=0){
                    sayac++;
                    if (sayac==i-2){
                        System.out.print(i+" - ");
                        sayac=0;
                    }

            }else{
                    sayac=0;
                    break;
                }

            }


        }




}
}
