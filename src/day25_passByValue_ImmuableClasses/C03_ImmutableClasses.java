package day25_passByValue_ImmuableClasses;

public class C03_ImmutableClasses {
    public static void main(String[] args) {

        /*
            Java da bir class ve o class'dan olusturulan objeler
            ya mutable'dir ya da immutable'dir

            Java metinsel ifadeleri atayabilecegimiz 3 class olusturmustur
            String --- immutable
            StringBuilder --- mutable
            StringBuffer --- mutable

            immutable bir class'dan olusturulan objelerde immutable'dir.
            String immutable oldugundan ayni str objesine yeni deger atandiginda Java eski degeri DEGİSRİREMEZ
            bunun yerine istenen yeni degere sahip yeni bir obje olustrur.
            ve str'in pointer!ini yen, objeye yoneltir

            kullanilmayan eski objeler
            Garbage Collector tarafindan topllanmak uzere beklerler
         */

        String str="Java candir";

        str=str.toLowerCase();

        System.out.println(str); // java candir

        str=str.toUpperCase();
        System.out.println(str); // JAVA CANDİR

        // asagidaki kod calistiginda Java kac obje olusturur
        String s="Hava";
        for (int i = 0; i <100 ; i++) {
            s=s+".";
        }
        System.out.println(s);
    }
}
