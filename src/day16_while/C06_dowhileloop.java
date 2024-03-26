package day16_while;

import java.util.Scanner;

public class C06_dowhileloop {
    public static void main(String[] args) {

       //Soru 1- Kullanicidan baslangic ve bitis harflerini alip,
        // o harfleri ve aralarindaki harfleri yazdirin.
        //kullanici harf disinda ozel karakter
        //ve ya bir metin girerse uyari verip yeniden harf girmesini isteyin
        //kullanici harf girinceye kadar tekrar isteyin


        Scanner scanner=new Scanner(System.in);
        String baslangicstr;
        char baslangic='a';
        do {
            System.out.println("lutfen baslangic harfini giriniz");
            baslangicstr=scanner.nextLine();
            if (baslangicstr.length()==1){
                baslangic=baslangicstr.charAt(0);

            }else {
                System.out.println("Sadece bir 1 harf girmelisiniz");
                baslangic=baslangicstr.charAt(0);
            }

        }while (baslangicstr.length()!=1);

        System.out.println("lutfen baslangic harfini giriniz");

        char bitisc=scanner.next().charAt(0);

        System.out.println("lutfen bitis harfini giriniz..");

        char bitis=scanner.next().charAt(0);
        do{
            System.out.print(baslangic+" ");
            baslangic++;
        }while (baslangic<=bitis);


    }
}
