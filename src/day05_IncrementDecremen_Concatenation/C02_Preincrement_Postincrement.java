package day05_IncrementDecremen_Concatenation;

public class C02_Preincrement_Postincrement {

    public static void main(String[] args) {

        //a'nin degerini 1 artirin ve yeni degerini olusturacaginiz b veraibla'na atayin

        int a = 20;

        int b = ++a; // once artiri sonra atama yapar

        /*a++;
        int b=a;

         */

        System.out.println("a : " + a + ", b :" + b); // a : 21, b :21

        // a'nin degerini b'ya atayin sonra a'nin degerini 1 artirin.

        a = 20;
        b = a++; // once atama yapar sonra artirir

        /*b=a;
        a++;

         */

        System.out.println("a : " + a + ", b :" + b); // a : 21, b :20

        // bu islemleri istesek tek satirda yapibiliriz

        // a'nin degerini yazdirin ve sonra a'yi 1 artirin

        a = 20;
        System.out.println("a : " + a + ", b :" + b); // a : 20, b :20
        a++;

        a = 20;
        System.out.println("a : " + a++); // a : 20

        System.out.println("Bir sonraki satirda a : " + a); // Bir sonraki satirda a : 21


        // a'nin degerini 1 azaltin ve sonra a'nin degerini yazdirin
        a = 20;

        System.out.println(--a); // // a: 19

        System.out.println("Bir sonraki satirda a : " + a); // Bir sonraki satirda a : 19

    }
}
