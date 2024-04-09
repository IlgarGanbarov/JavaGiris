package day29_passByvalue;

public class c04_PassBayValue {
    public static void main(String[] args) {
        int sayi=30;
        method1(sayi);
        System.out.println("method calldan sonra main method'da sayi"+sayi);
    }
    public static void method1(int sayi){
        sayi=3*sayi;
        System.out.println("Method'da sayinin degeri"+sayi);
    }
}
