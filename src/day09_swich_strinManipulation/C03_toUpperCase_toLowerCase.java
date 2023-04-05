package day09_swich_strinManipulation;

import java.util.Locale;

public class C03_toUpperCase_toLowerCase {
    public static void main(String[] args) {

      String str = "Java Candir";
        System.out.println(str.toUpperCase()); // JAVA CANDİR

        System.out.println(str); // Java Candir

        // String manipulation yaptiktan sonra, asil variable'a atama yapmazsan
        // asil variable degismez

        str = str.toUpperCase();
        System.out.println(str); // JAVA CANDİR

        System.out.println(str.toLowerCase()); // java candir

        // str'i turkce karakterleri goz onunde bulundurursak kucuk harfe cevirin

        str = str.toLowerCase(Locale.forLanguageTag("TR"));

        System.out.println(str); // java candır










    }
}
