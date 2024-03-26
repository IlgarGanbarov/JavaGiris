package day07_IfElseIfStatements_nestedIfElseStatements;

import java.util.Scanner;

public class C03_ifElseIfStatements {
    public static void main(String[] args) {

        //kullanicidan bir tam sayi isteyiniz
        //sayi 7ile bolunuyorsa 5`in kati
        // sayi 5 ile bolunuyorsa 5'in kati
        //her ikisine bolunuyoras "super sayi"
        //ikisinede bolunuyorsa "kotu sayi" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen pozitif bir sayi giriniz");
        int sayi=scan.nextInt();
         // bize verilen siralama farkli olsada
        //If,Else,If...cumlelerinin bir elek gibi calisir

        if (sayi%7==0){
            System.out.println("Super sayi");}else if (sayi%5==0){
            System.out.println("5'in kati");}else if (sayi%7==0&&sayi%5==0){
            System.out.println("7'nin kati");}else{
            System.out.println("kotu sayi");}




    }
}
