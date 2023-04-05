package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C08_IfElseStatements {
    public static void main(String[] args) {

        // Kullanicidan bir karakter isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf yazdirin,
        // yoksa girilen harfi yazdirin

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir karakter girin");
        char krk =scan.next().charAt(0);

        if('a'<=krk && krk<='z'){

            System.out.println(Character.toUpperCase(krk));

        }else {
            System.out.println(krk);
        }





    }
}
