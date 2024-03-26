package day13_forloop_nestedforloop;

import java.util.Scanner;

public class C05_StringiTerseCevirme {
    public static void main(String[] args) {


        //Soru 10 (interview)- Kullanicidan bir String isteyin
        // ve String’i tersine cevirip kaydedin.
        // Orn:metin:Java Candir tersmetin:ridnac avaj

        Scanner scanner=new Scanner(System.in);

        System.out.println("lutfen bir metin giriniz..");

        String metin=scanner.nextLine();
        String tersmetin="";

        for (int i = metin.length()-1; i >=0 ; i--) {

            tersmetin+=metin.charAt(i);

        }
        System.out.println(tersmetin);

        if (metin.equalsIgnoreCase(tersmetin)){
            System.out.println("girilen metin Palindrome");}
        else {metin.equalsIgnoreCase(tersmetin);
            System.out.println("kklnl");}
    }
}
