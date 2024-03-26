package day20_Errays_multiDaymantionalArrays;

import java.util.Arrays;

public class C05_Split {
    public static void main(String[] args) {

        String str="Ali topu at,at Ali at";
        System.out.println(Arrays.toString(str.split("at")));
        System.out.println(Arrays.toString(str.split("Ali")));

        //[Ali topu , , , Ali]
        //[,  topu at,at ,  at]

        // str'daki kelime sayisini yazdirin
        //" " ile split yapalim

        System.out.println(Arrays.toString(str.split(" ")));

        System.out.println("Kelime sayisi:"+str.split(" ").length);

        //str'i karakterlerine ayirin

        System.out.println(Arrays.toString(str.split("")));


    }
}
