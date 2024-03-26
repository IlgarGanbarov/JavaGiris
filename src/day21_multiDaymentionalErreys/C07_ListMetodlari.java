package day21_multiDaymentionalErreys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_ListMetodlari {
    public static void main(String[] args) {


        List<Integer>sayilar=new ArrayList<>();

        sayilar.add(10);
        sayilar.add(7);
        sayilar.add(9);
        List<Integer>list=new ArrayList<>(Arrays.asList(3,6,8,1,3,5,6));
        System.out.println(list);

        //listedeki elemen sayisini yazdirin

        System.out.println(list.size());
        //listede eleman olarak 7 varmi
        System.out.println(list.contains(7));
    }
}
