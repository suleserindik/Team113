package day32_inheritance_DataTypeKullanimi;

public class BKuslar extends AHayvanlar {

    String kanat = "kanatlidirlar";
    String solunum = "akcigerle nefes alirlar";
    String gaga = "gagalari vardir";
    String cogalma ="yumurtayla cogalirlar";


    static class CAvciKuslar extends BKuslar {

        String hareket = "ucarlar";
        String beslenme = "et yerler";
        String pence = "pencelidirler";
        String gaga = "sivri gagali";

        public static void main(String[] args) {

            CAvciKuslar kartalAvci=new CAvciKuslar();
            System.out.println(kartalAvci.hareket); // C ucarlar
            System.out.println(kartalAvci.beslenme); // C et yerler
            System.out.println(kartalAvci.pence); // C pencelidir
            System.out.println(kartalAvci.gaga); // C sivri gagali

            System.out.println(kartalAvci.kanat); // B kanatlidir
            System.out.println(kartalAvci.solunum); // B akcigerle nefes alir
            System.out.println(kartalAvci.cogalma); // B yumurtayla cogalir

            System.out.println(kartalAvci.omur); // A yasar ve olurler

            BKuslar kartalKus= new CAvciKuslar();
            System.out.println(kartalKus.hareket); // A hareket ederler
            System.out.println(kartalKus.beslenme); // A beslenirler
            //System.out.println(kartalKus.pence); // CTE (Java geri vites yapmaz)
            System.out.println(kartalKus.gaga); // B gagalari vardir

            System.out.println(kartalKus.kanat); // B kanatlidir
            System.out.println(kartalKus.solunum); // B akcigerle nefes alir
            System.out.println(kartalKus.cogalma); // B yumurtayla cogalir

            System.out.println(kartalKus.omur); // A yasar ve olurler

            AHayvanlar kartalHayvan= new CAvciKuslar();
            System.out.println(kartalHayvan.hareket); // A hareket ederler
            System.out.println(kartalHayvan.beslenme); // A beslenirler
            //System.out.println(kartalHayvan.pence); // CTE (Java geri vites yapmaz)
            //System.out.println(kartalHayvan.gaga); // CTE

            //System.out.println(kartalHayvan.kanat); // CTE
            System.out.println(kartalHayvan.solunum); // A nefes alir
            System.out.println(kartalHayvan.cogalma); // A cogalirlar

            System.out.println(kartalHayvan.omur); // A yasar ve olurler

            // variable olarak ozellikleri olusturursak
            BKuslar kuslar=new BKuslar();
            BKuslar avciKuslar = new CAvciKuslar();
            // bu iki obje arasinda bir fark goremeyiz, (ortak ozellik ariyoruz cunku)





            /*
                Eger bir obje olusturulurken data turu ve constructor ayni ise
                aradigimiz özellikler icin direk o class'a gider ve ozellikleri arariz

                Eger data turu ve constructor farkli ise variable ve methodlar farkli davranirlar.

                Variable'lar
                -once data turunun oldugu class'a bakar
                  o variable'i bulursa degerini yazdirir
                  bulamazsa data turunun parentlarina bakar
                  orada bulursa degerini yazdirir
                  orada da bulamazsa CTE verir.


                  Ozetle bir ozelligi variable olarak olustrursaniz
                  data turu olan class ve parent'larindaki ortak
                  bilgileri arar, en guncel bilgiyi aramaz!!

             */


        }



    }
}
