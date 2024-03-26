package day07_IfElseIfStatements_nestedIfElseStatements;

import java.util.Scanner;

public class C05_IfElseIfStatements {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya “Emekli olmak icin ..
        // Yil daha calisman gerekir” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz K: kadin,E:Erkek");
        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("lutfen yasinizi giriniz..");
        double yas=scan.nextDouble();
        if (cinsiyet=='K'&&yas>=60){
            System.out.println("kadin emekli ola bilir");}else if (cinsiyet=='K'&& yas<60){
            System.out.println("Emeklimolmak icin daha"+(60-yas)+"yil calismalisiniz");} else if
        (cinsiyet=='E'&&yas>60){
            System.out.println("Erkek emekli ola bilir");}









    }
}
