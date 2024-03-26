package day19_Arrays;

public class C07_EnUzunVeEnKisaKelime {
    public static void main(String[] args) {

        //oru 6- Verilen String bir array’deki en uzun
        // ve en kisa kelimeleri yazdiran bir method olusturun.

        String[] isimler={"Meltem","Seren","Emrah","Ali","Ahmet","Semih"};
        enuzunEnkisakelimeleriyazdir(isimler);

    }
    public static void enuzunEnkisakelimeleriyazdir(String[]kelimeler){
        String enuzunkelime=kelimeler[0];//Meltem
        String enkisakelime=kelimeler[0];//Ali
        for (int i = 0; i < kelimeler.length; i++) {
            if (kelimeler[i].length()>enuzunkelime.length()){
                enuzunkelime=kelimeler[i];
            } else if (kelimeler[i].length()<enkisakelime.length()) {
                enkisakelime=kelimeler[i];

            }


        }
        System.out.println(" en uzun kelime " +enuzunkelime);
        System.out.println(" en kisa kelime " +enkisakelime);

    }


}
