package day14_MetodOlusturma_Kullanma;

public class C03_MethodOlusturma {
    public static void main(String[] args) {

        terstenyazdir("metod olusturma guzelmis");
        terstenyazdir("123454321");

    }
    public static void terstenyazdir(String metin){
        System.out.println("Tersten yazdir");
        System.out.print(" ");


        for (int i = metin.length()-1; i >=0 ; i--) {
            System.out.println(metin.charAt(i));

        }

    }
    //verilen meteodu terstden yazdiran bir metod olusturun
}
