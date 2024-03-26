package day09_SwitchStatements;

public class C07_substring {
    public static void main(String[] args) {


        String str="Java guzeldir";//va guzeldir
        System.out.println(str.substring(2));
        System.out.println(str.substring(0));//java guzeldir
        System.out.println(str.substring(str.length()-1));//r
        System.out.println(str.length());//13,son index 12
        System.out.println(str.substring(13));//bos satir
        //System.out.println(str.substring(str.length()+1));
        //length()-1 son index'ki harfi verir
        //length
       // System.out.println(str.substring(-3));
        //son 3 harfi yazdirin
        System.out.println(str.substring(str.length()-3));
    }
}
