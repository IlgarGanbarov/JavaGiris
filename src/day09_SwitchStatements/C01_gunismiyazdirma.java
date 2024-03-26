package day09_SwitchStatements;

import java.util.Scanner;

public class C01_gunismiyazdirma {
    public static void main(String[] args) {
        //kullanicidan gun numarasini isteyin
        //1-pazartesi....7 pazar olacak sekilde
        //girilen mesaj karsilik gelen gun ismini yazdirin
        //kullanici 1-7 arasinda sayi girmezse hata hata mesaji verin

        Scanner scanner=new Scanner(System.in);
        System.out.println("gun ismini yazdirmak icin 1-7 arasi bir tamsayi giriniz");

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir gun numarasi giriniz...");
        int gun = scan.nextInt();
        switch (gun){
            case 1 :
                System.out.println("Gun = " + " Pazartesi");
                break;
            case 2 :
                System.out.println("Gun = " + " Sali");
                break;
            case 3 :
                System.out.println("Gun = " + " Carsamba");
                break;
            case 4 :
                System.out.println("Gun = " + " Persembe");
                break;
            case 5 :
                System.out.println("Gun = " + " Cuma");
                break;
            case 6 :
                System.out.println("Gun = " + " Cumartesi");
                break;
            case 7 :
                System.out.println("Gun = " + " Pazar");
                break;
            default:
                System.out.println("Gecerli bir gun giriniz..");
        }





            //Switch sa
        }
    }

