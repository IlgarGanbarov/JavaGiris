package day08_Turnary_swtcstatements;

public class C04_NestedTernary {
    public static void main(String[] args) {

        /*
        verilen sayi icin asgidaki 3durumdan
        uygun olani yazdirin
        sayi pozitif
        sayi negatif
        0 positiv ve ya negatif deyildir

         */
        int sayi=10;

        if (sayi>10) {
            System.out.println("sayi positif");
        }else if (sayi<0) {
            System.out.println("sayi negatif");
        }else {
            System.out.println("0 positiv ve ya negatif deyildir");}
            System.out.println(sayi>0?"sayi pozitif":"sayi 0 ve ya negatif olabilir");
            System.out.println(sayi>0?"sayi positif":sayi==0? "sayi 0 ve ya negatif deyildir":"sayi negatif");







    }
}
