package day20_Errays_multiDaymantionalArrays;

import java.util.Arrays;

public class C02_ArrayaelemanEkleme {
    public static void main(String[] args) {

        //verilen int bir Arraya istenen eleman ekleyip
        //array'in son donduren bir metod olusturun

        int[]sayilar={3,5,7};
        int ekleneceksayi=9;
        sayilar=arrayeElemanEkle(sayilar,9);
        System.out.println("sayilarin 9 eklenmis hali"+Arrays.toString(sayilar));

        //int[] yeniarray={3,5,7,9};
      //  sayilar=yeniarray;
        //System.out.println(Arrays.toString(sayilar));
    }
    public static int[]arrayeElemanEkle(int[]arr,int ekleneceksayi){

        //var olan bir arraya yeni eleman ekleyemeyiz
        //ama arraya toptan yeni bitr aray degeri atayabiliriz

        //once uzunlugu eski array'en 1 fazla olan bos bir array olusturalim

        int[]yeniarr=new int[arr.length+1];//[0,0,0,0]

        //eskierray'ki elemanlari ayni index'lerle yeni array'e atayalim
        for (int i = 0; i <arr.length ; i++) {

            yeniarr[i]=arr[i];
            //yeni arrayon son index'ine eklemek istenen sayini atayalaim

        }
        yeniarr[yeniarr.length-1]=ekleneceksayi;





        return yeniarr;
    }
}
