package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_PozitiftamBolenler {
    public static void main(String[] args) {


      //  Soru 6- Verilen pozitif bir tamsayiyi,
               // tam bolebilen tum pozitif tamsayilari
              // bir liste olarak bize donduren bir method olusturun.
              // Input: 20 return list {1,2,4,5,10,20}

        System.out.println(pozitifBolenlerlistesi(20));//[1, 2, 4, 5, 10, 20]

        System.out.println(pozitifBolenlerlistesi(240));
        //[1, 2, 3, 4, 5, 6, 8, 10, 12, 15, 16, 20, 24, 30, 40, 48, 60, 80, 120, 240]


    }
    public static List<Integer>pozitifBolenlerlistesi(int sayi){

        List<Integer>pozitifBolenlelistesi=new ArrayList<>();

        for (int i = 1; i <=sayi ; i++) {

            if (sayi%i==0){

                pozitifBolenlelistesi.add(i);
            }
            
        }




        return pozitifBolenlelistesi;



    }
}
