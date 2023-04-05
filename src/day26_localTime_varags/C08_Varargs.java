package day26_localTime_varags;

import java.util.Arrays;

public class C08_Varargs {

    public static void main(String[] args) {

        topla(3,4);
        topla(3,4,5);
        topla(3,4,5,6);
        topla(1,2,3,4,5,6);
        topla(1,2,5,6,8,9,5); // [1, 2, 5, 6, 8, 9, 5]
    }
    public static void topla(int... a){

        System.out.println(Arrays.toString(a));

        int toplam =0;

        for (int each:a
             ) {
            toplam+=each;
        }
        System.out.println("Toplam : "+toplam);
    }
    /*
        Java'da bir method parametrelerine uygun argumente sahip
        method call oldugunda calisir

        Ornegin 2 int parametre varsa
        sadece 2 int argumet ile method call yapildiginda calisir

        Java ayni data turune sahip olmak sartıyla
        parametre sayisini esnek tutabilmek icin varargs olusturmustur

        varargs bir ARRAY'dir.

        dolayisiyla method'da array elementlerini
        istedigimiz isleme uygun olarak kullanabiliriz
     */
}
