package day07_IfElseIfStatements_nestedIfElseStatements;

import java.util.Scanner;

public class C02_IfElseIfStatements {
    public static void main(String[] args) {
         /*
         verilen gorev sonucunda yazdiginiz kod
         else (geriye kalanlar)ile bitmeyebilir
         EGER
         If.Else-If.... cumleleri
         bazi degerler icin bir If body'si

          */
        //kullanicidan bir sayi alin,
        //sayi kucukse "negatif" yazdirin
        //negatif olmayan sayilardan
        //tek basamakli olanlar icin"Rakam"
        //iki basamakli sayilar icin"Sayi"
        //uc basamakli sayilar icin"Buyuk sayi" yazdirun

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int girilensayi=scanner.nextInt();

        if (girilensayi<0) System.out.println("Negatif sayi");
        else if (girilensayi<10) System.out.println("Rakam");
        else if (girilensayi<100) System.out.println("Sayi");
        else if (girilensayi<1000) System.out.println("Buyuk sayi");





    }
}
