package day24_ArrayList_ForEachLoop;

import java.util.Scanner;

public class C06_ForEachLoop {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz..");
        String cumle=scanner.nextLine();

        String harf="";

        while (harf.length()!=1){
            System.out.println("Lutfen bir harf giriniz");
            harf=scanner.nextLine();
        }

        String[] harfarrayi=cumle.split("");

        int sayac=0;
        for (String eachHarf:harfarrayi){
            if (eachHarf.equalsIgnoreCase(harf)){
                sayac++;
            }
        }

    }
}
