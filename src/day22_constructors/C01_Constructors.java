package day22_constructors;

import day21_arrayList_forEachLoop.C04_KareleriToplama;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class C01_Constructors {
    public static void main(String[] args) {
        /*
            Bir obje ancak bir class'dan olusturulabilir.
            Bir objeyi olusturdugumuz class ayni zamanda o objenin data turudur.

            Her obje olusturuldugu class'in özelliklerini tasir

            Eger bir programda, ortak ozelliklere sahip objeler uretmek uzere taasarladıgınız bir class varsa
            main method olmasi sart degildir
            Bu class'lar kaliphane gibi calisir
            Yani o class'tan ayni ozelliklere sahip objeler uretmemizi saglar
         */

        Scanner scan =new Scanner(System.in);

        List<String> isimler=new ArrayList<>();

        C04_KareleriToplama obje =new C04_KareleriToplama();

        Random rnd=new Random();

        String str =new String("Ali");

        C02_Hemsire hemsire1=new C02_Hemsire();
        System.out.println(hemsire1.mesaiUcretiHesapla(5));



        String str2;
        Random rnd2;
        List<String> harfler;


    }
}
