package day07_IfElseIfStatements_nestedIfElseStatements;

import java.util.Scanner;

public class C06_Indirim {
    public static void main(String[] args) {

      //Soru 3- Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, az alirsa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, az alirsa %10 indirim yapin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen aldiginiz urun adadini giriniz");
        int urunadaedi=scan.nextInt();
        System.out.println("Aldiginiz urunun indirimsiz fiyatini giriniz");
        double indirimsizfiyat=scan.nextDouble();
        double toplamfiyat=urunadaedi*indirimsizfiyat;
        System.out.println("Musteri kartiniz varmi?E:Evet,H:Hayir");
        char kartvarmi=scan.next().toUpperCase().charAt(0);

        if (kartvarmi=='E'&& urunadaedi>10){
            System.out.println("%20 indirimi toplam fiyat:"+toplamfiyat*80/100);}else if (kartvarmi=='E'
        &&urunadaedi<=10){
            System.out.println("%15 indirimlitoplamfiyat:"+toplamfiyat*85/100);}else if
        (kartvarmi=='H'&&urunadaedi>10){
            System.out.println("%15 indirimlifiyat:"+toplamfiyat*85/100);}















    }
}
