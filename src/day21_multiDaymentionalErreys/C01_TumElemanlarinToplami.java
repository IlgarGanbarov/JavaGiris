package day21_multiDaymentionalErreys;

public class C01_TumElemanlarinToplami {
    public static void main(String[] args) {

        //verilen 2 katli integer bir array'ki
        //tum sayilarin toplamini yazdirin bir metod olusturun

        int[][]arr={{3,6},{1,6,9},{8,0,2,1},{4}};
        ElemanlarinToplaminiyazdir(arr);
    }

    public static void ElemanlarinToplaminiyazdir(int[][]arr){
        /*
        eger hic bir sart olmaksizin
        2 katli array'deki tum elemanlara ulasmak isterseniz
        2 katli nested bir loop olusturmsliyiz
         */
        int toplam=0;

        for (int i = 0; i <arr.length ; i++) {//outor array'i kontrol eder

            for (int j = 0; j <arr[i].length ; j++) {

                toplam+=arr[i][j];

            }


        }
        System.out.println("Verilen Array'deki elementlerin toplami:"+toplam);
    }
}
