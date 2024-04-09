package day29_passByvalue;

public class C02_StatickOlmayanBlok {
    C02_StatickOlmayanBlok(){
        System.out.println("Constracktor calisdi");
    }
C02_StatickOlmayanBlok(int sayi){
    System.out.println("Parametreli constractor calisdi");
}
    public static void main(String[] args) {
        System.out.println("main method calisdi");
        C02_StatickOlmayanBlok obj1=new C02_StatickOlmayanBlok();
        System.out.println("Obje1 olusturuldu");
        C02_StatickOlmayanBlok obj20=new C02_StatickOlmayanBlok();
        System.out.println("Obj2 olusturuldu");


    }
    {
        System.out.println("Statick olmayan block calisdi");
    }

}

