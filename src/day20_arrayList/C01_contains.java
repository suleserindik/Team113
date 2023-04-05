package day20_arrayList;


import java.util.ArrayList;
import java.util.List;

public class C01_contains {
    public static void main(String[] args) {

        // uzun bir listeyi javada list olarak kaydetmek istersek
        // tek tek eklemek istemezseniz
        // pratik olarak bir array olusturup loop ile
        // tum elemetleri list'e ekleyebiliriz

        int[] arr={2,3,4,5,6,7,8,9,8,7,6,5,4,3,2};

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);
        }
        System.out.println(sayilar); // [2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3, 2]

        // Listede element olarak 3 var mı ?

        System.out.println(sayilar.contains(3)); // true

        System.out.println(sayilar.contains(1)); // false

        sayilar.clear();
        System.out.println(sayilar); // []



    }
}
