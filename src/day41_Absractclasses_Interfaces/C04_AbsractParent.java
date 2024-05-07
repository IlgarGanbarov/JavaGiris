package day41_Absractclasses_Interfaces;

public abstract class C04_AbsractParent extends C03_AbstractGrandParent {

    // bir class abstract yapildiginda
    // child class'lari bazi method'lari uyarlamaya
    // ZORUNLU KILMAK icin olusturulur


    // bir abstract class parenti olan abstract classlar'daki
    // abstract methodlari kendisine uyarlamak ZORUNDA DEGILDIR
    //isterse kendisine uyarlayabilir

    public void method1(){

    }
    public abstract void method5();
    public int method6(){
        return 0;

    }



}
