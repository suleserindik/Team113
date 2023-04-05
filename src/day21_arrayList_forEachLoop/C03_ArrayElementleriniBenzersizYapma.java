package day21_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ArrayElementleriniBenzersizYapma {
    public static void main(String[] args) {

        // Soru 1- Verilen bir array’de tekrar eden elementler icin,
        // mukerrer olanlari silip, tum elemanlardan sadece 1 tane yazip
        // eski array’e yeni halini atayip yazdirin.

        int[] arr = {3, 4, 5, 6, 7, 8, 9, 1, 3, 4, 5, 6, 7, 8};

        List<Integer> benzersizElementListesi = new ArrayList<>();

        // arraydeki her bir elementi kontrol edelim,
        // liste yoksa ekleyelim, varsa eklemeyelim

        for (int each:arr
             ) {
            if(!benzersizElementListesi.contains(each)){
                benzersizElementListesi.add(each);
            }
        }
        System.out.println(benzersizElementListesi);

        arr =new int[benzersizElementListesi.size()];

        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0, 0, 0, 0]

        for (int i = 0; i < arr.length ; i++) {
            arr[i]=benzersizElementListesi.get(i);
        }
        System.out.println(Arrays.toString(arr)); // [3, 4, 5, 6, 7, 8, 9, 1]
    }

}
