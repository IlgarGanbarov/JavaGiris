package day11_stringManupilation;

public class C01_LastIndex {
    public static void main(String[] args) {
        String str="java cok zevkli";
        System.out.println(str.length());//15
        System.out.println(str.charAt(str.length()-1));//1
        // str'da z harfi kullanilmismi?
        System.out.println(str.contains("z"));//true

        //str'da ilk k'nin indexini yazdirin

        System.out.println(str.indexOf('k'));//7

        //str'da cok kelimesinin indexini yazdirin
        System.out.println(str.indexOf("cok"));//5

        //str'da k'in son kullaniminin indexini yazdirin
        System.out.println(str.lastIndexOf("k"));//sondan baslayarak aramaya baslar//12

        //str'in son kullanimindan bir önceki kullaniminin indexini yazdirin

        System.out.println(str.lastIndexOf("k,",12-1));
        // metin'de kullanilan son "cok" kelimesinin index'ni yazdirin

        System.out.println(str.lastIndexOf("cok"));

        //metin'de kullanilan ilk x harfinin indexini yazdirin
        System.out.println(str.indexOf('x'));//olmadigi icin -1

        //str'da kullanilan son w harfinin indexini yazdirin
        System.out.println(str.indexOf("w"));

    }
}
