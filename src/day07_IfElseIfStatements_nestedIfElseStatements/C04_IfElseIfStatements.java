package day07_IfElseIfStatements_nestedIfElseStatements;

import java.util.Scanner;

public class C04_IfElseIfStatements {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan mesafeyi kilometre olarak alin
        // ve cevirmek istedigi birimi sorun,
        // istedigi birim metre veya santimetre ise cevirip yazdirin,
        // yoksa “istediginiz birim sisteme kayitli degil” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen mesafeyi kilometre olarak yazin");
        double mesafe=scan.nextDouble();
        System.out.println("Mesafeyi cevirmek istediyiniz birimi giriniz");

        String cevrelecekbirim=scan.nextLine();

        if (cevrelecekbirim.equalsIgnoreCase(    "metre")){
            System.out.println("Girilen mesafe metre olarak:"+mesafe*1000+"Metredir");}
           else if (cevrelecekbirim.equalsIgnoreCase( "Santimetre"))
        {
            System.out.println("Girilen mesafe santiumetre olarak:"+mesafe*1000000+"Santimetredir");}else {
            System.out.println("istediginiz birim sisteme kayitli degildir");}






    }
}
