package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_FibonnaciSerisi {
    public static void main(String[] args) {




        //Soru 4- Verilen pozitif bir n tamsayisini alarak,
        //      bize ilk n tane tane Fibonacci sayisini
        //      bir list olarak donduren bir method olusturun
        //      Fibonnaci Serisi:0 1 1 2 3 5 8 13 21 34 55 89 144 233

        System.out.println(fibonacciserisiolustur(-5));
        System.out.println(fibonacciserisiolustur(0));
        System.out.println(fibonacciserisiolustur(1));//[0]
        System.out.println(fibonacciserisiolustur(2));//[0,1]
        System.out.println(fibonacciserisiolustur(3));//[0,1,1]
        System.out.println(fibonacciserisiolustur(5));//[0,1,1,2,3]
    }


    public static List<Integer>fibonacciserisiolustur(int sayiadedi){

        List<Integer>fibonacciSerisi=new ArrayList<>();

        if (sayiadedi<=0){
            System.out.println("Sayi adade 0'dan buyuk olmalidir");


        } else if (sayiadedi==1) {
            fibonacciSerisi.add(0);
            
        } else if (sayiadedi==2) {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);


        }else {//ornegin 5 girilsin

            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
            for (int i =2 ; i <sayiadedi ; i++) {
                fibonacciSerisi.add(fibonacciSerisi.get(i-2)+fibonacciSerisi.get(i-1));
                
            }


        }


        return fibonacciSerisi;

    }
}
