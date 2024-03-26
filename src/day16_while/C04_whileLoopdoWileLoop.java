package day16_while;

import java.util.Scanner;

public class C04_whileLoopdoWileLoop {

    public static void main(String[] args) {


        //Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar
        // isteyinKullaniciya bitirmek istediginde 0'a basmasini soyleyin
        // Kullanici bitirmek istediginde toplam kac adet pozitif
        // tam sayi girdiginive bunlarin toplaminin kac oldugunu yazdirin
        // Kullanici negatif sayi girerse
        // "negatif sayi kullanamazsiniz " yazdirin bu negatif sayiyi sayi adedine
        // ve toplama eklemeyin

        Scanner scanner=new Scanner(System.in);


        int sayi=6;
        int sayiToplami=0;
        int sayiAdedi=0;

        while (sayi!=0){
            System.out.println("lutfen toplamak uzere pozitif tam sayi giriniz..."+
                    "\nBitirmek icin 0'a basin");

                   sayi=scanner.nextInt();

                   if (sayi<0){// girilen sayi negativ ise
                       System.out.println("Negatif sayi kullanamazsiniz");

                   } else if (sayi>0) {//girilen sayi pozitiv ise
                       sayiToplami+=sayi;
                       sayiAdedi++;



                   }

        }
        System.out.println("Girilen " +sayiAdedi +" adet pozitif sayinin toplamai: "+sayiToplami);




    }
}
