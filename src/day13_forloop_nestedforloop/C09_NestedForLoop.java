package day13_forloop_nestedforloop;

import java.util.Scanner;

public class C09_NestedForLoop {
    public static void main(String[] args) {

        /*
        kullanicidan satir ve sutun sayisini alip
        asagidaki tabloyu olusturun

        * * * * * * * *
        * * * * * * * *
        * * * * * * * *
        * * * * * * * *

         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen satir sayisini giriniz");
        int satir=scanner.nextInt();

        Scanner scanner1=new Scanner(System.in);
        System.out.println("lutfen sutun sayisini giriniz");
        int sutun=scanner.nextInt();
        for (int i = 1; i >=satir ; i++) {
            for (int j = 1; j <=sutun; j++) {
                System.out.print("* ");
                System.out.println(" ");

            }


        }



    }
}
