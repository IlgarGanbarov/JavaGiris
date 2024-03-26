package day19_Arrays;

import java.util.Arrays;

public class C03_tumelementleriArtirma {
    public static void main(String[] args) {


        //Soru 1- Verilen bir int array’in tum elemanlarini
        // 2 artirip bize donduren bir method olusturun.
        // Eski array’i yeni haliyle kaydedin.

        int[]arr={4,7,2};

        arr=elemmalariArtir(arr,2);

        //System.out.println("arrayin son hali:"+ Arrays.toString(arr));
        //gorevde yazdirma yok,biz kodumuz dogru calisiyormu diye
        //kontrol ettik
    }
    public static int[]elemmalariArtir(int[]arr,int artismiktari){
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=arr[i]+artismiktari;


        }
        return arr;
    }
}
