package day13_forloop_nestedforloop;

import java.util.Scanner;

public class C03_ForloopNestedForloop {
    public static void main(String[] args) {

        //Soru 6- Kullanicidan 14’den kucuk bir sayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        // Konsolda faktoryel hesabinin yapilisini da yazdirin.
        // Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen 14'en kucuk pozitif bir tamsayi giriniz..");
        int sayi=scanner.nextInt();

        int faktoryel=1;
        System.out.print(sayi+"!=");

        for (int i = sayi; i >=1 ; i--) {

            faktoryel*=i;
            System.out.print(i+" * ");

        }
        System.out.print("= "+faktoryel);
    }
}
