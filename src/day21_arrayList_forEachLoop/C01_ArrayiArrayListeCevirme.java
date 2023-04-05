package day21_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayiArrayListeCevirme {
    public static void main(String[] args) {

        Integer[] arr ={3,4,5,6,7,8,9,1,3,4,5,6,7,8};

        // arr array'ini elementlerini iceren bir array list olusturun

        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);
        }
        System.out.println("sayilar listesi : "+sayilar);

        /*  java'da bir arrayi array liste cevirmek icin kullanilan aslist() methoduda vardir
            ancak kullanimi tavsiye edilmez
            cunku iki tane buyuk dezavantaji vardir

            1- asList kullanilarak array'den liste cevrilen listelerde
                ekleme/silme gibi uzunlugu degistiren method'lar kullanilamaz

            2- arka planda array ve arrayden donusturdugumuz list beraber hareket eder
               birinde yaptıgımız updateler otekine de islenir

        */

        List<Integer> arraydenList=new ArrayList<>();

        System.out.println("arrayden liste cevirme : "+arraydenList);

        // iki listede de 11 ekleyelim

        sayilar.add(11);
        //arraydenList.add(11);
        System.out.println("sayilar listesi : "+sayilar);
        System.out.println("arrayden liste cevirme : "+arraydenList);

        // iki listin 0.index'indeki elementleri silelim

        sayilar.remove(0);
        //arraydenList.remove(0); // .IndexOutOfBoundsException

        System.out.println("sayilar listesi : "+sayilar);
        System.out.println("arrayden liste cevirme : "+arraydenList);

        // 2. dezavantaj

        System.out.println("array : "+Arrays.toString(arr));
        System.out.println("arrayden list : "+arraydenList);

        // array'in bir elementine yeni deger atayalim

        arr[0]=22;

        System.out.println("===== array'i degistirdikten sonra=====");
        System.out.println("array : "+Arrays.toString(arr));
        System.out.println("arrayden list : "+arraydenList);

        // list'in bir elementini update edelim

        arraydenList.set(1,45);
        System.out.println("===== list'i degistirdikten sonra=====");
        System.out.println("array : "+Arrays.toString(arr));
        System.out.println("arrayden list : "+arraydenList);





    }
}
