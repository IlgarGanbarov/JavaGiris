package day47_Maps;

import java.util.HashMap;
import java.util.Map;

public class C01_Maps {
    public static void main(String[] args) {


        //bir ogrenci map'i olusturmamiz isteniyor
        // map olusturmadan once neleri tutacagiz
        // once


        Map<Integer,String> ogrenciMap=new HashMap<>();

        //

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");


        System.out.println(ogrenciMap);


        //{101=Ali-Can-11-H-MF,
        // 102=Veli-Cem-10-K-TM,
        // 103=Ali-Cem-11-K-TM}

        System.out.println(ogrenciMap.size());//3


        //sadece key'leri yazdiralim
        System.out.println(ogrenciMap.keySet());//[101, 102, 103]

        //mapde 102 bir key varmi
        System.out.println(ogrenciMap.containsKey(102));//true

        System.out.println(ogrenciMap.containsKey(105));//false


        //101 numarali ogrencinin bilgileri

        System.out.println(ogrenciMap.get(101));//Ali-Can-11-H-MF
        System.out.println(ogrenciMap.get(106));//null

        System.out.println(ogrenciMap.values());//
        // [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM]

        System.out.println(ogrenciMap.values().size());//3

        System.out.println(ogrenciMap.containsValue("Ali"));//false
        //conteins value dedikde butun olarak value arar
        //value icindeki bilgileri tek-tek kontrol etmez
        System.out.println(ogrenciMap.containsValue("Ali-Can-11-H-MF"));//true


    }
}
