package day17_scope;

import java.util.Stack;

public class C04_StaticVariablesInstansvariables {

   static String hastaneismi="Yildiz hastanesi";
   static String BashakimIsmi="Dr Emrah";
   static String HastaneIsmi="Cankaya";
   String PerIsmi;
   String PerAdresi;
   String PerTel;

    public static void main(String[] args) {
        C04_StaticVariablesInstansvariables pers1=new C04_StaticVariablesInstansvariables();
        System.out.println(pers1.PerAdresi);//null
        pers1.PerIsmi="Ulvi";
        pers1.PerAdresi="Cankaya";
        pers1.PerTel="555234565";


        C04_StaticVariablesInstansvariables pers2=new C04_StaticVariablesInstansvariables();
        System.out.println(pers2.PerIsmi);


    }
}
