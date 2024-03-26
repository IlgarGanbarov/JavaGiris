package day16_while;

public class C01_Stringitersecevirme {

    public static void main(String[] args) {

        System.out.println(metnitersecevir("Ali topu tut"));

    }

    public  static String metnitersecevir(String metin){
        //Ali topu tut

        int index=metin.length()-1;

        String tersmetin="";

        while (index>=0){

            tersmetin+=metin.charAt(index);
            index--;
        }

        return tersmetin;

    }

}
