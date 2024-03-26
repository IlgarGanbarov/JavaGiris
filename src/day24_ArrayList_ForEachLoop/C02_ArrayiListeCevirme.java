package day24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArrayiListeCevirme {
    public static void main(String[] args) {


        Integer[]sayilar={3,5,2,6,7,3,4,5};

        //bu array'i listeye cevirin
        //

        List<Integer>sayilist=new ArrayList<>();

        for (int i = 0; i <sayilar.length ; i++) {
            sayilist.add(sayilar[i]);

        }
        System.out.println(sayilist);
        sayilist.add(9);
        System.out.println(sayilist);
        /*
        var olan bir arrayi aslist kullanarak
        listeye cevire biliriz
        ancak bu cevirmek istediyimiz listede
        2 major yan etki olur
        Aslist ile olusturulan listeye
        array'da oldugu gibi ekleme ve silme yapamayiz
         */


        //2-ci yontem

        List<Integer>sayilist2= Arrays.asList(sayilar);
        System.out.println("Aslist ile donusturulen liste"+sayilist2);

       // sayilist2.add(9);
        //sayilist2.remove(0);

        sayilar[0]=23;
        sayilar[1]=15;
        System.out.println("Arraya yapilan atamadan sonra liste "+Arrays.toString(sayilar));
        System.out.println("Arraya yapilan atamadan sonra liste "+sayilist2);
    }
}
