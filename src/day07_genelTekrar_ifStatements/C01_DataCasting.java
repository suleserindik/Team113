package day07_genelTekrar_ifStatements;

public class C01_DataCasting {
    public static void main(String[] args) {

        // Java'da bazi data türleri asla baska data turune cevrilemez

        /*
        String str1= false;
        String str2= 20;
        boolean bl1="Merhaba";
         */

        // ozellikle sayisal data turundeki degerler,
        // baska sayisal data turundeki variable'lara atanabilir.

        double db1= 23;
        short sh1= 12;

        int sayi2= sh1;

        // daha dar data turundeki degrei, daha genis data turundeki variable'a atamaya
        // auto widening denir Java bunu otomatik yapar

        sh1= (short) sayi2;
        sayi2=(int)db1;

        // daha genis data turundeki degeri, daha dar data turundeki variable'a atamaya
        // explicit narrowing denir ve Java bunu otomatik yapmaz
        // bizden onay ister

        sayi2 = 'k';
        if (sayi2 > 'd');{

        }
        // char data turundeki degerler, sayisal islemlerde kullanilabilir
        // bir char matematiksel islemde kullanilirsa ASCII table'deki degeri ile isleme girer

        System.out.println((char)('k'+1)); //1 yani l harfini yazdirir

        db1= 3987876765d;
        int sayi3= (int)db1;

        System.out.println("sayi3 : " + sayi3);

        short sh2 = (short)db1;

        System.out.println("sh2 : " + sh2);

        String str5 = "112";

        short sh3 = Short.parseShort(str5);

        System.out.println("sh3'un iki kati : " + sh3*2);


    }

}
