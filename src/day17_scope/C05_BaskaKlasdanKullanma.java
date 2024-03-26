package day17_scope;

public class C05_BaskaKlasdanKullanma {
    public static void main(String[] args) {
        /*
        Metodlar ve Class level variablelar
        baska class'lardan da kullanilabilir

        Statik variable ve metodlara
        bska class`'dan ulasmak icin
        ClassIsmi.clasuyesiismi killanilir
        bu sekilde kullanima static yontem denir

        Instance variable'larin baska class'dan kullanmak icin
        instance variable'in oldugu bir obje olustirulmalidir
         */

        System.out.println(C04_StaticVariablesInstansvariables.BashakimIsmi);
        C04_StaticVariablesInstansvariables pers=new C04_StaticVariablesInstansvariables();
        System.out.println(pers.PerAdresi);
        System.out.println(pers.BashakimIsmi);


    }          // Static member 'bashekimIsmi' accessed via instance reference

              // static bir uyeye obje uzerinden ulasmak isterseniz
              // Java otomatik olarak getirmez ama yazarsaniz kabul eder
             // IntelliJ'de static bir uyeye, nicin static olmayan yontemle ulasiyorsun
            // diye o kodu sariya boyar
}
