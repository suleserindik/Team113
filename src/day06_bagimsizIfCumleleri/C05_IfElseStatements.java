package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {

        // Eger bir olay icin sadece iki olasilik varsa ve bu
        // olasiliklardan biri mutlaka calisacaksa
        // o zaman if else statements kullaniriz

        // If-else statements'da if body si veya else body si mutlaka calisir
        // ikisinin birden calisma ihtimali yoktur
        // ikisininde calismama ihtimali yoktur

        Scanner scan = new Scanner(System.in);


        // soru5- Kullanicidan notunu alin
        //        50 veya daha buyukse "Sinifi Gectiniz"
        //        50'den kucukse "Malesef Kaldiniz"


        System.out.println("Lutfen notunuzu giriniz");

        double not = scan.nextDouble();

        if(not>=50 && not<=100){
            System.out.println("Sinifi gectin");
        }else{
            System.out.println("Malesef kaldin");
        }



        // Kullanicidan pozitif bir tam sayi alin
        // sayinin tek veya cift sayi oldugunu yazdirin

        System.out.println("Lutfen poziti bir tam sayi giriniz");
        int sayi= scan.nextInt();

        if(sayi %2==0){
            System.out.println("Sayi cift sayi");
        }else{
            System.out.println("Sayi tektir");
        }


        // Kuulanicidan bir pozitif tam sayi alin
        // 5 ile bolunup bolunmedigini yazdirin

        if(sayi %5==0){
            System.out.println("Sayi 5 ile tam olarak bolunur");
        }else {
            System.out.println("Sayi 5 ile bolunemez");
        }




    }
}
