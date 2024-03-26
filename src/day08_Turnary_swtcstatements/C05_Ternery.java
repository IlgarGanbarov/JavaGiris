package day08_Turnary_swtcstatements;

import java.util.Scanner;

public class C05_Ternery {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen notunuzu girin");
        double not=scanner.nextDouble();
        System.out.println(  not>50?"sinifi gectin":"malasef kaldin");



    }
}
