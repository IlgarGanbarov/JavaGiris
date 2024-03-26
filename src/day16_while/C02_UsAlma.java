package day16_while;

import java.util.Scanner;

public class C02_UsAlma {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        // While loop kullanarak verilen sayinin
        // istenen ussunu hesaplayip yazdiran bir method olusturun.

        usAl(3,4);//81
        usAl(2,5);//32


    }

    public static void usAl(int sayi,int pozitifus){
        //2 uzeri 4'u hesapla===>2*2*2*2=16

        int sonuc=1;
        int hesaplanacakus=pozitifus;

        while (hesaplanacakus>0){
            sonuc*=sayi;
            hesaplanacakus--;

        }

        System.out.println(sayi+ " uzeri " +pozitifus+ "=" +sonuc);
    }
}
