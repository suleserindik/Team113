package day22_constructors;

public class C03_hemsireRunner {
    public static void main(String[] args) {

        /*
            Bir obje olusturulurken parametre olarak hic bir deger girilmezse olusturullan obje,
            olusturuldugu classdaki variable'lara atanan degerleri alir
            eger obje olusturulan class'da deger atamasi yoksa, Java default degerleri atar.
         */

        C02_Hemsire hemsire1=new C02_Hemsire();

        System.out.println(hemsire1.isim); // null // Isim atanmamis
        System.out.println(hemsire1.evliMi); // hiclik
        System.out.println(hemsire1.yas); //0
        System.out.println(hemsire1.izindeMi); // false

        hemsire1.isim="Tuba";
        hemsire1.yas=29;

        System.out.println(hemsire1.isim); // Tuba
        System.out.println(hemsire1.yas); // 29

    }
}
