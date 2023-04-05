package day02_dataTurleri_Scanner;

public class C02_DataTurleri {

    public static void main(String[] args) {

        char ilkHarf= '8';  // Tek tirnak icinde tek karakter (harf, sayi, ozel karakter...)

        byte ogrYasi1=15;  // en dogru kullanim bu olur, hafiza kullanimini optimize etmek icin bu terelidir
        short ogrYasi2=16;
        int ogrYasi3=14;
        long ogrYasi4=15;

        double sayi1=3.124718692354584;
        System.out.println(sayi1); // 3.124718692354584

        // Double virgulden sonra 16 hane yazdirir, ama cok kucuk sayilara idigi icin
        // ondalikli kismin sonunnda hatalar olabilir
        // 15 / 3 = 4.9999999999999999   5.0  5.00000000000000001

        float sayi2 = 45.5433636381983771003719379F;
        // float sayi tanimlandiginda double'dan farkli oldugunu belirtmek icin
        // sonuna f veya F yazmak zorundayiz
        System.out.println(sayi2); // 45.543365


        // biz dersler boyunca hafiza onemli olmadigi icin
        // tam sayilar icin int, ondalikli sayilar icin double kullaniriz






        }


    }

