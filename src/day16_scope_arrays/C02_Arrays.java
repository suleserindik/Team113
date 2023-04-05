package day16_scope_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String[] isimler = {"Nurefsan", "Berke", "Mustaf"};
        int[] sayilar ={3, 3, 4, 4, 5, 6, 7, 8, 8};
        char karakterler[]={'e','f','i'};

        // Array non-primitive data turulerindendir.
        // Eger arry'i liste seklinde olusturmayip
        // new keyword kullaniyorsak uzunlugunu yazmak ZORUNDAYIZ

        String[] arr=new String[5];

        // Bir array tanımlanan uzunluktan daha fazla veya az eleman alamaz

        // bir arrayi yazdirmak istersek
        // Arrayler direkt yazdirilamaz
        System.out.println(isimler); //[Ljava.lang.String;@48140564

        System.out.println(Arrays.toString(isimler)); // [Nurefsan, Berke, Mustaf]
        System.out.println(Arrays.toString(sayilar)); // [3, 3, 4, 4, 5, 6, 7, 8, 8]

        System.out.println(Arrays.toString(arr)); // [null, null, null, null, null]

        int[] a=new int[7];
        System.out.println(Arrays.toString(a)); // [0, 0, 0, 0, 0, 0, 0]

        // array'deki elemetlere nasıl ulasiriz ? index ile

        a[0] =4; // [4, 0, 0, 0, 0, 0, 0]
        a[3]=7; // [4, 0, 0, 7, 0, 0, 0]
        // a[7]=8; // ArrayIndexOutOfBoundsException
        System.out.println(Arrays.toString(a));

        // sayilar array'inin 4.indexteki elemeti yazdirin

        System.out.println(sayilar[4]); // 5

       // isimler array'inin birinci indexdeki ismi yazdir

        System.out.println(isimler[1]); // Berke

    }
}
