package day15_methodOverloading;

public class C02_MethodOverloading {
    public static void main(String[] args) {

        /*bir klasda overloading varsa
        omethod cagrildiginda java hangi metodun calisacagina
        asagidaki 3 adimla karar verir
        1-signature'i %100 ayni olan method varsa onu calistirir
        2- signature'i ayni olan method yoksa
        Java casting yapar kullanabileceyi method arar
         */
        toplama('a','b');//iki integerin toplami:195
        //toplama("ali",5);
        toplama(3.4f,6);
        toplama(2.3f,3.1f);


    }

    public static void toplama(int a,int b){//toplama double int

        System.out.println("iki integerin toplami:"+(a+b));}
    public static void toplama(int a,double b){//toplama double int

        System.out.println("integer ile double'in toplami:"+(a+b));}
    public static void toplama(double a,double b){//toplama //double double

        System.out.println("iki double'in toplami:"+(a+b));}
}
