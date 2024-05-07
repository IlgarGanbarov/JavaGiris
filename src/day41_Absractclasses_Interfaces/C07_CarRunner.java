package day41_Absractclasses_Interfaces;

public class C07_CarRunner {
    public static void main(String[] args) {


       /*
        C01_Abstract car1=new C01_Abstract();



        car1.geriGoruskamerasi();

        car1.motor();
        car1.sanzuman();
        */

        C01_Abstract car1=new C02_JavaCar();

        car1.motor();
        car1.sanzuman();

    }
}
