package day22_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ListRemoveMetodu {
    public static void main(String[] args) {

        List<String>harfler=new ArrayList<>(Arrays.asList("a","r","a","t","a","s"));
        //remove(istenenobje)
        System.out.println(harfler);
        harfler.remove("a");
        System.out.println(harfler);
        harfler.remove("x");
        //remove metodu calistiginda asil amaci olan silme islemini yapar
        //delil olarak da sildi ise true,bulmadi ise false yazdirir
        System.out.println(harfler.remove("s"));
        System.out.println(harfler);//rata
        System.out.println(harfler.remove("y"));

        System.out.println(harfler.remove("s"));//true
        /*
        eger remove(istenilen index)kullanilirsa
        indexi bulamama diyw bir ihtimal olamayacagindan
        rtue/false yerine bize sildigi elemani dondurur
         */
        System.out.println(harfler.remove(1));//a
        System.out.println(harfler);

        List<String>karakterler=new ArrayList<>(Arrays.asList("9","a","%","i","&"));
        /*
        karakterler listesinden,harfler listesinde olan tum harfleri siler
        karakterler listesi degildirse true,degismezse false yazdirir

         */
        System.out.println(karakterler.removeAll(harfler));//true
        System.out.println(karakterler);
        System.out.println(karakterler.removeAll(harfler));


        /*
        listemiz sayilardan olusuyorsa
        girilen sayinin index mi yoksa silinecek sayi mi oldugunu
        net olarak bilmek icin
        Java girilen sayiyi INDEX olarak KABUL edecegini belirtir
         */

        List<Integer>sayilar=new ArrayList<>(Arrays.asList(2,5,7,3,5,6));
        System.out.println(sayilar);
        System.out.println(sayilar.remove(2));//
        System.out.println(sayilar);
        /*
        EGER eleman olarak 6'yi silmek istersek
        ve index'ini bilmiyorsak
        once silinecek sayiyi non-pirimitiv
         */
        Integer silineceksayi=6;
        System.out.println(sayilar.remove(silineceksayi));
        System.out.println(sayilar);
    }
}
