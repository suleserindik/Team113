package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {

     // Kullanicidan bir karakter girmesini isteyin
     // girilen karakter buyuk harf olup olmadigini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char krk=scan.next().charAt(0);

        if('A'<=krk && krk<='Z'){
            System.out.println("Girilen karakter buyuk harftir");
        }else {
            System.out.println("Girilen karaker buyuk harf degil");
        }




    }
}
