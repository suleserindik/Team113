package day13_methodOlusturma;

import java.util.Scanner;

public class C06_MethodKullanma {
    public static void main(String[] args) {

        // Verilen bir String'in Palidrome olup olmadigini yazdirin
        // Palidrome : duzden ve tersten ayni sekilde yazilan
        // madam, kabak gibi

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir metin girin");

        String metin = scan.nextLine();

        String tersMetin =C05_StringiTersineCevirme.stringTersineCevir(metin);

        if(metin.equals(tersMetin)){
            System.out.println("Girilen metin POLIDROME");
        }else {
            System.out.println("Girilen metin POLIDROME degil");
        }
    }
}
