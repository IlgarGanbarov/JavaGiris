package day09_SwitchStatements;

public class C06_equals_iquelsignorkase {
    public static void main(String[] args) {

        String str1="java";
        String str2="Java";
        String  str3="JAVA";
        String str4="Java";
        String str5="JAVA ";
        //equals() Sting'lerin

        System.out.println(str1.equals(str2));//java>==>Java false
        System.out.println(str1.equals(str3));//java>==>Java false
        System.out.println(str1.equals(str4));//java>==>Java false
        System.out.println(str2.equals(str4));//java>==>Java True
        System.out.println(str1.equals(str5));//java>==>Java False
        System.out.println(str3.equals(str5));//java>==>Java false
        //eger buyuk kucuk harf onemsiz ise
        //amacimiz sadece metin olarak ayni olup olmadigina bakamak ise
        //equalsignorcase yaziyoruz
        System.out.println(str1.equalsIgnoreCase(str2));//java>==>Java true
        System.out.println(str1.equalsIgnoreCase(str3));//java>==>Java true
        System.out.println(str1.equalsIgnoreCase(str4));//java>==>Java true
        System.out.println(str2.equalsIgnoreCase(str4));//java>==>Java true
        System.out.println(str1.equalsIgnoreCase(str5));//java>==>Java false
        System.out.println(str3.equalsIgnoreCase(str5));//java>==>Java false













        // java'da metin ifadelerinin karsilastirilmasi icin== kulanilamaz
        // bunun yerine equals() ve ya equalsIgnorcase kulanilmalidir

        // cunki equals() sadece metne odaklanirken
        //== hem metne,hemde referansa odaklanir
        //== kulanildiginda ayni metinlerin bazilari true bazilari false verie
        String s1="java";
        String s2="java";
        String s3=new  String(  "java");
        String s4="ja+ja";
        String a="ja";
        String b="va";
        String s5=a+b;
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.equalsIgnoreCase(s4));
        System.out.println(s1.equalsIgnoreCase(s5));
        System.out.println(s1.equalsIgnoreCase("java"));
        System.out.println(s1.equalsIgnoreCase("==============="));
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s1==s5);
        System.out.println(s1=="java");



    }
}
