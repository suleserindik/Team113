package day27_stringBuilder;

public class C03_equals_compare {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str ="Java";

        //System.out.println(sb1==str);
        // java da farkli data turune sahip non-primitive objeler == ile karsilastirilamaz

        System.out.println(sb1==sb2); // false
        System.out.println(sb1==sb1); // true


        System.out.println(sb1.equals(sb2)); // false
        /* StringBuilder'da icerik ayni olsa bile equals methodu false doner
            Cunku StringBuilder classında equals methodu yoktur
            equals method'unu parent class'i olan Object Class'indan kullanir
            bundan dolayi iceriklere bakmadan false verir.
         */

        System.out.println(sb1.equals(str)); // false
        System.out.println(sb1.equals(sb1)); // true

        // iki StringBuilder'in iceriklerinin ayni oldugunu kontrol etmek icin
        // compareTo () kullanilir

        System.out.println(sb1.compareTo(sb2)); // 0
       // System.out.println(sb1.compareTo(str)); CTE

        StringBuilder sb3 = new StringBuilder("Hava");
        StringBuilder sb4 = new StringBuilder("Tava");

        System.out.println(sb1.compareTo(sb3)); // 2
        System.out.println(sb1.compareTo(sb4)); // -10
        System.out.println(sb3.compareTo(sb4));// -12


        /*
            CompateTo() method'u karsilastirilan StringBuilder'lar ayni etne sahipse 0 doner
            degilse, bastan itibaren kontrole baslar
            farkli olan ilk harfin karsilastirilan kelimedeki ayni indexteki harften
            kac harf ilerde oldugunu dondurur
         */




    }
}
