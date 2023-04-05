package day21_arrayList_forEachLoop;

public class C04_KareleriToplama {
    public static void main(String[] args) {

        // Soru 2- Verilen int array’deki her elementin karelerini alip,
        // karelerinin toplamini yazdiran bir method olusturun.

        int [] arr ={2,3,5};

        karelerToplaminiYazdir(arr);

    }

    public static void karelerToplaminiYazdir(int[] arr){

        int karelerToplami=0;
        for (int each: arr
             ) {
            karelerToplami+=each*each;
        }

        System.out.println("verilen arraydeki elementlerin kareleri toplami : "+karelerToplami);

    }


}
