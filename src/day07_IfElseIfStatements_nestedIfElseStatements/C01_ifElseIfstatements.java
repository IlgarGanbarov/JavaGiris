package day07_IfElseIfStatements_nestedIfElseStatements;

import java.util.Scanner;

public class C01_ifElseIfstatements {
    public static void main(String[] args) {


        //Soru 2- Kullanicinin kilo(kg) ve boyunu(cm)
        // isteyip vucut kitle endeksini hesaplayin (kilo*10000 /
        //(boy *boy)) vucut kitle endeksi 30’dan buyukse obez,
        //  25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse zayif yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen kilogram olarak kilonuzu giriniz..");
        double kilo=scanner.nextDouble();

        System.out.println("Lutfen sm olarak boyunuzu giriniz..");
        double boy=scanner.nextDouble();
        double vke=(kilo*10000/(boy*boy));

        if (vke>30){
            System.out.println("Obez");}else  if (vke>25){
            System.out.println("kilolusunuz");}else if (vke>20){
            System.out.println("kilonuz normal saglikli gorunuyorsunuz");}else {
            System.out.println("Zayifsiniz");}







    }
}
