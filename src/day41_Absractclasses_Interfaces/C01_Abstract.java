package day41_Absractclasses_Interfaces;

public abstract class C01_Abstract {
    // bu class'i car uretmek isteyen tum markalarin,
    // kendilerine uyarlamasi gereken method'lari belirlemek icin olusturduk

    // motoru mecbur yapalim
    public abstract void motor();
    //Abstract methods cannot have a body


    // sunroof istege bagli
    public void sunroof(){
        // child class'lari kendisine uyarlama konusunda
        // serbest birakmak istedigimiz method'lari
        // concrete (abstract olmayan) method olarak olustururuz
    }


    // yakit zorunlu olmali
    public abstract void yakit();
    // abstract method'lar concrete method'lar gibi
    // bir islem yapmak uzere DEGIL
    // child class'lari UYARLAMAYA MECBUR etmek icin kullanilir
    // standartlarda olan yazilar gibidir,
    // ornegin yakit method'u "Bir aracin car olabilmesi icin yakit method'u olmasi zorunludur"
    // anlamina gelir


    // geri gorus kamerasi zorunlu degil
    public void geriGoruskamerasi(){
        System.out.println("arabalar isterse sunroof kullana bilir");

    }

    // sanziman duz vites, otomatik vites zorunlu
    public abstract void sanzuman();






}
