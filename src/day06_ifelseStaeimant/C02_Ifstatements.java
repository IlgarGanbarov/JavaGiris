package day06_ifelseStaeimant;

public class C02_Ifstatements {
    public static void main(String[] args) {

        /*
        bagimsiz if cumleleri kodun geriye kalanindan bagimsizdir
        sarta odaklanir
        sart true ise if body'si calisir
        sart false ise if body'si calismaz
        bagimsi if cumleleri kodun geriye kalani ile ilgilenmedigi icin
        birden fazla bagimsiz if cumlesi oldugunda
        tumunun if bodisi calisabileceyi icin
        hic birinin if body'si  calismadigi da ola bilir


         */



        int a = 18;
        int b = 47;

        // Eger a b'den buyukse "a b'den buyuk" yazdirin

        if ( a > b ){
            System.out.println("a b'den buyuk");
        }


        // b cift ise , " bu sayilarin carpimi cift olur" yazdirin

        if ( b % 2 == 0  ){
            System.out.println("bu sayilarin carpimi cift olur");
        }

        // a 100'den buyukse "ilk sayi cok buyuk" yazdirin

        if ( a > 100 ){
            System.out.println("ilk sayi cok buyuk");}



    }

}
