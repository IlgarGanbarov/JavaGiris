package day09_SwitchStatements;

public class C09_substring {
    public static void main(String[] args) {
        String str="Java Guzeldir";
        System.out.println(str.substring(5,8));
        /*
        sadece bu metod icin degil,javanin genelinde
        baslangic index'leri inclusive(dahil)
        bitis indexleri exclusive/haric)'dir
         5.index dahil basla, 8.index haric olarak aradaki karakterler
         5.indexden basla(8-5)adet karakter yaz//guz

         */
        // basdan baslayip,sondan 4-cu karakter haric yazdirin

        System.out.println(str.substring(0,str.length()-4));
        //bitis indexi baslangic index'en kucuk olursa
       // System.out.println(str.substring(6,4));//StringIndexOutOfBoundsException
        //baslangic ve bitis indexi ayni olursa
        System.out.println(str.substring(5,5));//hiclik
        System.out.println(str.substring(0, 1));//J intelejy'i sari yapip Replace`str.substring(0,1)
        System.out.println(str.substring(3,4));//a

        //aralarindaki fark charAt() bize char dondurduyunden,
        //sonrasinda String
        str.substring(3,4).toUpperCase();


    }
}
