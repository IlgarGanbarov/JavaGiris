package day27_constractorCall;

public class C01_ConstractorCall {

    C01_ConstractorCall(){
        //Const 2'yi cagiralim
        System.out.println("ali");
        //this("java");

    }
    void C01_ConstractorCall(){//Method1

    }
    C01_ConstractorCall(String str){//cons2


    }
    C01_ConstractorCall(int a){//cons3
        //C01_ConstractorCall("Java");//isim yaninda(): bu sytax method call icindir
        this();//bu constractor call'ir




    }
    int C01_ConstractorCall(double d){//Method2
        C01_ConstractorCall();

        return 0;
    }











    public static void main(String[] args) {












    }

}
