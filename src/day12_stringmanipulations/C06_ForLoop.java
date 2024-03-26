package day12_stringmanipulations;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {

        /*

        bir kronometre yapin
        kullanicidan aldiginiz pozitif sayidan
        1'e kadar tum sayilari yazdirin
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen pozitif bir tam sayi giriniz");
        int sayi=scanner.nextInt();
        for (int i = sayi; i >=1 ; i--) {
            System.out.print(i+" ");

        }

    }
}
