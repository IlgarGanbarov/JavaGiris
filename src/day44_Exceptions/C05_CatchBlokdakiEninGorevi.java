package day44_Exceptions;

public class C05_CatchBlokdakiEninGorevi {
    public static void main(String[] args) {

        int a=20;
        int b=0;
        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            //System.out.println("Bolecek sayi 0 olamaz");
           // System.out.println(e.getMessage());/// by zero
           // e.printStackTrace();
            //kod normal calisib bitdi ama butun hatayi ekrana yazdirdi
            //System.out.println(e.toString());
            //java.lang.ArithmeticException: / by zero
            System.out.println(e.getCause());

        }
    }
}
