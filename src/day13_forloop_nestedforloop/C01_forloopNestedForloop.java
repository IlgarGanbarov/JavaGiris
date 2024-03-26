package day13_forloop_nestedforloop;

import java.util.Scanner;

public class C01_forloopNestedForloop {
    public static void main(String[] args) {
        
        //Soru 5- Kullanicidan 14’den kucuk bir sayi alip,
        // bu sayinin faktoryel degerini hesaplayin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen 14'en kucuk pozitif bir tamsayi giriniz..");
        int sayi=scanner.nextInt();
        int faktoryel=1;


        for (int i = sayi; i >=1 ; i--) {
            faktoryel*=i;
            
        }
        System.out.println(faktoryel);
    }
}
