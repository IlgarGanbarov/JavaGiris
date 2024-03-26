package day18_arays;

import java.util.Arrays;

public class C01_arays {
    public static void main(String[] args) {

        //Bir aray iki shekilde olusturula bilir
        //1- deklarasyon ve icindeki tum elementler yazilabilir

        String[] isimler={"Mahmut","Hasan","ilgar","Sumeyra"};
        String harfler[]={"a","l","d"};

        //2- deklarasyon ve array'n elemani sayisi yazilip array olusturulabilir

        int[]sayilar=new int[3];//[0,0,0]

        //Isimler array'en "hasani yazdir

        System.out.println(isimler[1]);//Hasan

        //harflar arraynin birinci indeksindeki harfi yazdir

        System.out.println(harfler[1]);//l

        //harfler arraynin indeksindeki elemeni i yapin
        harfler[2]="i";
        //harfler arrayine 4-cu eleman olarak Q'Yu atayin

        //harfler[4]="Q";//ArrayIndexOutOfBoundsException

        //icinde 5,8,1 sayilarinin oldugu bir arrey olusturun

        int[]sayilar2={5,8,1};
        int[]sayilar3=new int[3];//[0,0,0]
        sayilar3[0]=5;
        sayilar3[1]=8;
        sayilar3[2]=1;
        System.out.println(sayilar3);//[I@6acbcfc0 sayilar 3 errayinin referansi
        System.out.println(Arrays.toString(sayilar3));
        System.out.println(Arrays.toString(harfler));
        harfler[2]="o";
        System.out.println(Arrays.toString(harfler));

    }
}
