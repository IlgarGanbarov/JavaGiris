package day10_stringmanupilations;

public class c02_contains {
    public static void main(String[] args) {


        String str="Ali topu at,at ali at";

        System.out.println (str.contains("Ali"));//true
        System.out.println(str.contains("at"));//true
        System.out.println(str.contains("Ali"));//false
        System.out.println(str.contains("topu Ali"));//false
        System.out.println(str.contains("topu at"));//true
        System.out.println(str.contains("u a"));//true
        // aciklamada buyuk kucuk harf onemsiz olarak
        //phone grciyor mu

    }
}
