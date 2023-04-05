package day13_methodOlusturma;

public class C05_StringiTersineCevirme {
    public static void main(String[] args) {

        // verilen bir String'i tersine cevirip
        // bize donduren bir method olusturun

        System.out.println(stringTersineCevir("Java Candir"));
        System.out.println(stringTersineCevir("anlasıldı mı"));
        System.out.println(stringTersineCevir("soyle omer"));

    }

    public static String stringTersineCevir(String metin){ // Java
        String tersMetin=""; //avaJ
        for (int i =metin.length()-1; i >=0 ; i--) {
            tersMetin+=metin.charAt(i);

        }
        return tersMetin;
    }

}
