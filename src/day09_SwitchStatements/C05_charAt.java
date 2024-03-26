package day09_SwitchStatements;

import java.util.Locale;

public class C05_charAt {
    public static void main(String[] args) {

        String str="Java Candir can.";
        System.out.println(str.charAt(0));//J

        //metindeki ikinci harfi buyuk harf olarak yazdirin

        System.out.println(str.toUpperCase(Locale.ROOT).charAt(1));//A

        // sonuncu harfi yazdirin
        //bu yazi dinamik bir kod degildir
        //str deyisede
        System.out.println(str.charAt(10));//r

        // sondan 3-cu harfi yazdirin
        System.out.println(str.charAt(8));//d

        // bir stringdeki karakter sayisina
        //o stringin Length'i denir
        //length 1-en baslar indeks 0-dan
        //str icin konusursak lenght====>11, son karakterin indexi==>10(lenght-1)

        // dinamik kod
        //kulanicidan alinan input'a bagli olmaksizin
        //her zaman kendini dinamik olarak duzenleyip
        //istenen sonucu vere bilen koddur

        System.out.println(str.charAt(str.length()-3));
        System.out.println("length:"+str.length());

        //System.out.println(str.charAt(16));

        //Java Compile Time'da(kodu calistirmadan once)
        //kulanilan variable'larrini goremez
        //sadece data turlerini gorur

        //data turleri acisindan kod'da bir sorun varsa
        //compile time'de bunu farkeder ve altini cizer
        //compile time  Error (CTE) diyoruz
        //ama degeri goremediyi icin
        //yalnis degerlerin sebep olacagi hatalari
        //compile time'da farkedemez
        //deger hatalarini kodlari calistirmaya basladiktan sonra fark eder
        //bu tur hatalara calismaya basladikdan sonra farkedildigi icin
        //run time error (RTE)denir
    }
}
