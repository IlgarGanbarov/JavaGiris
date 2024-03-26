package day06_ifelseStaeimant;

import java.util.Scanner;

public class C06_ifStatement {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");

        double girilennot=scanner.nextDouble();

        if (girilennot>=0&&girilennot<=100){
            System.out.println("gecerli not");}
        if (girilennot<=0||girilennot>=100){
            System.out.println("gecersiz not");}



    }
}
