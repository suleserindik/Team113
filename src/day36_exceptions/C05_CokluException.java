package day36_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_CokluException {

    public static void main(String[] args) {


        String str = "Java her gecen gun guzellesiyor";
        int[] arr = {3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6};

        // kullanicidan 0 veya pozitif bir tamsayi isteyn
        // girilen degeri index olarak kullanip
        // str ve arr'nin o index'indeki elemanlari yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Index olarak kullanmak icin o veya pozitif bir tamsayi girin");

        /*
            Birbirinden bagimsiz uc farkli turde exception risk var
            Bunlari farkli sekillerde handle edebiliriz

            1- her birini ayri ayri try catch yapariz (basit kacar dedi Ahmet hoca :) )
            2- tek bir try, birden fazla catch yapabiriz
            3- tek bir try catch yapip tum exception'lari yakalayacak bir exception turu yazilabilir

         */
        try {
            int index = scan.nextInt(); // InputMismatchException

            System.out.println(str.charAt(index)); // StringIndexOutOfBoundsException

            System.out.println(arr[index]); // ArrayIndexOutOfBoundsExecption
        } catch (RuntimeException e) {
            // System.out.println("giris hatali olabiliri index String veya Array'in disinda olabilir");
            e.printStackTrace();
            // biz mesaj yazacaksak genel bir mesaj yazabilirz veya
            // Java'nin hata kodlarini yazdirabiliriz
        }

        try {
            int index = scan.nextInt(); // InputMismatchException

            System.out.println(str.charAt(index)); // StringIndexOutOfBoundsException

            System.out.println(arr[index]); // ArrayIndexOutOfBoundsExecption

        } catch (InputMismatchException e) {
            System.out.println("Tamsayi girmelisin");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Girilen index String sinirlarii disinda");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Girilen index Array sinirlari disinda");
        }

    }
}
