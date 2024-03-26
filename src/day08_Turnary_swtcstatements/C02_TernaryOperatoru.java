package day08_Turnary_swtcstatements;

public class C02_TernaryOperatoru {
    public static void main(String[] args) {

        int sayi=23;
        if (sayi%2==0){
            System.out.println("sayi cift");}
        else {
            System.out.println("sayi tek");}
        //Ternary operatoru
        //if else

        System.out.println(sayi%2==0?"sayi cift":"sayi tek");
        if (sayi>0){
            System.out.println("pozitif");}
        else {
            System.out.println("pozitif deyildir");}
        System.out.println(sayi>0?"pozitif":"positv deyil");

        //sayi ondan buyukse sayinin deyerini 2 azaltin
        // sayi ondan buyuk deyilse sayinin degerini 5 artirin


        if (sayi>10){
            sayi-=2;}
        else {sayi+=5;}
        System.out.println("if ile sayinin yeni degeri:"+sayi);

        sayi=sayi>10? sayi-2:sayi+5;

        System.out.println("ternary ile sayinin yeni degeri:"+sayi);
        }





    }

