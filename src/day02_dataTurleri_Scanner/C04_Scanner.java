package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        // 1. adim : Scanner objesi olusturun
        Scanner scan = new Scanner(System.in);

        // 2. Adim: kullaniciya ne istediginizi soyleyin
        System.out.println("Lutfen ismizinizi giriniz");

        // 3. adim : girilen bilgiyi icine koyabileceginiz bir veriable olusturun
        //           olusturdugumuz Scanner objesi ile uygun method'u kullanarak bilgiyi alin


        String kullaniciIsmi = scan.next();

        System.out.println("Girilen isim : " + kullaniciIsmi);






    }

}
