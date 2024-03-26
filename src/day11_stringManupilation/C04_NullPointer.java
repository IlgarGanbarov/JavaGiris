package day11_stringManupilation;

public class C04_NullPointer {
    public static void main(String[] args) {

        String str1;
       // System.out.println(str1);//variable str1 might not have bean initialized
        // main metod icinde olusturulan bir Stringe
        //deger atamadan kullanamazsiniz
        // sirf yazdira bilmek icin "" atasak
        String str2="";
        System.out.println(str2);//bos bir satir yazdirir
        //bu durumda yazdira biliriz ama
        //hiclik de olsa bu variabl'e bir deger atandigindan
        //java bu variable'i bos olarak kabul etmez


        //Java deyer atamadan da variable'lari kullanabilmek icin
        //Null pointer'i olusturmustur.
        //Null Pointer bir deger degil isaretcidir
        //str3 bir deyerinin olmadigini isaretler
        //ve str3'ü yazdirmak istedigimizde onun null olarak isaretlendigini yazdirir
        //yazdirmak disinda hic bir Stringi calistiramazsaniz
        String str3=null;
        System.out.println(str3);//null
        String str4="Java";
        System.out.println(str3+str4);//nullJava
       //System.out.println(str3.length());//NullPointerException
       // System.out.println(str3.isEmpty());//NullPointerException
        str3="Seren";
        System.out.println(str3);
        System.out.println(str3.length());
        System.out.println(str3.isEmpty());
    }
}
