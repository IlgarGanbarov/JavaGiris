package day11_stringManupilation;

public class C06_ReplaceAll {
    public static void main(String[] args) {

        /*
        verilen stingdeki tum ozel karakterleri
        sayilari ve yanyana olan space'leri
        ornek input:J10a6%v*a C^7an@90dir
        output:Java candir
         */
        String input="J10a6%v*a   C^7an@90dir";
        /*
        birden fazla olan space'ri tek space'e indirelim
         */
        input=input.replaceAll( "\\s+","_");
        // tum sayilari yok edelim
        input=input.replaceAll("\\d","");
        //space'i koruma altina almak icin
        //space yerine hic kullanilmayan bir karakter atayalim
        input=input.replaceAll("\\s","5");
        //ozel karakterleri de yok edelim
        // degisimde space de gider
        input=input.replaceAll("\\W","");
        input=input.replaceAll("5", "");
        System.out.println("\"Java\"");
        System.out.println(input);





    }
}
