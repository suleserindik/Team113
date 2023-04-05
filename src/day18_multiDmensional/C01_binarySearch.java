package day18_multiDmensional;

import java.util.Arrays;

public class C01_binarySearch {
    public static void main(String[] args) {

        // verilen bir array'de istenen elemanin olup olmadigini bulur

        int[] arr={4,9,1,5,11,3,7,4,6};

        System.out.println(Arrays.binarySearch(arr, 5)); // -2
        System.out.println(Arrays.binarySearch(arr,11)); // 4
        System.out.println(Arrays.binarySearch(arr,1)); // -1
        System.out.println(Arrays.binarySearch(arr,7)); // -2

        // arrayde binarySearch metodunun duzgun calismasi icin sort() calistirilmalidir

        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr)); // [1, 3, 4, 4, 5, 6, 7, 9, 11]
        System.out.println(Arrays.binarySearch(arr, 5)); // 4
        System.out.println(Arrays.binarySearch(arr,11)); // 8
        System.out.println(Arrays.binarySearch(arr,1)); // 0
        System.out.println(Arrays.binarySearch(arr,7));// 6
        System.out.println(Arrays.binarySearch(arr,4)); // 2

        // binarySearch() aranan elementin indexini doner

        System.out.println(Arrays.binarySearch(arr,2)); //-2
        System.out.println(Arrays.binarySearch(arr,-3)); // -1
        System.out.println(Arrays.binarySearch(arr,8)); //-8
        System.out.println(Arrays.binarySearch(arr,10)); // -9
        System.out.println(Arrays.binarySearch(arr,13)); //-10
        System.out.println(Arrays.binarySearch(arr,20)); // -10

        // OLMAYAN BİR ELLEMNT ARATİLİRSA ONCE ARRAYDE OLSAYDİ NEREDE OLURDU BUNU BULUYORUZ
        // SONRA OLMASİ GEREKEN SİRANİN - İSARETLİ DEGERİNİ VERİYORUZ
        // BU MANTİKLA EN KUCUK ELEMENTTEN DAHA KUCUK BUTUN SAYİLAR İCİN -1
        // EN BUYUK ELEMENTTEN BUYUK OLAN BUTUN SAYİLAR İCİNDE -LENGTH-1 DEGERİ DONDURUR


    }
}
