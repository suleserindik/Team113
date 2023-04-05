package day28_accsesModifier_encapsulation;

public class C01 {

    String str; // class level'deki her class uyesinin access modifier'i olur
                // eger access modifier gorunmuyorsa Java o class uyesini default access modifier olarak isaretler
    static String s;
    public int sayi;
    public static int a;
    public int d;
    private int b;
    public static  int c=10;


    public static void main(String[] args) {

        int sayi=0;
        // public int sayi2=20;
        // static String b;
        // bir method icerisinde public, protected, private gibi access modifier'lear
        // veya static keyWord kullanilamaz

        // System.out.println(b); static'den dolayi ulasamayiz
        System.out.println(c);

        // str="Java"; static
        s="hava";
        // d=20; static degil

    }

    void method1(){
        System.out.println(b);
        System.out.println(c);
        str="Java";
        s="hava";


    }

    static void method2(){

        // System.out.println(b); static degil
        System.out.println(c);

    }
    public void method3(){

    }


}
