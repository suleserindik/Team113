package day26_localTime_varags;

import java.util.Arrays;

public class C09_VarargsDikkatEdilecekler {
    public static void main(String[] args) {


        // verilen sayilardan ilki haric digerlerini toplasin
        // sonra toplam ile ilk sayiyi carpip yazdirsin

        topla(2,3,4,5,6,7);

        /*  Dikkat Edilecekler 2-

            son sayiyi ayirmak istersek
            Varargs eklenen tum parametreleri kendisi almak ister

            bundan oturu bir method'da parametre olarak
            varargs kullanilacaksa, EN SON parametre olarak kullanilmalidir

            Dikkat Edilecekeler 3-

            bir method'da parametre olarak iki varargs KULLANILAMAZ
            cunku son parametre olmalidir
            2 varargs olursa biri sonuncu olamayacagi icin CTE verir.


         */

    }
    /*
    public static void topla(int... a){

        System.out.println(Arrays.toString(a));

        int toplam =0;

        for (int each:a
        ) {
            toplam+=each;
        }
        System.out.println("Toplam : "+toplam);
    }
            Dikkat EEdilecekler 1-
        2 method icin her ne kadar parametre sayisi farkli olsada
        Varargs'in yapisindan dolayi int a, int...b ile int...b
        arasinda argument acisindan fark yoktur
        */
    public static void topla(int c, int... a){

        System.out.println(Arrays.toString(a));

        int toplam =0;

        for (int each:a
        ) {
            toplam+=each;
        }
        System.out.println("Istenen islem sonucu : "+toplam*c);
    }
}
