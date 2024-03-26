package day22_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_EnuzunKelime {
    public static void main(String[] args) {
        /*
        Verilen bir String liste'deki
        en uzun kelimeyi yazdirin
        en uzun kelimenin harf sayisina esit sayida harf iceren,harf sayisina esit
        birden fazla kelime varsa en sonuncuyu yazdirin
         */
        List<String>isimler=new ArrayList<>(Arrays.asList("Seher","Sumeyre","Meltem","Ramazan","Ilgar"));
        System.out.println(isimler);
        String Enuzunkelime=isimler.get(0);
        for (int i = 0; i <isimler.size() ; i++) {
            if (isimler.get(i).length()>=Enuzunkelime.length()){
                Enuzunkelime=isimler.get(i);


            }

        }
        System.out.println(Enuzunkelime);
    }
}
