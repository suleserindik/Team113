package day18_multiDmensional;

public class C04_MDA {
    public static void main(String[] args) {

        String[][] siniflar={{"A","B","G","M"},{"F","P","G","A"},{"K","D","Q"}};

        // G'yi yazdirin

        System.out.println(siniflar[0][2]); // G

        // Q'yu Y yapin

        siniflar[2][2]="Y";
        System.out.println(siniflar[2][2]); // Y

        // ilk sinifin mevcudunu yazdirin

        System.out.println(siniflar[0].length); // 4

        // siniflarda toplam kac kisi oldugunu yazdirin
        System.out.println(siniflar.length); // 3

        int toplamOgrSayisi=0;

        for (int i = 0; i < siniflar.length ; i++) {

            toplamOgrSayisi+=siniflar[i].length;
        }
        System.out.println("toplam ogrenci sayisi : "+toplamOgrSayisi); // 11

    }
}
