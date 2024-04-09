package day33_Varargs_strungBuilder;

public class C02_Varargs {
    public static void main(String[] args) {
        method1("ilgar","Ulvi","Nuran");
        method1("a","b","c","d","e");



    }
    public static void method1(String s,String...t){
        System.out.println(s.length()+t.length);
    }
}
