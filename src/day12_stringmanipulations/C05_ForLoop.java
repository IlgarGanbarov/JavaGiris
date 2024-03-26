package day12_stringmanipulations;

public class C05_ForLoop {
    public static void main(String[] args) {
        /*
        iki basamakli pozitif tamsayilarin toplamini yazdirin
         */

        int toplam=0;
        for (int i = 10; i <100 ; i++) {
            toplam+=i;

        }
        System.out.println("iki basamakli sayilarin toplami:"+toplam);//4905

        /*
        10 ile 50 arasindaki 9 ile bolune bilen sayilari toplayin
        18,27,36,45
         */
        toplam=0;
        for (int i = 10; i <=50 ; i++) {

            if (i%9==0){toplam+=i;}

        }
        System.out.println("9 ile bolunebilen sayilarin toplami:"+toplam);

        /*
        iki basamakli pozitif ve negatif tum sayilarin toplamini yazdirin
         */
        toplam=0;
        for (int i = 99; i <100 ; i++) {//arada negatif ve positif sayilar var onlarin
            //Toplanmamasi lazim

            if (!(i>-10&&i<10)){toplam+=i;}

            System.out.println("iki basamakli tum sayilarin toplami"+toplam);

        }


    }
}
