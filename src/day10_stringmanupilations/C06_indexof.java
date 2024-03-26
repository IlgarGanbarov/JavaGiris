package day10_stringmanupilations;

import java.util.Scanner;

public class C06_indexof {
    public static void main(String[] args) {

       String str="Ali topu at,at Ali at";
        System.out.println(str.indexOf("t"));//4
        System.out.println(str.indexOf('t'));//4
        System.out.println(str.indexOf("Ali"));//0
        System.out.println(str.indexOf("pu at"));//6
        System.out.println(str.indexOf(' '));
        System.out.println(str.indexOf("t",7));
        // 7. index ve sonrasindaki ilk t'nin index'ni verir
        // "u at,at Ali at"
        //kullanicidan bir metin isteyin
        //girilen metindeki 2.anin index'ni yazdirin
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bir metin giriniz");
        String metin =scanner.nextLine();

        //java ile ders su gibi akiyor

        int ilkindex=metin.indexOf("a");
        System.out.println(metin.indexOf(   "a",ilkindex+1));



        //indexof parametre olarak hem string hem de char kabul eder
    }
}
