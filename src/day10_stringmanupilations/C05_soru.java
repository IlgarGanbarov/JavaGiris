package day10_stringmanupilations;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class C05_soru {
    public static void main(String[] args) {

       /* SORU : kullanicidan bir mail alin
        - mail @ icermiyorsa "gecersiz mail"
         - mail @gmail.com icermiyorsa, "mail gmail olmali"
        - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"
        yazdirin.

        */
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen mailinizi giriniz..");
        String mail=scanner.nextLine();
        //bagimsiz if else kullanirsak tum hatalari yazdirir
        //if-else kullanirsak ilk hatayi yazdirir,kalan calismaz

        // gorevde net olarak tercih belirtilmediginden
        //biz if-else tercih ediyoruz
        if (!mail.contains("@")){
            System.out.println("gecersiz mail");}
        else if (!mail.contains("@gmail.com")){
            System.out.println("mail gmail olmali");}
        else if (!mail.endsWith("gmail.com")){
            System.out.println("mailde yazim hatasi var");}

    }
}
