package day10_stringmanupilations;

public class C04_startsWith_endsWith {
    public static void main(String[] args) {

        String str="Ali topu at,at Ali at";
        System.out.println(str.contains("Ali"));//true
        System.out.println(str.contains("top"));//true
        System.out.println(str.contains("at"));//true
        System.out.println(str.endsWith("Ali"));//false
        System.out.println(str.startsWith("Ali"));//true
        System.out.println(str.startsWith("Ali topu at"));//true
        System.out.println(str.startsWith("Ali "));//true
        System.out.println(str.endsWith("Ali topu at,at Ali at"));//true
        System.out.println(str.startsWith(""));//true
        //alimtopu at,atali at

        System.out.println(str.endsWith(""));//true

        System.out.println(str.startsWith("top"));//false


        System.out.println(str.startsWith("top",4));

        //4.index ve sonrasi "top" ile mi basliyor
        //"topu at,at Ali at"

    }
}
