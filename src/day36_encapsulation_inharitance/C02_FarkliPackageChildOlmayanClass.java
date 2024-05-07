package day36_encapsulation_inharitance;

import day11_stringManupilation.C04_NullPointer;
import day14_MetodOlusturma_Kullanma.C04_Palindrome;
import day35_AccessModifire.C02_Depo;

public class C02_FarkliPackageChildOlmayanClass {
    public static void main(String[] args) {
        // static class uyelerini classIsmi.staticClassUyesiIsmi;

        //System.out.println(C02_Depo.privateStr);
        //System.out.println(C02_Depo.defaultStr);
        //System.out.println(C02_Depo.protectedStr);
        System.out.println(C02_Depo.publicStr);

        C02_Depo depo = new C02_Depo();
        // static olmayan class uyelerini objeIsmi.staticOlmayanClassUyesiIsmi;

        //System.out.println(depo.privateSayi);
        //System.out.println(depo.defaultSayi);
        //System.out.println(depo.protectedSayi);
        System.out.println(depo.publicSayi);

        System.out.println(C04_Palindrome.isPalindrome("Java Candir")); // false


    }
}
