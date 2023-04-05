package day27_stringBuilder;

public class C04_StringBuilderdeStringMethodlari {
    public static void main(String[] args) {

        /*
            StringBuilder class'inda olmayip S
            tring calss'inda olan methodlari kullanmak istersek
            sb.toString() kullanarak StringBuilder'i once String'e cevirip
            sonra istedigimiz String methodu kullaniriz

            bu konuda dikkat etmemiz gereken konu
            String donduren metfodlar
            veya String class'indan kullanacagimiz methodlar
            kalici degisiklik yapmaz
         */

        StringBuilder sb1 = new StringBuilder("Java Candir");
        StringBuilder sb2 = new StringBuilder("Java candir");
        sb1.substring(5);

        System.out.println(sb1); // Java Candir

        // sb1 =sb1.substring(5);

        System.out.println(sb1.compareTo(sb2)); // -32

        System.out.println(sb1.toString().equalsIgnoreCase(sb2.toString())); // true

        sb1.subSequence(3,6);
        System.out.println(sb1); // Java Candir






    }
}
