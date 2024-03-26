package Day03_scanner_dataCasting;

public class C03_Casting {
    public static void main(String[] args) {

        boolean bl1=true;
        char chr1='$';
        byte byt1=23;
        int tamsayi=20;
        float flt1=45.2f;
        double dbl=44.1;
        String str="Java Candir";



     // bir data türündeki bir variable basga data türünden deyer atamaya denir

     int sayi=20;
     double dbl1=sayi;

        System.out.println(dbl1);

        //bazi data türlerine basga turden deyer atayamazsiniz

        //Kücük data türündeki deger,buyuk data türündeki verible atanirsa
        //Java bunu otamatik olarag yapar(Auto Widendig)


        dbl=byt1;
        dbl=tamsayi;
        dbl=flt1;
        flt1=byt1;//Auto Widendig
        flt1=tamsayi;

        tamsayi=byt1;
        tamsayi=(int)flt1;












    }
}
