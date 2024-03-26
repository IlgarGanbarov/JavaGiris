package day13_forloop_nestedforloop;

import java.util.Scanner;

public class C06_AsalsayiKontrol {
    public static void main(String[] args) {


        //Soru 11- Kullanicidan pozitif bir tamsayi isteyip,
        // sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen pozizif bir tamsayi giriniz");
        int sayi=scanner.nextInt();
        int flag=20;
        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){

                System.out.println("verilen sayi"+i+"'ye bolunuyor,sayi asal deyil");

                flag=10;

                break;}

            if (flag==20){

                System.out.println("sayi asal");}


        }

    }
}
