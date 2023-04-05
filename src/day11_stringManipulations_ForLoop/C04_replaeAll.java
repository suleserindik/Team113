package day11_stringManipulations_ForLoop;

public class C04_replaeAll {
    public static void main(String[] args) {

        String str = "J1a23va34 5C54and5ir87";

        // str'daki sayilari methodla temizleyin
        /*
            eger degistirmek istedigimiz metin tek bir metin degilse,
            ortak ozelligi olan farkli metinlerse

            -tum sayilar
            -sayi olmayanlarin tumu
            -tum space'ler
            -space olmayan tum karakterler

            bu ortak ozellikleri belirtmek icin Java regex tanimlamistir
         */
        str= str.replaceAll("\\d","");
        System.out.println("str'in yeni hali : "+ str);



    }
}
