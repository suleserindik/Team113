package day04_dataCasting_WrapperClasses;

import java.util.Scanner;

public class C05_SayininRakamlarToplaminiBulm {
    public static void main(String[] args) {

        // kullanicidan 3 basamakli bir sayi alin
        // ve sayinin rakamlar toplamini yapin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli pozitif bir tam giriniz");

        int girilenSayi = scan.nextInt(); //135

        int rakam = girilenSayi % 10;

        int rakamlarToplami = rakam;

        //===================

        girilenSayi = girilenSayi / 10; // 13

        rakam = girilenSayi % 10; // rakam = 3

        rakamlarToplami = rakamlarToplami + rakam; // rt=8

        //====================

        girilenSayi = girilenSayi / 10; // 13 / 10 == sayi= 1

        rakam = girilenSayi % 10; // rakam = 1

        rakamlarToplami = rakamlarToplami + rakam; //9

        System.out.println("rakamlar toplami : " + rakamlarToplami);

    }
}
