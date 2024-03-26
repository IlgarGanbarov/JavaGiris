package day11_stringManupilation;

import java.util.Scanner;

public class C02_Soru {
    public static void main(String[] args) {
        //kullanicidan bir cumle ve aradigi metin parcasini isteyin
        //cumle ve metin durumuna gore,asagidaki durumlardan uygun olani yazdirin
        //1 aradiginiz metin cumlede yok
        //2 aradiginiz metin cumlede sadece bir kere kullanilmis
        //3 aradiginiz metin cumlede 1'den fazla kullanilmis

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir cümle giriniz..");
        String cumle=scanner.nextLine();//Java guzeldir
        System.out.println("lutfen aradiginiz metni giriniz..");
        String metin=scanner.nextLine();
        int ilkindex=cumle.indexOf(metin);
        int lastindex=cumle.lastIndexOf(metin);

        if (ilkindex==-1){ System.out.println("aradiginiz metin cumlede yok");}
        else if (ilkindex==lastindex) {
            System.out.println("aradiginiz metin cumlede sadece 1 kere kullanilmis");

        }else {
            System.out.println("aradiginiz metin cumlede 1'en fazla kullanilmis");}
        //java cok guzel
    }
}
