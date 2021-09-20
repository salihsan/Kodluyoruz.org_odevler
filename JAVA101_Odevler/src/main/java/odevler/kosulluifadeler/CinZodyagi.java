package odevler.kosulluifadeler;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner yil =new Scanner(System.in);
        System.out.println("Dogum yilinizi Yaziniz : ");
        int year= yil.nextInt();
        int mod = year%12;
        switch (mod){
            case 0:
                System.out.println("Maymun");
                break;
            case 1:
                System.out.println("Horoz");
                break;
            case 2:
                System.out.println("Kopek");
                break;
            case 3:
                System.out.println("Domuz");
                break;
            case 4:
                System.out.println("Fare");
                break;
            case 5:
                System.out.println("Okuz");
                break;
            case 6:
                System.out.println("Kaplan");
                break;
            case 7:
                System.out.println("Tavsan");
                break;
            case 8:
                System.out.println("Ejderha");
                break;
            case 9:
                System.out.println("Yılan");
                break;
            case 10:
                System.out.println("At");
                break;
            case 11:
                System.out.println("Koyun");
                break;
            default:
                System.out.println("Hatali secim yaptiniz");
                break;
        }
    }
}
