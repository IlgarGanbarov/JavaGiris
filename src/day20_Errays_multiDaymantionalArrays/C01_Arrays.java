package day20_Errays_multiDaymantionalArrays;

public class C01_Arrays {
    public static void main(String[] args) {

        //verilen integer bir Array'de
        //verilen minimum ve max degerler dahil olarak
        //min ve max degerler arasindaki sayilari yazdiran bir metod olusturun

        int[]sayilar={23,45,12,78,54,1,98};
        aralikdakiSayilariYazdir(sayilar,10,40);
        aralikdakiSayilariYazdir(sayilar,15,66);
        aralikdakiSayilariYazdir(sayilar,100,500);
    }

    public static void aralikdakiSayilariYazdir(int[]arr,int minDeger,int maxDeger){

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]>=minDeger&&arr[i]<=maxDeger){
                System.out.println(arr[i]+" ");
            }

        }
    }
}
