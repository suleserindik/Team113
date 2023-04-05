package day29_inheritance;

public class C02_EnsapsulationKullanim {

    public static void main(String[] args) {

        C01 obj=new C01();

        obj.isim="Melike"; // write
        System.out.println(obj.isim); // read


        obj.setSayi(40); // write
        System.out.println(obj.getSayi()); // read

        /*
            Bir class uyesinin publis olmasi ile
            private yapilip, getter ve setter method'larinin olusurulmasi
            islevsel acidan ayni sonucu olusturur

            Bazi developerler set(write) ve get(read) yetkilerinin
            kullanildigini vurgulamak icin
            2. yontemi tercih ederler.
         */

    }
}
