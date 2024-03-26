package day06_ifelseStaeimant;

import java.util.Scanner;

public class C10_IfElseStatement {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char girilenkarakter=scan.nextLine().charAt(0);

        if (Character.isLowerCase(girilenkarakter)){
            System.out.println(Character.toUpperCase(girilenkarakter));}else {
            System.out.println(girilenkarakter);}




    }
}
