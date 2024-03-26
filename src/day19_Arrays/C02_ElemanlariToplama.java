package day19_Arrays;

import java.util.Arrays;

public class C02_ElemanlariToplama {
    public static void main(String[] args) {

        int[] sayilar={3,4,5,6};
        elementToplamaYazdir(sayilar);
        //sayilar[4]=8;
        int[] yeniArr={3,4,5,6,8};
        sayilar=yeniArr;

        System.out.println("sayilar arayinin yeni hali:"+ Arrays.toString(sayilar));

        elementToplamaYazdir(sayilar);//26

        //verilen bir int array'daki tum elementleri toplayip yazdiran bir metod olusturun
    }

    public static void elementToplamaYazdir(int[]arr){

        int toplam=0;

        for (int i = 0; i <arr.length ; i++) {

            toplam+=arr[i];


        }
        System.out.println("Verilen array'daki elementlerin toplami"+toplam);


    }
}
