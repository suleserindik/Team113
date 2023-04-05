package day07_genelTekrar_ifStatements;

import java.util.Scanner;

public class C05_IfElseIf {
    public static void main(String[] args) {

        /*
            Kullanicidan cinsiyetini ve yasini alin,
            Kadin 60 yas ve uzeri, Erkek 65 yas ve uzeri emekli olabilir.

            cinsiyet ve yasini dikkate alarak "Emekli olabilirsiniz"
            veya "Emekli olmak icin... yil daha calismaniz gerek" yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi girin");

        double yas = scan.nextDouble();

        System.out.println("Lutfen cinsiyetinizi girin..." +
                            "\nKadin icin : K, Erkek icin : E giriniz");

        char cinsiyet = scan.next().charAt(0);

        if ((cinsiyet == 'K' && yas >= 60) || (cinsiyet == 'E' && yas >= 65)){
            System.out.println("Emekli olabilirsiniz");
        } else if (cinsiyet == 'K') {
            System.out.println("Emekli olabilmek icin : " + (60 - yas) + " yil daha calismalisiniz");
        } else if (cinsiyet == 'E') {
            System.out.println("Emekli olabilmek icin : " + (65 -yas) + " yil daha calismalisiniz");
        }


    }
}
