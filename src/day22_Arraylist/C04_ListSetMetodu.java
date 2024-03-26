package day22_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ListSetMetodu {
    public static void main(String[] args) {

        List<Integer>sayilar=new ArrayList<>(Arrays.asList(3,4,7,1));
        System.out.println(sayilar);
        sayilar.add(2,9);

        //set()==> update byeni deger atamasi
        sayilar.set(2,5);
        System.out.println(sayilar);
    }
}
