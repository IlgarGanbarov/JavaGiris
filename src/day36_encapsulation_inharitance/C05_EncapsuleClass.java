package day36_encapsulation_inharitance;

public class C05_EncapsuleClass {
    /*
    Satis elemanlari, satis tutarina atama yapa bilsin
    bu atanan satislar,otamatik olarak toplam satisa eklensin
    ama satis tutarina son atanan degeri,satis gorevlileri goremesin

    Toplam satis tutari olarak hesaplanan deger her kes terefinden gorule bilsin
    ama kimse toplam satis tutarina deger atayamasin
     */
   private int satiTutari;
   private int toplamsatisMiktari;
    /*
    Encapsulation bir mecburiyyet degil,bize
     yardimci olmak icin Java'nin hazirladigi bir yontemdir

     Eger bir class uyesi icin Read ve Write yetkilerini ayirmak isterseniz
     Encapsulation kullanabilirsiniz

     adindan da anlasilacagi gibi once bu yetkileri ariymak istediyimiz
     Variable'lara normal yollarla erisimi Engellemelisiniz
     */

    public int getToplamsatisMiktari() {
        return toplamsatisMiktari;
    }

    public void setSatiTutari(int satiTutari) {
        this.satiTutari = satiTutari;
        toplamsatisMiktari+=satiTutari;
    }
}
