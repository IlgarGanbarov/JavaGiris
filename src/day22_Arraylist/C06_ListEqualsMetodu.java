package day22_Arraylist;

import java.util.*;

public class C06_ListEqualsMetodu {
    public static void main(String[] args) {

        List<Integer>sayilar1=new ArrayList<>(Arrays.asList(2,6,9));
        List<Integer>sayilar2=new ArrayList<>(Arrays.asList(6,9,2));

        System.out.println(sayilar1.equals(sayilar2));//false
        Collections.sort(sayilar1);//[2,6,9]
        Collections.sort(sayilar2);
        System.out.println(sayilar1.equals(sayilar2));//true
    }
}
