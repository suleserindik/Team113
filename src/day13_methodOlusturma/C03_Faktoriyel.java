package day13_methodOlusturma;

public class C03_Faktoriyel {
    public static void main(String[] args) {

        // verdigimiz bir sayinin farktoryelini hesaplayip
        // sonucu bize donduren bir method olusturun

           int sonuc = faktoriyelHesapla(5);
        System.out.println(sonuc);
        /*
            method olusturma asamalari
             1- public static standart (simdilik)
             2- olusturdugumuz method bize bir sonuc dondurecekse dondurecegi sonucun data turunu yaziyoruz
             3- method ismi
             4- method parantezi () icine methoda gondermemiz gereken bilgileri
                hangi variable ile gonderecegimizi yaz (parametre)
             5- dondurulmesi istenen islemi yap
             6- return keyword kullanarak dondurulmesi istenen degeri dondur
         */
    }

    public static int faktoriyelHesapla(int sayi){ // 5
        int faktoriyel=1;
        for (int i = sayi; i >=1 ; i--) {

            faktoriyel*=1;
        }
        return faktoriyel;
    }

}