package day41_Absractclasses_Interfaces;

public class C06_ConcreteGrandChild extends C05_ConcreteChildClass{
    public void method3(){

        System.out.println("GC method3");
    }
    public int method6(){
        return 20;

    }

    public static void main(String[] args) {

        C06_ConcreteGrandChild gc1=new C06_ConcreteGrandChild();


        gc1.method1();//Parent method
        gc1.method2();//10
        gc1.method3();//gc method3
        System.out.println(gc1.method4(10));
        gc1.method5();// C method5
        System.out.println(gc1.method6());//20

        C04_AbsractParent gc2=new C06_ConcreteGrandChild();

        gc2.method1();//Parent method
        gc2.method2();//10
        gc2.method3();//gc method3
        System.out.println(gc2.method4(10));
        gc2.method5();// C method5
        System.out.println(gc2.method6());//20

        C05_ConcreteChildClass cc1=new C05_ConcreteChildClass();

        cc1.method1();//Parent method1
        cc1.method2();//10
        cc1.method3();//gp method3
        System.out.println(cc1.method4(10));//2
        cc1.method5();// C method5
        System.out.println(cc1.method6());//0


        C03_AbstractGrandParent cc2=new C05_ConcreteChildClass();

        cc2.method1();//Parent method
        cc2.method2();//10
        cc2.method3();//gp method3
        System.out.println(cc2.method4(10));//2
        //cc2.method5();// CTE C03'de yok
       // System.out.println(cc2.method6());//CTE C03'de yok



    }
}
