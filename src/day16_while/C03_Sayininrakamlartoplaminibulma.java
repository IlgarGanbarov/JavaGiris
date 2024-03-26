package day16_while;

import java.util.Scanner;

public class C03_Sayininrakamlartoplaminibulma {
    public static void main(String[] args) {

        //Soru 2- While loop kullanarak
        // kullanicidan alinan sayinin rakamlar toplamini bulun.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen rakamlari toplanacak pozitif tam sayiyi giriniz...");

        int sayi=scanner.nextInt();

        //172104

        int ensondakirakam=0;
        int rakamlartoplami=0;
        int verilenSayi=sayi;

        while (verilenSayi>0){

            ensondakirakam=verilenSayi%10;
            rakamlartoplami+=ensondakirakam;
            verilenSayi/=10;
        }

        System.out.println(" Verilen " +sayi+ " sayisinin rakamlar toplami: "+rakamlartoplami);
    }
}
