package day22_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_TekrarsizhaleGetirme {


    public static void main(String[] args) {


       /*
        Soru 1- Verilen bir array’de tekrar eden elementler icin,

                mukerrer olanlari silip, tum elemanlardan
    sadece 1 tane yapip bize dondurecek bir method olusturun*/

        int[]arr={3,5,3,5,6,5,3,4,6,5,2,3,6,4,3,7};
        arr=uniqhalegetir(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[]uniqhalegetir(int[]arr) {

        List<Integer> uniqlist = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!uniqlist.contains(arr[i])) {
                uniqlist.add(arr[i]);

            }




            }
        int[] yeniarr = new int[uniqlist.size()];
        for (int i = 0; i < yeniarr.length; i++) {

            yeniarr[i] = uniqlist.get(i);

        }

            arr = yeniarr;
            return arr;


        }
    }
