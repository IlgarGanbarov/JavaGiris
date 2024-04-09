package day34_StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java");
        sb.insert(2,"t");//Jatva
        System.out.println(sb);
        String str="candir";
        sb.insert(3,str,0,4);
        System.out.println(sb);
        sb.delete(3,6);
        System.out.println(sb);
        sb.deleteCharAt(2);
        System.out.println(sb);
        System.out.println(sb.deleteCharAt(2));
        System.out.println(sb);

        sb.replace(2,4,"ka Candir");
        System.out.println(sb);
        System.out.println(sb.replace(2,3,"V"));
        System.out.println(sb.reverse());
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

    }
}
