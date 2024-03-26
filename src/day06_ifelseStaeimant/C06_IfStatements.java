package day06_ifelseStaeimant;

import java.util.Scanner;

public class C06_IfStatements {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz..");
        char harf=scanner.nextLine().charAt(0);
        if (harf>='a'&&harf<='z'){
            System.out.println("kucuk");}
        if (harf<='A'&&harf>='Z'){
            System.out.println("Buyuk");}




    }
}
