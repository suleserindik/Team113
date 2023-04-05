package day19_arrayLists;

import day17_arrays.C06_ArrayeElemanEkleme;
import day17_arrays.C07_ArrayElemanEklemeMethodu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArrayList {
    public static void main(String[] args) {

        // ArrayList uzunlugu esnek bir Listedir
        // Array altyapisini kullanir ancak ekleme ve silme gibi islemlerde daha avantajlidir
        // ArrayListin tek dezavantaji var o da elementleri tek tek eklememiz gerekir

        int[] arr={3,4};
        arr= C07_ArrayElemanEklemeMethodu.arrayeElementEkle(arr,15); // [3, 4, 15]

        System.out.println(Arrays.toString(arr));

        List<String> harfler = new ArrayList<>(); // bos bir list olustururuz

        System.out.println(harfler); // []

        harfler.add("s");
        harfler.add("l");
        harfler.add("a");

        System.out.println(harfler); // [s, l, a]






    }
}
