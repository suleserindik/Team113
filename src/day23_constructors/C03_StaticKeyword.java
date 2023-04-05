package day23_constructors;

public class C03_StaticKeyword {
    static  String hastaneIsmi="Yildiz Hastanesi";
    static String hastaneTelefonu="312343434";
    static  String bashekimIsmi="Kemal Aydin";
    String personelIsmi;
    String personelAdresi;
    String personelTelefonu;

    public static void main(String[] args) {

        C03_StaticKeyword personel1=new C03_StaticKeyword();

        System.out.println(personel1.personelIsmi); // null
        System.out.println(hastaneIsmi); // Yildiz
        System.out.println(personel1.bashekimIsmi); // Kemal

        C03_StaticKeyword personel2=new C03_StaticKeyword();

        personel2.personelIsmi="Dogan";
        System.out.println(personel2.personelIsmi); // Dogan
        System.out.println(personel1.personelIsmi); // null

        personel2.bashekimIsmi="Sumeyra Gunel";
        System.out.println(personel1.bashekimIsmi); // Sumeyra Gunel



        /*
            1-Static variable'lar tum class icin gecerlidir (class variable)
            2- Static variable'lar tum objeler icin ayni degeri tasidiklari icin
               her obje icin ayrica olusturulmaz sadece bir variable olur
            3- Static variable'lara ulasmak veya update etmek icin obje ismi kullanmaya gerek yokktur
               direkt ulasilabir
               Baska class'dan static variable'a ulasmak icin classismi.staticVariable yazilir
         */




    }
}
