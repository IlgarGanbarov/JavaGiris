package day12_stringmanipulations;

import java.util.Scanner;

public class C02_SifreKontrol {

    public static void main(String[] args) {
        //Soru 4 : Kullanicidan bir sifre isteyip,
//         asagidaki sartlari kontrol edin
//         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
//         eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
//         - ilk harf kucuk harf olmali
//         - son karakter rakam olmali
//         - sifre bosluk icermemeli
//         - uzunlugu en az 10 karakter olmali


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String sifre=scanner.nextLine();

        int flag=20;
        int sayac=0;


        char ilkharf=sifre.charAt(0);

        if (!Character.isLowerCase(ilkharf)){
            System.out.println("ilk karakter kucuk harf olmali");}
        flag=15;
        sayac++;

            char sonharf=sifre.charAt(sifre.length()-1);
        if (!(sonharf>='0'&&sonharf<='9')){
            System.out.println("son karakter rakam olmali");}
        flag=15;
        sayac++;
        if (sifre.contains("")){
            System.out.println("sifre bosluk icermemeli");}
        if (sifre.length()<10){
            System.out.println("sifrenin uzunlugu en az 10 karakter olmali");}
        flag=15;
        sayac++;

        if (flag==10){
            System.out.println("Sifre basarili olarak kaydedildi");}
        else {
            System.out.println(sayac+"adet hata yaptiniz,Lutfen tekrar deneyin");}
        if (sayac==0){
            System.out.println("lutfen hatalari duzelt");}


    }
}
