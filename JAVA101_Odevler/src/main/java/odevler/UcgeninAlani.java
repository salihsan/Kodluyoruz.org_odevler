package odevler;

import java.util.Scanner;

public class UcgeninAlani {
    public static void main(String[] args) {
        Scanner girdi =new Scanner(System.in);
        System.out.println("Ucgenin Kenarlarini Giriniz ( a, b ,c): ");
        double a = girdi.nextDouble(), b = girdi.nextDouble(), c = girdi.nextDouble();
        double u=(a+b+c)/2;
        double alan =u*(u-a)*(u-b)*(u-c);
        System.out.println("=============== Ucgenin Alani=================");
        System.out.println("Kenarlari Bilinen Ucgenin alani : "+alan);
    }
}
