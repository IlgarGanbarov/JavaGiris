package day19_Arrays;

public class C05_Elemanarama {
    public static void main(String[] args) {
        int[]arr={3,5,6,2,3,6,7,9,};

    }
    public static void elemanvarmi(int[]arr,int aranansayi){

        int bulunanadet=0;
        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]==aranansayi){
                bulunanadet++;
            }

        }
        if (bulunanadet==0){
            System.out.println("aranan eleman array'de yok");
        }else {
            System.out.println("aranan sayi arrayde var");
        }




    }
}
