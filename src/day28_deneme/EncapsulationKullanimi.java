package day28_deneme;

import day28_accsesModifier_encapsulation.C03_EncapsuleDatalar;

public class EncapsulationKullanimi {
    public static void main(String[] args) {

        System.out.println(C03_EncapsuleDatalar.getIsim());

        C03_EncapsuleDatalar obj= new C03_EncapsuleDatalar();
        obj.setSatisTutari(100);
        obj.setSatisTutari(200);
        obj.setSatisTutari(300);

        System.out.println("Toplam satis tutari : "+obj.toplamSatis);

    }
}
    /*
        C03_EncapsuleDatalar class'indaki
        isim variable'i gorunsun ama degistirelemesin
        satisTutari ise deger girilebilsin
        ama girilen degerler sonradan gorunemesin

        Eger bir variable icin read veya write ozelliklerinin birbirinden ayrilmasi isteniyorsa
        oncelikle access modifier ile kimsenin ulasamamasini saglayin

        private yaparak kimsenin ulasmayacagini garantiye aldiktan sonra
        read yetkisi vermek istediklerimiz icin getter()
        write yetkisi vermek istediklerimiz icin setter() methodu olusturmaliyiz




     */