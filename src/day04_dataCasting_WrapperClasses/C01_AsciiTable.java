package day04_dataCasting_WrapperClasses;

import java.util.Scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {


            /*

            24 == 11000
            a == 97 == 10100010
            b === 98
             */

            //char data turundek variable ve degerler
            // sayisal data turlerine atanirsa veya
            // sayisal data tutundeki datalarla isleme sokusulursa
            // ASCII table'daki degerleri ile isleme girer

            System.out.println(5 + 'a'); // 5 + 97 = 102

            char ilkHarf = 101;

            System.out.println(ilkHarf); // e

            // kullanicinin verdigi harften bir sonraki harfi yazdirin

            char girilenChar = 'f';

            System.out.println(girilenChar + 1); // 102 + 1 = 103
            //biz 103'u degil, 103'un karsiligi olan char ifadeyi yazdirmak istersek explicit casting yapariz

            System.out.println("Girilen harfin bir sonrasi : " + (char) (girilenChar + 1));

            // verilen bir haften 2 oncekini yazdirin

            girilenChar = 'M';

            System.out.println(girilenChar - 2); // 77 - 2= 75

            System.out.println((char) (girilenChar - 2)); // K
        }


    }



