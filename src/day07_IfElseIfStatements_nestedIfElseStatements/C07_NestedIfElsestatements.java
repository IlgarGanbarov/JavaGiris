package day07_IfElseIfStatements_nestedIfElseStatements;

import java.util.Scanner;

public class C07_NestedIfElsestatements {
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

        if (cinsiyet=='E')
        if (yas<20||yas>80) System.out.println("gecersiz yas");
        else if (yas>=65) System.out.println("Erkek emekli ola bilir");
        else System.out.println("emekli olmak icin"+(65-yas)+"yil calismalisiniz");
         if (cinsiyet=='K')
          if (yas<20||yas>80) System.out.println("gecersiz yas");
          else if (yas>=65) System.out.println("Kadin emekli ola bilir");
          else System.out.println("emekli olmak icin"+(65-yas)+" yil calismalisiniz");

          System.out.println("Cinsiyyet icin K veya E girmelisiniz");


    }
}
