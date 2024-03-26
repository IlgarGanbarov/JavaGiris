package day13_forloop_nestedforloop;

import java.util.Scanner;

public class C03_FizzBuzz {
    public static void main(String[] args) {


        //Soru 8 (interview)- Kullanicidan pozitif bir sayi alin,
        // 1’den baslayarak tum tamsayilari yazdirin, sira
        // - 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        // - 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        // - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz yazdirin
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz..");

        int sayi=scanner.nextInt();
        for (int i = 1; i <= sayi; i++) {

            if (sayi%3==0&&sayi%5==0){

                System.out.println("fizzBuzz");}else if (sayi%3==0)
                System.out.print("fizbuzz");




        }
    }
}
