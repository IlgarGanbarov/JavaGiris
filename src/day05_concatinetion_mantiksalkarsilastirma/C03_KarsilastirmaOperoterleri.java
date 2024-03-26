package day05_concatinetion_mantiksalkarsilastirma;

public class C03_KarsilastirmaOperoterleri {
    public static void main(String[] args) {
        int a=5;
        System.out.println( 2*a+4==14);
        System.out.println(a+4==2*a-1);

        int b=3;
        System.out.println(b=3*a-7);
        System.out.println("b:"+b);
        System.out.println(b==2*a+8);

        System.out.println(a+3!=2*b-1);
        System.out.println(2*a!=b+2);
        System.out.println(2*a<b-3);
        System.out.println( !(a+7>b+8));

        System.out.println(!true);
        System.out.println(!(5<8));
        System.out.println(8>=8);
        System.out.println(10<=8);
        int c=15;
        System.out.println(15>=a++);
        System.out.println(c);
        



    }
}
