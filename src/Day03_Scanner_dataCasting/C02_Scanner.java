package Day03_Scanner_dataCasting;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        // Soru 5: Kullaanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        //         Girilen Bilgiler : J Doe, 44

        Scanner scan = new Scanner(System.in);

        // isterseniz tek aciklamada tüm bilgileri alabilirisinz.

        System.out.println("Lutfen isminizi, soyisminizi ve yasinizi giriniz" +
                "\nHer bilgiden sonra ENTER'a basiniz");

        char isimIlkHarf= scan.nextLine().charAt(0);

        /*
        Scanner method'larinda nextChar() yok bunun icin once kullanicinin girisine gore next() veya nextLine() yazip
        sonra .charAt(0) yazariz
        parantez icindeki 0 almak istedigimiz char'in index'idir
        veya java'da index 0'dan baslar.
         */


        String soyisim= scan.nextLine();
        double yas = scan.nextDouble();

        System.out.println("Girilen Bilgiler : "+isimIlkHarf+" "+soyisim+","+yas+
                            "\nKaydiniz tamamlanmistir.");



    }
}
