package day12_stringmanipulations;

public class C01_StringsayiTüoplama {
    public static class C01_SayiToplama {
        public static void main(String[] args) {


            //Soru 2 : Kullanicinin belirli bir formatta verdigi
             //         String fiyatlari toplayip yazdirin.
              //    input1 : "15.30 €" , input2 : "11.40 €"
              //    output : 26.70 €
            String fiyatstr1="15,30€";
            String fiyatstr2="11.45€";
            System.out.println(fiyatstr2+fiyatstr2);
            fiyatstr1=fiyatstr1.replaceAll("\\D","");
            fiyatstr2=fiyatstr2.replaceAll("\\D","");
            System.out.println(fiyatstr1+fiyatstr2);
            System.out.println("Verilen fiyatlarin toplami:"+
                    Double.parseDouble(fiyatstr1)+Double.parseDouble(fiyatstr2)/100+"€");
        }
    }
}
