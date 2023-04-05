package day24_staticKeyword;

import java.util.Arrays;

public class C03_PassByValue {
    public static void main(String[] args) {

        int[] arr={3,4,5};
        elementleriArtir(arr,4);
        System.out.println("method call'dan sonra arr : "+Arrays.toString(arr)); // [7, 8, 9]

    }

    public static void elementleriArtir(int[] arr, int artisMiktari){

        for (int i = 0; i < arr.length ; i++) {
            arr[i]+=artisMiktari;
        }

        System.out.println("method'da arr : "+ Arrays.toString(arr));
    }
}
