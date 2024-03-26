package day11_stringManupilation;

import java.util.Scanner;

public class C05_Replace {
    public static void main(String[] args) {

       String str="Java candir";
        System.out.println(str.replace('a','A'));
        System.out.println(str.replace("candir","güzeldir"));
        System.out.println(str.replace("a",  ""));
        System.out.println(str.replace('b',  'B'));
        System.out.println(str.replace("can",  "Han"));

        //sadece ilk a'yi A yapin
        System.out.println(str.replaceFirst("a", "A"));

        //Kullanicidan bir metin isteyin
        //ve metinde kecen ilk space'i * yapin
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz..");
        String cumle=scanner.nextLine();
        System.out.println(cumle.replaceFirst("\\s","*"));

        //Kullanicidan bir metin isteyin
        //ve metinde varas ilk rakam'i * yapin
        String cumle1=scanner.nextLine();
        System.out.println(cumle1.replaceFirst("\\d","*"));
    }
}
