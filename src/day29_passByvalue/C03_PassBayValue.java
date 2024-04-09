package day29_passByvalue;

public class C03_PassBayValue {

    static int sayi=50;
    public static void main(String[] args) {
        int sayi=10;
        sayi=30;

    }
    public static void method1(){
        int sayi=40;
        System.out.println(sayi);//40
    }
    public static void method2(int s){
        System.out.println(sayi);//50

    }
}
