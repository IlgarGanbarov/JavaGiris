package Day03_scanner_dataCasting;

public class C04_intileisleme {
    public static void main(String[] args) {

       int sayi1=24;
       int sayi2=8;
       int sayi3=10;

        System.out.println(sayi1/sayi2);
        System.out.println(sayi1/sayi3);
        // bolunen sayilarin 2'de int oldugundan Java sonucu da int verir

        double dbl=24;
        System.out.println(dbl/sayi2);
        System.out.println(dbl/sayi3);

        int a=27;
        int b=4;
        System.out.println(a/b);//27/4===>6,75

        double sonuc=a/b;
        System.out.println(sonuc);//6,0

        //sayilardan birini double'cast edelim

        sonuc=(double) a/b;
        System.out.println(sonuc);//6,75







        }









    }





