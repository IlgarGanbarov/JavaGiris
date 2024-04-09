package day29_passByvalue;

public class C05_PassBuyValue {
    public static void main(String[] args) {

        int sayi=20;
        System.out.println(method1(sayi));
        System.out.println(sayi);
    }
    public static int method1(int sayi){
        sayi=2*sayi;
        return sayi;
    }
}
