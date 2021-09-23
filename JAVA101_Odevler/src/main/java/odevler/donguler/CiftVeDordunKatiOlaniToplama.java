package odevler.donguler;

import java.util.Scanner;

public class CiftVeDordunKatiOlaniToplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        int n = scan.nextInt();
        int toplam=0;


            for (int i=1;i<=n;i++) {
                if (i % 2 == 0 && i % 4 == 0) {
                    toplam += i;
                }
            }
            System.out.println(toplam);

    }
}
