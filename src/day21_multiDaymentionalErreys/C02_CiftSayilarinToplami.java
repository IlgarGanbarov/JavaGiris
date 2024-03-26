package day21_multiDaymentionalErreys;

public class C02_CiftSayilarinToplami {
    public static void main(String[] args) {
       // Soru 1- Verilen 2 katli bir array’de bulunan cift sayilari toplayip,
               // sonucu yazdiran bir method olusturun.
        int[][]arr={{3,6},{1,6,9},{8,0,2,1},{4}};
        ciftsayilaritoplama(arr);

    }
    public static void ciftsayilaritoplama(int[][]arr){

        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]%2==0){
                    toplam+=arr[i][j];
                }

            }
            System.out.println("Arraydaki cift sayilarin toplami"+toplam);

        }





    }
}
