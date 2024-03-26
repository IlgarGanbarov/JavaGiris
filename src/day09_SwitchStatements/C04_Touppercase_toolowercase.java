package day09_SwitchStatements;

import java.util.Locale;

public class C04_Touppercase_toolowercase {
    public static void main(String[] args) {

        String str="Jva Candir";
        System.out.println(str.toUpperCase(Locale.ROOT));//Java candir
        System.out.println(str.toLowerCase());// java candir

        // Stringde variabl'a atama yapilmadikca
        //metodlarla yapilan degisiklikler kalici olmaz
        System.out.println(str);

        //eger metod ile yapilan degisikligin kalici olmasini isterseniz
        //variabla yeni halini atamalisiniz

        str=str.toUpperCase();
        System.out.println(str);//Java Candir

        // eger kucuk harfe ve ya kucuk harfe cevirirken
        //lokal bir alfabeye uygun olarak
        //cevirme yapmak iserseniz

        System.out.println(str.toLowerCase());
        System.out.println( str.toLowerCase(Locale.forLanguageTag("TR"))     );//java candir


    }
}
