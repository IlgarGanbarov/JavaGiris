package day44_Exceptions;

public class C06_baziexeptionturleri {
    public static void main(String[] args) {

        String str=null;//str'a deyer atanmamis null olarak isaretlenmistir

        System.out.println(str);//null

       // System.out.println(str.length());//NullPointerException

       // System.out.println(str.substring(1));//NullPointerException

        //System.out.println(str.startsWith("n"));//NullPointerException


        String sayiStr="23#";
       // int sayi=Integer.parseInt(sayiStr)*2;//NumberFormatException
        //System.out.println(sayi);//46

        String a="Java";
       // Integer b=a;//Required type:Integer Provided String
        Object obj=a;
        Integer b=(Integer) obj;
        System.out.println(b);//ClassCastException
    }
}
