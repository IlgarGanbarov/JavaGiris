package day14_MetodOlusturma_Kullanma;

public class C02_MetodOiusturma {
    public static void main(String[] args) {

        //verilen iki sayidan buyuk olani yazdiran bir metod oludturun
        //eger sayilar esitse,"esit sayilarda buyuk olan yoktur"
              buyukolaniYazdir(7,8);//8
              buyukolaniYazdir(7,5);//7
              buyukolaniYazdir(5,5);//esit sayilardan buyuk olani yoktur

    }
    // metod clas icinde ama diger metodlarin disinda
    public static void buyukolaniYazdir(int sayi1,int sayi2){
        if (sayi1>sayi2){
            System.out.println("sayilardan buyuk olani:"+sayi1);
        } else if (sayi2>sayi1) {
            System.out.println("sayilardan buyuk olan:"+sayi2);

        }else {
            System.out.println("esit sayilardan buyuk yokdur");
        }

    }
}
