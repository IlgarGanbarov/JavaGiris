package day34_StringBuilder;

public class C04_Karsilastirma {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Ulvi");
        StringBuilder sb2=new StringBuilder("Ulvi");
        String str="Ulvi";
        System.out.println(sb1==sb2);//false
       // System.out.println(str==sb2);//false

        //equals
        System.out.println(sb1.equals(sb2));// false
        System.out.println(str.equals(sb1));//false
        System.out.println(sb1.equals(sb1));//true
        StringBuilder sb3=sb1;
        System.out.println(sb1.equals(sb3));

        //compareTo() iki Sb'yi ilk index'en baslayarak harf harf karsilastirir
        //eger tum indexdeki karakterler ayni ise sonuc olarak 0 doner

        StringBuilder s1=new StringBuilder("Java");
        StringBuilder s2=new StringBuilder("Tava");
        StringBuilder s3=new StringBuilder("Javaa");
        StringBuilder s4=new StringBuilder("Java");
        StringBuilder s5=new StringBuilder("Jaka");

        System.out.println(s1.compareTo(s2));//-10 Java <==>Tava
        System.out.println(s1.compareTo(s3));//-1 Java<==> Javaa
        System.out.println(s1.compareTo(s4));//0
        System.out.println(s1.compareTo(s5));//11 Java<==> Jaka
    }
}
