package day46_Collections;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class C06_ArraydakiTekraredenElementleriSilme {
    public static void main(String[] args) {

        int[]arr={3,6,5,1,2,5,7,9,3,4,5,2,3,6};


        Set<Integer> benzersizsayilar=new TreeSet<>();
        for (int eacsayi:arr){
            benzersizsayilar.add(eacsayi);

        }
        System.out.println("Benzersizsayilar seti:"+benzersizsayilar);
        System.out.println("arr:"+ Arrays.toString(arr));

        arr=new int[benzersizsayilar.size()];

        int index=0;
        for (int eachsayi:benzersizsayilar){
            arr[index]=eachsayi;
            index++;
        }
        System.out.println("arr'in son hali:"+Arrays.toString(arr));


    }
}
