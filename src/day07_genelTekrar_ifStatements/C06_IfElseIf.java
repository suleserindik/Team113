package day07_genelTekrar_ifStatements;

import java.util.Scanner;

public class C06_IfElseIf {
    public static void main(String[] args) {

        /*
            soru - Kullanicinin kilo(kg) ve boyunun(cm) isteyip
            vucut kitle endekini hesaplayin (kilo*10000 / (boy*boy))
            vuvut kitle endeksi
            30'dan buyukse obez,
            25-30 arasin ise kilolu,
            20-25 arasi ise normal,
            20'den kucukse zayif yazdirin.
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kilonuzu Kg olarak giriniz : ");
        double kilo = scan.nextDouble();

        System.out.println("Lutfen boyunuzu Cm olarak giriniz : ");
        double boy = scan.nextDouble();

        double kitleEndeksi = (kilo * 10000 / (boy * boy));
        System.out.println("Vücut Kitle Endeksiniz : " + kitleEndeksi);

        if (kilo <= 0 || boy <= 0 || kilo > 300 || boy > 500) {
            System.out.println("Yanlis girdiniz, lutfen tekrar giriniz");

        } else if (kitleEndeksi < 20) {
            System.out.println("zayif");

        } else if (kitleEndeksi < 25) {
            System.out.println("Normal");

        } else if (kitleEndeksi < 30) {
            System.out.println("Kilolu");
        } else {
            System.out.println("Obez");
        }


    }
}
