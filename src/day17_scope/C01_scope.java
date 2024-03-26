package day17_scope;

public class C01_scope {
    int a=20;
    static  String b;

    public static void main(String[] args) {

        int sayi=10;
        System.out.println(sayi);
        /*
        Scope:
        variable ve method'larin nerelerde kullanabilicegine

         */





    }

    public static void method1(){
       // System.out.println(sayi);
        String str="java super";
        System.out.println(b);
        for (int i= 0;  i<10; i++) {
            int c=20;
            System.out.println(i);

        }

    }
    public void method2(){
        System.out.println(a);
        System.out.println(b);


    }


}

