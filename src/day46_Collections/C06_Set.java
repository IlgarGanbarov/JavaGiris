package day46_Collections;

import java.util.Set;
import java.util.TreeSet;

public class C06_Set {
    public static void main(String[] args) {

        Set<String> harfler=new TreeSet<>();
        harfler.add("a");
        harfler.add("b");
        harfler.add("a");
        harfler.add("a");
        System.out.println(harfler);//[a, b]

        Set<String> isimler=new TreeSet<>();

        isimler.add("Bugra");
        isimler.add("Ilgar");
        isimler.add("Seren");
        System.out.println(isimler);//[Bugra, Ilgar, Seren]

        System.out.println(isimler.size());

        int toplamharfsayi=0;
        for (String eachIsim:isimler){
            toplamharfsayi+=eachIsim.length();
        }
        System.out.println("Setteki toplam karakter sayisi:"+toplamharfsayi);


        /*
        set index desteklemedigi icin elemanlar uzerinde deyisiklik yapmak zor olur
         */

        Set<String> yeniset=new TreeSet<>();

        for (String eachisim:isimler){
            yeniset.add(eachisim.toUpperCase());
            isimler.remove(eachisim);


        }
        System.out.println("isimler"+isimler);
        System.out.println("Yeniset:"+yeniset);
        isimler=yeniset;
        System.out.println("Isimler setinin yeni hali:"+isimler);




    }
}
