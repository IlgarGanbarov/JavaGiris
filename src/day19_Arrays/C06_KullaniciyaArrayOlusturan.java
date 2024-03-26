package day19_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_KullaniciyaArrayOlusturan {
    public static void main(String[] args) {

       //Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip
        // array’i olusturan ve bize donduren bir method olusturun.
        System.out.println(Arrays.toString(arrayolustur()));


    }

    public static int[]arrayolustur(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen array'in kac elemanli olacagini giriniz..");
        int lenght=scanner.nextInt();


        int[]arr=new int[lenght];

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(i+".index'deki eleman icin bir deyer giriniz..");

            arr[i]=scanner.nextInt();

        }
        return arr;


    }
}
