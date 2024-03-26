package day24_ArrayList_ForEachLoop;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Arraylist {
    public static void main(String[] args) {


        List<String>isimler=new ArrayList<>(Arrays.asList("seren","egbal","Ilgar","Joanna","Ali Cabbar"));

        int toplamkaraktersayisi=0;
        for (int i = 0; i <isimler.size() ; i++) {

            toplamkaraktersayisi+=isimler.get(i).length();

            
        }
        System.out.println("listede toplam"+toplamkaraktersayisi+"karakter");




    }
}
