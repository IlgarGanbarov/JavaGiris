package day06_ifelseStaeimant;

import java.util.Scanner;

public class C04_IfStatements {
    public static void main(String[] args) {
      //Soru 3- Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        // 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen ucgenin kenar uzunluklarini yaziniz...");
        double kenar1=scanner.nextDouble();
        double kenar2=scanner.nextDouble();
        double kenar3=scanner.nextDouble();
        if (kenar1==kenar2&&kenar1==kenar3&&kenar1>0){
            System.out.println("eskenar ucgen");
        }





    }
}
