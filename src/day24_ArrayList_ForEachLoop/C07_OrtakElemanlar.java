package day24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C07_OrtakElemanlar {
    public static void main(String[] args) {


        //
       // Soru 5- Verilen iki array’in elementlerini karsilastirip,
//          ikisinde ortak olan elementleri
        //ayri bir liste olarak veren bir program yazin.

        int[] array1 = {3,6,8,1,0,3,8,1,1};
        int[] array2 = {3,6,7,5,6,5,6,5,1};

        List<Integer>OrtakElemanlarListesi=new ArrayList<>();
        for(int each1 : array1){

            for(int each2 : array2){

                if (each1 == each2 && !OrtakElemanlarListesi.contains(each1)){
                    OrtakElemanlarListesi.add(each1);
                }

            }

        }

        System.out.println("ortak elemanlar listesi : " + OrtakElemanlarListesi);


    }
}
