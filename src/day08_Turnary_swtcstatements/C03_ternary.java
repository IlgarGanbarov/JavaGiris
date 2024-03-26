package day08_Turnary_swtcstatements;

public class C03_ternary {
    public static void main(String[] args) {

        //Ternarydae iki olasilik olur
        //eger bu iki olasilikdan  birine atama yapmamiz
        //

        int sayi=20;
        //verilen sayi 10 dan buyukse degerini 3 azaltin

        if (sayi>10){
            sayi-=3;
        }else {
            System.out.println("bu sayi cok kucuk");}
        System.out.println("If-Else'den sonra sayi:"+sayi);
        System.out.println(sayi>10? sayi=sayi-3:"sayi cok kucuk");

        System.out.println("ternary'dan sonra sayi:"+sayi);




    }
}
