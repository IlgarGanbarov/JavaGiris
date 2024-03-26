package day19_Arrays;

import javax.naming.PartialResultException;

public class C04_Tekveciftuzunluktakelimelerisay {
    public static void main(String[] args) {

        // verilen bir String array'deki
         // her bir kelimeyi kontrol edip
        // array'de kac tane tek sayi uzunlugunda,
        // kac tane cift sayi uzunlugunda
        // kelime bulundugunu yazdiran bir method olusturun




    }
    public static void kactaneCiftKactaneTekvar(String[]arr){

        int teksayiadet=0;
        int ciftsayiadet=0;
        for (int i = 0; i <arr.length ; i++) {


            if (arr[i].length()%2==0)ciftsayiadet++;
            else teksayiadet++;
            
        }
        System.out.println("Teksayi uzunlugundaki kelime sayi:"+teksayiadet);
        System.out.println("Ciftsayi uzunlugundaki cift sayi:" +ciftsayiadet);
    }
}
