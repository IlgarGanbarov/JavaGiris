package Day02_vereiblescanner;

import java.util.Scanner;

public class C04_Scanner_IlkHarfYazdirma {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz...");
        //önce 2 yöntemle yapacagiz
        //1 önce ilk harfi alib sonra tüm metin
        String metin= scanner.nextLine();
        System.out.println(metin.toUpperCase().charAt(0));
        //kaydettigimiz metni büyük harfe
        System.out.println("lütfen bir metin daha giriniz");
        char ilkHarf=scanner.nextLine().toUpperCase().charAt(0);
        System.out.println("ikinci metin ilk harf");










    }






}
