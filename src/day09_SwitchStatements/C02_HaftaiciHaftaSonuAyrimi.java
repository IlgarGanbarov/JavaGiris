package day09_SwitchStatements;

import java.util.Scanner;

public class C02_HaftaiciHaftaSonuAyrimi {
    public static void main(String[] args) {


        //kullanicidan gun numarasini isteyin
        //1-pazartesi....7 pazar olacak sekilde
        //girilen mesaj karsilik gelen gun ismini yazdirin
        //kullanici 1-7 arasinda sayi girmezse hata hata mesaji verin

        Scanner scanner = new Scanner(System.in);

        System.out.println("gun ismini yazdirmak icin 1-7 arasi bir tamsayi giriniz");
        int gunNo = scanner.nextInt();
        switch (gunNo) {
            case 1:

            case 2:

            case 3:

            case 4:

            case 5:

            case 6:
            case 7:
                System.out.println("Hafta ici");
                break;
            default:
                System.out.println("Gecerli bir gun giriniz..");}


        }
    }
