package day32_inheritance_DataTypeKullanimi;

public class HAvciKuslar extends GKuslar{
    public void hareket(){
        System.out.println("ucarlar");
    }
    public void beslenme(){
        System.out.println("et yerler");
    }
    public void pence(){
        System.out.println("pencelidir");
    }
    public void gaga(){
        System.out.println("sivri gagali");

        HAvciKuslar kartalAvci= new HAvciKuslar();
        kartalAvci.hareket(); //
        kartalAvci.beslenme();
        kartalAvci.pence();
        kartalAvci.gaga();

        kartalAvci.kanat();
        kartalAvci.solunum();
        kartalAvci.cogalma();

        kartalAvci.omur();

        GKuslar kuslar= new GKuslar();
        kuslar.hareket(); // F hareket ederler
        kuslar.beslenme(); //F beslenirler
        // kuslar.pence(); CTE
        kuslar.gaga(); // G gagalari vardir

        kuslar.kanat(); // G kanatlidir
        kuslar.solunum(); // G akcigerle nefes alirlar
        kuslar.cogalma(); // G yumurta ile cogalirlar

        kartalAvci.omur(); // F yasar ve olurler



        /*
            ozellikler method olarak olusturulmus ise
            data turu ve constructor ayni ise
            o class'dan aramaya baslarim
            buldugum ilk degeri kullanirim
         */
    }

}
