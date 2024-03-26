package day12_stringmanipulations;

import java.util.Scanner;

public class C07_AradakiSayilariYazdirma {
    public static void main(String[] args) {

        //kullanicidan baslangic ve bitis deyerlerini alip
        //sinirlar dahil olarak
        //baslangicdan bitise kadar 7 ile bolunebilinen sayilari yazdirin
        //bitis degeri baslangictan kucuk ise hata mesaji yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen baslangic degerini giriniz...");
        int baslangic= scanner.nextInt();

        System.out.println("lutfen bitis deyerini giriniz...");
        int bitis= scanner.nextInt();

        if (bitis < baslangic) {
            System.out.println("Bitis deyeri baslangictan kucuk olamaz");
        }else {
            for (int i = baslangic; i <=bitis ; i++) {

            }

        }

    }
}
