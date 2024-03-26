package day15_methodOverloading;

public class C03_WhileLoop {
    public static void main(String[] args) {

        //birden ona kadar olan sayilari aralarinda 1 bosluk birakarak yan yana yazdirin
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+" ");

        }
        System.out.println("");
        //ayni soruyu while loop yapin

        int sayi=1;
        while (sayi<=10){
            System.out.print(sayi+" ");
            sayi++;}
    }
}
