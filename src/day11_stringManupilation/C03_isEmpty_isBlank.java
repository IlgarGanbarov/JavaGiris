package day11_stringManupilation;

public class C03_isEmpty_isBlank {
    public static void main(String[] args) {
        String str="";
        System.out.println(str.length());//0

        System.out.println(str.isEmpty());//true

        String str2=" ";

        System.out.println(str2.length());//1

        System.out.println(str2.isEmpty());//false

        System.out.println(str2.isBlank());//true

        String str3="       ";

        System.out.println(str3.length());//8

        System.out.println(str3.isEmpty());//false length o mi kontrol eder,eger 0 ise true doner

        System.out.println(str3.isBlank());//true

        //length o olmasada sadece space'lerden olusuyorsa true doner

        System.out.println(str.isBlank());//true
    }
}
