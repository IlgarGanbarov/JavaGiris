package day45_Iterator_listiterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterator {

    /*
    listiterator ile ilgili dikkat edilecekler

    1- lit her lit.next gordugunde literatoru bir saga goturur
    islem hatasi yapmamak icin while loop icerisinde
    sadece bir kez lit.next() kullanilmalidir

    2- literator biz soylemedikce hareket etmez
     */

    public static void main(String[] args) {


        List<Integer> liste=new ArrayList<>(Arrays.asList(4,7,9,2,5));


        System.out.println(liste);//[4, 7, 9, 2, 5]

        //index kullanmadan listedeki cift sayilari 2,
        //tek sayilari 1 artir

        ListIterator<Integer> lit=liste.listIterator();

        while (lit.hasNext()){

            Integer sayi=lit.next();
            if (sayi%2==0){
                lit.set(sayi+2);
            }else {
                lit.set(sayi+1);
            }

        }
        System.out.println(liste);//[6, 8, 10, 4, 6]

        //listenin yeni halinde elementleri sondan basa yazdirin
        //bu satir itibari ile lit en sonda

        //bu gorev icin lit dogru yerde

        while (lit.hasPrevious()){
            System.out.print(lit.previous()+ " ");
        }
        System.out.println("\n"+liste);//[6, 8, 10, 4, 6]

        //listeyi sondan basa bir daha yazdir

        while (lit.hasNext()){
            lit.next();
        }


        while (lit.hasPrevious()){
            System.out.print(lit.previous()+ " ");


        }
    }
}
