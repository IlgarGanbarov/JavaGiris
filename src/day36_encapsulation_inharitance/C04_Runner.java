package day36_encapsulation_inharitance;

public class C04_Runner {
    public static void main(String[] args) {
        C03_depo obj=new C03_depo();

       // System.out.println(obj.intPrivate);
       // obj.intPrivate=20;

        obj.inDefault=40;
        System.out.println(obj.inDefault);

        obj.intProtected=23;
        System.out.println(obj.intProtected);
        System.out.println(obj.intPublic);
        obj.intProtected=12;
    }
}
