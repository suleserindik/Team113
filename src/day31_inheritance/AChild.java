package day31_inheritance;

import day30_inheritance.GParent;

public class AChild extends GParent {

        String childStr;
        AChild(){

            System.out.println("Child class constructor calisti");
        }

     public static void main(String[] args) {

         // System.out.println(childStr); static degil o yuzden kullanamayiz
         // System.out.println(sayiParent); static degil
         // System.out.println(sayiGrandParent); static degil

         AChild objeChild = new AChild();


         /*
            java 'da inheritance kullanirken child class'daki obje parent classlardaki
            tum ozelliklere sahip olur
            bunu saglayan java mekanizmasi super() constructor call'dur

            Extends keyword kullanan bir class'da
            olusturulan her bir constructor'in ilk satirinda
            biz gormesek bile super() constructor call vardir.
            super() == once parent class'a gidip oradaki parametresiz constructor'i calistir demektir

            bu sekilde child class'daki constructor calistiginda extends keyword kullanmayan
            parent buluncaya kadar parent class'lara gider.

          */

     }
}
