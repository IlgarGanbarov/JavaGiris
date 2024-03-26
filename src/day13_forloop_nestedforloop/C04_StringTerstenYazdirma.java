package day13_forloop_nestedforloop;

import java.util.Scanner;

public class C04_StringTerstenYazdirma {
    public static void main(String[] args) {


        //Soru 9 (interview)- Kullanicidan bir String isteyin
        // ve String’i tersten yazdirin.

        Scanner scanner=new Scanner(System.in);

        System.out.println("lutfen bir metin giriniz..");

        String metin=scanner.nextLine();

        for (int i = metin.length()-1; i >0 ; i--) {

            System.out.print(metin.charAt(i));

        }


    }
}
