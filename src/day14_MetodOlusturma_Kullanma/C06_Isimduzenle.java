package day14_MetodOlusturma_Kullanma;

import java.util.Scanner;

public class C06_Isimduzenle {
    public static void main(String[] args) {

        //kullanicidan main metod icerisinde ayri ayri isim ve soyisimlerini alin

        Scanner scanner=new Scanner(System.in);
        System.out.println("isminizi giriniz:");
        String isim=scanner.nextLine();
        System.out.println("Lutfen soyisminizi girin:");
        String soyisim=scanner.nextLine();
        System.out.println(isimduzenle(isim, soyisim));
        String duzenlenmisisim=isimduzenle(isim,soyisim);

    }

    public static String isimduzenle(String isim,String soyisim){

        String duzenlenmisIsim=isim.substring(0,1).toUpperCase()+
                                isim.substring(1).toLowerCase()+
                                " "+
                                soyisim.substring(0,1).toUpperCase()+
                                soyisim.substring(1).toLowerCase();
           return duzenlenmisIsim;


    }
}
