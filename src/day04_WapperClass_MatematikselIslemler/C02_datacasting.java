package day04_WapperClass_MatematikselIslemler;

import java.util.Scanner;

public class C02_datacasting {
    public static void main(String[] args) {

        //int olarak verilen 3 deyerin ortalamasini
        //double olarak yazdiran bir kod yazin

        Scanner scanner=new Scanner(System.in);

        System.out.println("lutfen 3 tam sayi giriniz");

        int sayi1=scanner.nextInt();

        int say2=scanner.nextInt();

        int sayi3=scanner.nextInt();

        //Islem yapilan sayilarin heosi int ise java int verir

        //Bölme isleminde pay ve paydayi doble yaparsak sonuc double olur

        System.out.println("Girilen sayilarin ortalamasi"+(double)(sayi1+say2+sayi3)/3);

        System.out.println("Girilen sayilarin ortalamasi"+(sayi1+say2+sayi3)/3);
    }
}
