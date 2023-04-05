package day11_stringManipulations_ForLoop;

import java.util.Scanner;

public class C07_SifreKontrol {
    public static void main(String[] args) {
        //Soru 4 : Kullanicidan bir sifre isteyip,
        // asagidaki sartlari kontrol edin ve
        // kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali
        // soruyu if else ile yaparsak sadece 1 hata yazdirir, otekilere bakmaz
        // bagimsiz 4 if-else cumlesi olmali
        // en sonda 4 sarti'da sagladigini kontrol eden bir variable kullanacagiz

        // soruyu if else ile yaparsak sadece bir hata calistirir digerlerine bakmaz
        // bagimsiz 4 if cumlesi olmali
        // en sonda dört sartida sagladigini kontrol eden variable kullancagiz


        int flag =0;
        String sifre ="abscteftr9";

        // - ilk harf kucuk harf olmali

        if(sifre.charAt(0)>='a' && sifre.charAt(0)<='z'){
            flag ++;
        } else {
            System.out.println("ilk karakter kucuk harf olmali");
        }

        // - son karakter rakam olmali

        char sonHarf =sifre.charAt(sifre.length()-1);

        if (sonHarf>='0' && sonHarf<='9'){
            flag++;
        }else {
            System.out.println("son karakter rakam olmali");
        }
        // - sifre bosluk icermemeli

        if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
        }else{
            flag++;
        }

        //- uzunlugu en az 10 karakter olmali

        if (sifre.length()>=10){
            flag++;
        }else {
            System.out.println("sifrenin uzunlugu en az 10 karakter olmalidir");
        }

        // sifre tum sartlari saglarsa, "Sifre basariyla kaydedildi" yazdirin

        if(flag==4){
            System.out.println("Sifre basariyla kaydedildi");
        }









    }
}
