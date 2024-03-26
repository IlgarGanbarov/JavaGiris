package day15_methodOverloading;

public class C01_MethodOverloading {
    public static void main(String[] args) {

        String str="Java Candir";
        System.out.println(str.substring(5));//Candir
        System.out.println(str.substring(5,8));//Can



        //Bir klas'da ayni isimde birden fazla method olusturmasina
        //Method OVERLOADING DENIR

        toplama(3,4);
        toplama(3,6);
        toplama(4,4.5);
        toplama(5.6,4);


    }

    // Kural1: Bir clasin icinde herseyi ayni olan 2 method olusturmasiniz
    //parametre isimlerini,access modifier'i veya static durumunu deyistirmek yeterli olmaz

    //Kural2: Bir class icinde  ayniisimde birden fazla metod olusturmak icin(Overloading)
    //methodlarin SIGNATURE'lari data turleri farklimolmalidir


    public static void toplama(int a,int b){//toplama int int
        System.out.println("iki integerin toplami:"+(a+b));}
    protected  void toplama(int sayi1, int sayi2,int sayi3){
        System.out.println("Uc integerin toplami:"+(sayi1+sayi2+sayi3));

    }
    public static void toplama(double a,int b){//toplama double int
        System.out.println("iki inteferin toplami:"+(a+b));}
    public static void toplama(int a,double b){//toplama double int
        System.out.println("integer ile double'in toplami:"+(a+b));}
    public static void toplama(double a,double b){//toplama //double double
        System.out.println("iki double'in toplami:"+(a+b));}
}
