package day12_stringmanipulations;

import java.util.Scanner;

public class C03_Isimkontrol {
    public static void main(String[] args) {

        //Soru 6 : Kullanicidan bir String alin,
//         String'in uzunlugu cift sayi ise tam ortasina :) ekleyin,
//         String'in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bir metin giriniz..");
        String metin=scanner.nextLine();

        //Eghbal uzunluk===> ilk yarisi+:)+ikinci yarisi
        //Seren uzunluk==>5 5/2.indexi replace:(

        if (metin.length()%2==0){
            System.out.println(metin.substring(0,metin.length()/2)+
                    ":)"+
                    metin.substring(metin.length()/2)

            );}else {
            System.out.println(
                    metin.substring(0,metin.length()/2)+
                            ":("+metin.substring(0,metin.length()/2+1
            ));}



    }
}
