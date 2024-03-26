package day15_methodOverloading;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {

        //tekrar sayiyi olmayan islemleri
        //while loop ile yapmak daha avantajlidir

        //kullanicidan toplamak uzere tam sayilar isteyin
        //sayilarin toplami 500 veya fazla olursa
        //sayi istemeyi durdurup toplami yazdirin

        Scanner scanner=new Scanner(System.in);

        int syai=0;
        int toplam=0;
        while (toplam<500){
            System.out.println("Toplanmak uzere tam sayi giriniz..");
            syai=scanner.nextInt();
            toplam+=syai;


        }
        System.out.println("Girdiginiz sayilarin toplami:"+toplam);

    }
}
