package day33_Varargs_strungBuilder;

public class C03_StringBuilder {
    public static void main(String[] args) {
        String str="String guzeldir";
        String s=new String("String nonPirimitivdir");

        StringBuilder sb1=new StringBuilder();
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());//16

        StringBuilder sb2=new StringBuilder("Deneme");
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        StringBuilder sb3=new StringBuilder(7);
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());
    }
}
