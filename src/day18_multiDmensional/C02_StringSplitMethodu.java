package day18_multiDmensional;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class C02_StringSplitMethodu {
    public static void main(String[] args) {
        // bir stringi istedigimiz parcalara ayirmak icin kullanilir

        String str="Java candir can, bundan suphesi olan var mi?";

        // str kac kelimedir?

        String[] kelimeler= str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); // [Java, candir, can]

        System.out.println("kelime sayisi : "+kelimeler.length); // kelime sayisi : 3



        // en uzun kelime kac harflidir?
        int enUzunKelimeLength= kelimeler[0].length();

        for (int i = 0; i < kelimeler.length ; i++) {

            if(kelimeler[i].length()>enUzunKelimeLength){
                enUzunKelimeLength=kelimeler[i].length();
            }

        }

        System.out.println("en uzun kelimenin karakter sayisi : "+enUzunKelimeLength); // 6

        // bir stringi karakterlerine ayirmak istersek

        String[] karakterler=str.split("");
        System.out.println(Arrays.toString(karakterler));

        System.out.println("cumledeki karakter sayisi : "+karakterler.length); // 44
    }
}
