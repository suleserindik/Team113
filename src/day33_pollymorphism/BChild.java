package day33_pollymorphism;

public class BChild extends  AParent {

    void method1() {
        // super.method1();
        // burda super. olursa hem child class'daki method1
        // hem de super class'daki method1 calisir.

    }

    int method2() {
        /*
            bir method override edildiginde
            child class'da @override notasyonu kullanilabilir

            kullanmak veya kullanmamak arasinda
            pratikte soyle bir sonuc olusur.

            eger notasyon kullanilirsa
            iki method arasindaki iliski takip edilir.
            parent class'daki method silinirse,
            notasyon CTE verir.

            notasyon yoksa parent class'daki overriden method silinirse
            bir uyari verilmez, CTE olusmaz


         */
        return 0;
    }


    private Integer method3() {

        /*
            Overridden method ile overriding method'un
            isim ve signature'lari ayni olmalidir

            return type ve access modifier
            signature'a dahil degildir ancak
            overriding'de bunlarla ilgili kurallar vardir.

            1- access modifier kurali :
               child parent'i kisitlayamaz

               eger overriden ve overriding method'lari
               private yaparsak
               bu iki method bagimsiz olarak calisir
               aralarinda override islemi olmaz

           2- Return type kurali
              return type primitive veya void ise
              iki method'un return type'i ayni olmalidir

              non-primitive oldugunda
              ya ayni olmali ya da parent class'daki return type
              child class'daki return type'in parenti olmali
              (covariant data)

         */
        return 5;
    }


}

