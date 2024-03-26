package day12_stringmanipulations;

import java.util.Scanner;

public class C08_Aralardakisayilariyazdirma {
    public static void main(String[] args) {

        //kullanicidan baslangic ve bitis deyerlerini alip
        //sinirlar dahil olarak
        //baslangicdan bitise kadar 7 ile bolunebilinen sayilari yazdirin
        //bitis degeri baslangictan kucuk olsad kod calismalidir



        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen baslangic degerini giriniz...");
        int baslangic= scanner.nextInt();

        System.out.println("lutfen bitis deyerini giriniz...");
        int bitis= scanner.nextInt();

        if (baslangic<bitis){
            for (int i = baslangic; i <=bitis ; i++) {
                if (i%9==0){
                    System.out.print(i+" ");}

            }



        }else {
                System.out.println("kghkjlhlknl");}





    }
}
