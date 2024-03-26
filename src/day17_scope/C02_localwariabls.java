package day17_scope;

public class C02_localwariabls {

    /*

    1-Local variable'lar bir kod blogunun icinde olusturulur
    ve scope icerisinde olusturulan kod blogudur
    baska bir yerde kullanilamaz
    2-Locale variable'ler deger atamadan deklare edile bilir
    ama deger atamadan kullanilamaz
    3- locale variable'lar static olarag tanimlanamaz
    4-Her ne kada bir metodun icinde olsalar da
    Loopl'in da kendi scope'u vardir
    bir loop'un icinde olusturulan variable,loop'un disinda kullanilamaz

    Loop'un oldugu metod'dan önce olusturulan variableer
    loop icerisinde kullanilabilir
     */
    public static void main(String[] args) {

        int sayi;
       String s;

       /*

        // int c = 2 * sayi; // Variable 'sayi' might not have been initialized
        // System.out.println(s); // Variable 's' might not have been initialized

        // static int d = 20; // Modifier 'static' not allowed here
        */



       sayi=10;
        for (int i = 0; i <sayi ; i++) {
            System.out.println(sayi);
            sayi--;

        }


    }
}
