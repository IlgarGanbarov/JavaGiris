package day20_Errays_multiDaymantionalArrays;

import day19_Arrays.C05_Elemanarama;

import java.util.Arrays;

public class C04_BaynarySearch {
    public static void main(String[] args) {

        /*
        binarySearch()
        -arrayda olan elemanlarin sayyi
         */

        int[]arr={3,15,27,8,3,5,1};
        C05_Elemanarama.elemanvarmi(arr,3);
        C05_Elemanarama.elemanvarmi(arr,0);
        //javada bir arrayde aranan bir elemanin varligini sorgulamak icin

        System.out.println(Arrays.binarySearch(arr, 3));//0
        System.out.println(Arrays.binarySearch(arr, 1));//-1
        System.out.println(Arrays.binarySearch(arr, 8));//3
        System.out.println(Arrays.binarySearch(arr, 17));//-8
        System.out.println(Arrays.binarySearch(arr, 15));//-8

        //Baynary search () aranan elementin,arraydeki ilk kullanildigi index'i verir
        //ama binarysearch() sort edilmis arraylerde saglikli calisir
        //sort edilmmemis arraylarda sonuc ongorulemez

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        System.out.println(Arrays.binarySearch(arr, 3));//1
        System.out.println(Arrays.binarySearch(arr, 1));//0
        System.out.println(Arrays.binarySearch(arr, 8));//4
        System.out.println(Arrays.binarySearch(arr, 27));//6
        System.out.println(Arrays.binarySearch(arr, 15));//5

        System.out.println(Arrays.binarySearch(arr, -15));//-1
        System.out.println(Arrays.binarySearch(arr, 4));//-4
        System.out.println(Arrays.binarySearch(arr, 10));//-6
        System.out.println(Arrays.binarySearch(arr, 20));//-7
    }
}
