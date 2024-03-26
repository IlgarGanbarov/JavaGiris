package day13_forloop_nestedforloop;

import java.util.Scanner;

public class C11_NestedForLoop {
    public static void main(String[] args) {

        /*
        kullanicidan satir sayisini alip
        asagidaki satir sayisini olusturun



         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen satir sayisini giriniz");
        int satir=scanner.nextInt();

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");

            }
            System.out.println("");

        }
    }
}
