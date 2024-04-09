package day34_StringBuilder;

import java.util.Locale;

public class c03_StringBuilder_Digermetodlar {
    public static void main(String[] args) {
        // Bize StringBuilder dondurmeyen method'lar
        // StringBuilder'da kalici degisiklik yapmaz

        StringBuilder sb = new StringBuilder("Java Candir");

        System.out.println(sb.indexOf("a")); // 1

        System.out.println(sb); // Java Candir

        System.out.println(sb.substring(2, 4)); // va

        System.out.println(sb); // Java Candir

        System.out.println(sb.charAt(0)); // J

        System.out.println(sb); // Java Candir
        System.out.println(sb.toString().contains("Can"));//True
        System.out.println(sb.toString().startsWith("Java"));//True

        //sb=sb.toString().toUpperCase(Locale.ROOT)

        sb=new StringBuilder(sb.toString().toUpperCase());
        System.out.println(sb);

    }
}
