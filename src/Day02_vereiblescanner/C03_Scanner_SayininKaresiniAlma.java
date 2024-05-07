package Day02_vereiblescanner;

import java.util.Scanner;

public class C03_Scanner_SayininKaresiniAlma {
    public static void main(String[] args) {

        // Kullanicidan bir tamsayi isteyip
        // sayinin karesini yazdirin

        Scanner scanner = new Scanner(System.in);//1

        System.out.println("Lutfen bir tamsayi giriniz...");//2

        int girilenSayi = scanner.nextInt();//3

        System.out.println("Girilen sayinin karesi : " + girilenSayi*girilenSayi);//4

        }


    }









