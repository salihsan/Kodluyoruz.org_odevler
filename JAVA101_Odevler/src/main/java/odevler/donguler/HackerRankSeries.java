package odevler.donguler;

import java.util.Scanner;

public class HackerRankSeries {
    /* We use the integers a,b,n and  to create the following series:
(a+2°.b),(a+2°.b+2¹.b),(a+2°.b+2¹+b+2².b),(a+2°.b+2¹.b+2².b+2³.b),.....2^n-1.b
You are given  queries in the form of , , and . For each query, print the series corresponding to the given , ,
 and  values as a single line of  space-separated integers.
    * */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi giriniz : ");
        int t = scan.nextInt();
        int s0=0;
        for(int i=0;i<t;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();

            for(int j=0;j<n;j++){

                a+=b;
                if(j>0)
                System.out.print(" ");
                System.out.print(a);

                b*=2;

            }
            System.out.print(" ");
            break;
        }


    }
}
