package day37_inheritence;

import day36_encapsulation_inharitance.C07_Araba;
import day36_encapsulation_inharitance.C08_Toyota;
import day36_encapsulation_inharitance.C09_Corolla;

import java.util.ArrayList;
import java.util.List;

public class C03_Parent extends C02_GParent{

    C03_Parent(){
        System.out.println("Parent parametresiz cons.");
    }

    C03_Parent(int b){
        System.out.println("Parent int parametreli cons.");
    }

    C03_Parent(String k){
        this(3);
        System.out.println("Parent String parametreli cons.");
    }

    C03_Parent(double c){
        super(7.2);
        c=7;
        System.out.println(c);
    }

    public static class C05_DataTypeKullanimi {

        public static void main(String[] args) {


            String str = "Java gun gectikce guzellesiyor";
            // Buradaki String
            // Java'nin olusturdugu bir class'dir
            // ayni zamanda str variable'inin data turudur

            C09_Corolla corolla = new C09_Corolla();
            // Buradaki C09_Corolla
            // hem bizim olusturdugumuz bir class'dir
            // hem de corolla objesinin data turudur

            // Non-primitive data turleri bir class'dan olusturulan objelerdir
            // ve olusturulduklari class'larda var olan ozellikleri (variable, method) tasirlar


            List<Integer> liste1 = new ArrayList<>();
            ArrayList<Integer> liste2 = new ArrayList<>();

            Integer sayi =10;

            // String s = (String) sayi; // String = Integer
            Object obj = sayi ; // Object = Integer

            String s= "Java";
            obj = s; // Object = String

            // Non-primitive data turlerinde aralarinda parent-child iliskisi olan class'larda
            // parent class'a child class atanabilir


            C09_Corolla corolla1 = new C09_Corolla();
            C08_Toyota corolla2 = new C09_Corolla();
            C07_Araba corolla3 = new C09_Corolla();

            // Bir objenin data turu olarak
            // kendi class'i ve/veya parent class(lar)i secilebilir
        }
    }
}
