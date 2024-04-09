package day29_passByvalue;

public class C01_StaticBlocks {

    //STatic bloklar tum method'lardan ve kod bloklarindan once calisir
    //(main methoddan bile once calisir)
    //class calismaya baslamadan yapilmasi gereken her hansi bir islem varsa
    //staic bloklar kullanilabilir
    //eger 1'en fazla static blok varsa
    //kendi iclerinde usteki block daha once calisir
    C01_StaticBlocks(){
        System.out.println("Constactor calisti");


    }

    public static void main(String[] args) {
        System.out.println("main method calisti");
        C01_StaticBlocks obj=new C01_StaticBlocks();
    }
    public static void method1(){
        System.out.println("method calisti");
    }
    static {
        System.out.println("static block calisti");
    }
    static {
        System.out.println("statick blok2 calisti");
    }
}
