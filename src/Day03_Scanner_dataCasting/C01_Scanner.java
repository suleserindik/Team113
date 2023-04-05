package Day03_Scanner_dataCasting;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        // soru 3- Kullanicidan ismini, soyismini, ve yasini alip, asagidaki formatta yazdirin.
        // Isminiz : John
        // Soyisiminiz : Doe
        // Yasiniz : 44
        // Kaydiniz basariyla tamamlanmistir.


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");

        String isim = scan.nextLine();

        System.out.println("Lutfen soyisminizi yaziniz");

        String soyisim = scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");

        double yas = scan.nextDouble();


        /*
        System.out.println("Isminiz : " + isim);
        System.out.println("Soyisminiz : " + soyisim);
        System.out.println("Yasiniz : " + yasiniz);
        System.out.println("Kaydiniz basariyla tamamlanmistir.");
         */

        // kullanici istedigimiz data turunde bilgi girisi yapmazsa
        // kodumuzda hata olusur ve calisma durur
        // ilerde kulanici hatalarina karşi nasil tedbirler alacagimzi ogrenecegiz
        // simdilik kullanici biz ne diyorsak onu tam yapiyor kabul edelim


        /*
        System.out.println()' deki ln
        yazdirma islemini yaptiltan sonra
        alt satira gecmesini saglar
        println yerine print yazarsak
        yazdirdigimiz seyler yan yana yazdirilir
         */

        System.out.println("Isminiz : " + isim +
                            "\nSoyisiminiz : " + soyisim +
                            "\nYasiniz : " + yas +
                            "\nKaydiniz basariyla tamamlanistir.");

        /*
        Tek bir System.out.println() ile birden fazla satir yazdirmak isterseniz
        String bir ifadenin icinde istedigimiz yere \n yazabiliriz.
         */


    }
}
