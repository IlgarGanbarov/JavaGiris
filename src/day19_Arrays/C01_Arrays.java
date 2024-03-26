package day19_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        int[] arr=new int[4];//[0,0,0,0]

        // arrayin 2,index'deki elementi yazdirin
        System.out.println(arr[2]);
        //array'in index'ine deger olarak 5 atayin

        arr[1]=5;
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        // bir ereyde kac eleman oldugunu yazdirin

        System.out.println(arr.length);//4

        //arraye'deki tum elemanlari yanlarinda bir bosluk birakarak yazdirin

        for (int i = 0; i <arr.length ; i++) {

            System.out.print(arr[i]+" ");
            
        }
    }
}
