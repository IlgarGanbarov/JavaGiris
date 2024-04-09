package day34_StringBuilder;

public class C01_StringBuilder {
    public static void main(String[] args) {


        StringBuilder sb1=new StringBuilder();
        System.out.println(sb1.length());//0
        System.out.println(sb1.capacity());//16

        StringBuilder sb2=new StringBuilder("Deneme");
        System.out.println(sb2.length());//6
        System.out.println(sb2.capacity());//16+6==>22

        StringBuilder sb3=new StringBuilder(7);//7 karakter ala bilen
        System.out.println(sb3.length());//0
        System.out.println(sb3.capacity());//7

        //java non pirimitiv data turleri icin baslangicda
        // data turune ve data turunun kapasitesine uygun bir alan ayirir
        //eger variablin ntutdugu bilgi deyisirse
        //Java'da hafizada tuttugu alani degistirir

        sb3.append("Java");
        System.out.println(sb3);
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());

        sb3.append("Candir");
        System.out.println(sb3);
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());

        sb3.append(false);
        sb3.append(44);

        System.out.println(sb3);
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());

        sb3.trimToSize();
        //kapasiteyi length'e indirger
        System.out.println(sb3);
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());

        //String buildir String kimi metin ifadeler barindirir
        //dolayisi ile metodlar da benzerdir ama
        //ismi ayni olan her metod ayni sekilde calismaya bilir

        String str="Malatya";

        sb3.append(str,4,6);
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());

    }
}
