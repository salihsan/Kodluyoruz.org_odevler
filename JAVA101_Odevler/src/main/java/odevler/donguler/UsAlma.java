package odevler.donguler;

import java.util.Scanner;

public class UsAlma {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban : ");
        int taban = scan.nextInt();
        System.out.print("Us : ");
        int us = scan.nextInt();
        int total=1;
        for (int i=1;i<=us;i++){
            total *=taban;
        }
        System.out.println("Taban^Us : "+ total);
    }
}
