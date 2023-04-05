package day05_IncrementDecremen_Concatenation;

public class C03_Concatenation {

    public static void main(String[] args) {

        // bir String baska bir String veya baska data turunden bir variable ile
        // + isareti ile birlestirilebilir

        String a= "Java";
        String b="guzeldir";

        System.out.println(a+b);   // javaguzeldir

        System.out.println(a +" "+b); //Java guzeldir

        int c=10;
        int d=20;
        System.out.println(a+c+d); // Java1020

        // eger String ile baska data turundeki bir deger toplanirsa Java sonucu String yapar.

        // peki Java30 yazmak stersek

        System.out.println(a+(c+d)); // Java30

        System.out.println(a+c*d); // Java200

        System.out.println(d+c+a); // 30Java


    }
}
