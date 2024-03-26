package day22_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_IndexOf_LastIndexof {
    public static void main(String[] args) {
        List<String>harfler=new ArrayList<>(Arrays.asList("a","d","a","y","a","d","m"));
        System.out.println(harfler);

        /*
        eleman<==> index
        eger index verip,o index'ki elemani gormek istersek

         */
        System.out.println(harfler.get(2));
        /*
        eger harfi verip indexi istersek
         */
        System.out.println(harfler.indexOf("a"));//0

        System.out.println(harfler.lastIndexOf("a"));//4

        System.out.println(harfler.indexOf("y"));//3

        System.out.println(harfler.lastIndexOf("y"));//3

        System.out.println(harfler.lastIndexOf("k"));//-1
    }
}
