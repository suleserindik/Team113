package day24_staticKeyword;

import day23_constructors.C02_ConsturactorCall;

public class C01_staticBlocks {

    C01_staticBlocks(){
        System.out.println("consturactor calisti");
    }

    public static void main(String[] args) {


        System.out.println("Main method calisti");
        System.out.println("===================");
        C01_staticBlocks obj1=new C01_staticBlocks();
    }

       static {

        /*
            static bloklar class ilk calismaya basladiginda calisir
            genel olarak class icin gerekli on ayarlamalari yapmak icin kullanilir

            birden fazla static blok varsa
            yukaridan asagi dogru sirali olarak calisir
         */
           System.out.println("static method calisti");
       }

       static {
           System.out.println("alttaki static blok calisti");
       }

    {
        /*
            static olmayan blok'lar ise obje olustururken
            cons.dan once calisir
            obje icin yapilmasi gereken on ayarlamalari yapmak icin kullanilir
         */

        System.out.println("static olmayan block calisti");
    }


}
