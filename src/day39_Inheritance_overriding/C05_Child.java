package day39_Inheritance_overriding;

public class C05_Child extends C04_Parent {
    public void method1(){

    }
    public void method2(int sayi){
        //parendeki method2 ile signature'i ayni olmadigindan
        //overriding olmaz
    }

    @Override
    public int method3() {
        return 6;


    }
    public String method4(){
        // signature=method ismi+ parametrelerin data turu

        //access modifier metod signature'ine dahil degildir

        return "Java";
    }

    private void method5(){

    }
    public static void method6(){

    }
    public void method79(){

    }

    @Override
    public int method8() {
        return 6;
    }
    public String method9(){
        return "Java";

    }
    public void method10(){
        super.method10();

    }



}
