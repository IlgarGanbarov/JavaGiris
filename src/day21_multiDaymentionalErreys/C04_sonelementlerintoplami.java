package day21_multiDaymentionalErreys;

public class C04_sonelementlerintoplami {
    public static void main(String[] args) {

        int[][]arr={{3,6},{1,6,9},{8,0,2,1},{4}};
        sonelemanlarintoplami(arr);


    }
    public static void sonelemanlarintoplami(int[][]arr){
        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            toplam+=arr[i][arr[i].length-1];

        }
        System.out.println("Son elementlerin toplami:"+toplam);
    }
}
