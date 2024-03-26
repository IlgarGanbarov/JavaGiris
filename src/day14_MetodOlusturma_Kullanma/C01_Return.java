package day14_MetodOlusturma_Kullanma;

public class C01_Return {
    public static void main(String[] args) {

        /*

        her metod bir is yapmak ucun olusturulur
        Biz metodlarin yapziklari islem sonucunda
        bize ne dönrürdüklerine bakariz

        Metodlarin islem sonucu,verilen parametrelere göre degisdigi icin
        return kelimesi
         */
        String str="Java kolaydir";
        System.out.println( str.substring(3));//a kolaydir
        System.out.println(str.indexOf("a"));//1
        System.out.println(str.indexOf("x"));//-1
        System.out.println(str.contains("Java"));//true
        System.out.println(str.substring(7));

        //substring metodu bize String donduruyor
        // 28.satirdaki kod calisir ve bize "laydir" return eder
        //ancak donen "laydiri" biz hic bir islem yapmadigimiz icin gormeyiz
        //biz sonuc return eden bir metod kullandigimizda
        //sonucu kullanmak icin 2 alternatifimiz var
        //1- direk yazdirip konsolda sonucu gorebiliriz

        System.out.println(str.substring(7));

        // gorevde yazdirmamiz istenmiyorsa
        //ileride kullanilmak uzere bir variabla kaydederiz

        String strinIlkyarisi=str.substring(0,str.length()/2);
        System.out.println(strinIlkyarisi);//Java k
        System.out.println(str.substring(6));

    }

}
