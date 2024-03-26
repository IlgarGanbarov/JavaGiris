package day16_while;

public class C05_whilevsdowhile {
    public static void main(String[] args) {

        int sayi=20;

        do{
            System.out.println("While loop body'si calisti");
            sayi--;
        }while (sayi<10);

        // ilk deger kontrol edilmeden loop body'si bir kere calisir
        //Bu durumda ilk deger uygun olmasa bile
        //Loop body'si 1 kere calismis olur

        // atanan ilk deger icin while kontrolu false oldugundan
        // loop body'si hic calismadan biter

        //Do-While loopun +'si -'si de aynidir

    }

}
