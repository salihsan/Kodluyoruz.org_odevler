package odevler;

import java.util.Scanner;

public class Vki {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double boy = girdi.nextDouble();
        System.out.println("Lutfen Kilonuzu (kg) Giriniz : ");
        int kg = girdi.nextInt();
        double vki = (kg /(boy*boy));
        System.out.println("Vücut Kitle İndeksiniz : " + vki);

    }
}
