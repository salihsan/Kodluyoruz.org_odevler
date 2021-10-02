package odevler.donguler;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen Birinci Sayiyi Giriniz : ");
        int n1 = scan.nextInt();
        System.out.print("Lutfen Ikinci Sayiyi Giriniz : ");
        int n2 = scan.nextInt();
        int ebob =1;
        int i=1;
        while (i<=n1){
            if (n1%i==0 && n2%i==0){
                 System.out.println(n1+" ve "+ n2+"\'nin Ortak boleni : "+i);
                ebob=i;
             }
            i++;

        }
        System.out.println("=========================");
        System.out.println(n1+" Ve "+n2+"\'nin EBOB'u : "+ebob);

        System.out.println("=========== EKOK ==============");
        int k=1;
        while (k<(n1*n2)){
            if (k%n1 == 0 && k % n2 == 0){
                 System.out.println(n1+" Ve "+n2+"\'nin EKOK'u : "+k);
                 break;
             }
            k++;
        }



    }
}
