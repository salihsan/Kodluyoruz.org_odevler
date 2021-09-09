package odevler;

import java.util.Scanner;

import static java.lang.Math.ceil;
import static java.lang.Math.round;

public class CemberAlaniVeCevresi {
    public static void main(String[] args) {
        double r;
        double pi = 3.14;
        double aci ;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Lutfen yaricapi ve merkez aciyi giriniz : ");
        r = girdi.nextDouble();
       aci = girdi.nextDouble();
        double alan = Math.floor((pi*(r*r)*aci)/360);
        System.out.println("Daire Dilimin Alani : " +alan);
    }
}
