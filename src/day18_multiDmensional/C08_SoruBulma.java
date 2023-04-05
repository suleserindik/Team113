package day18_multiDmensional;

public class C08_SoruBulma {
    public static void main(String[] args) {


        // array'de kac tane tek sayi oldugunu bulun

        int[][] arr = {{3, 5, 7}, {1, 2, 3, 4}, {1, 2}, {7}};

        System.out.println(tekSayiBulma(arr));


    }
    public static int tekSayiBulma(int [][] array){



        int sayac = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] % 2 != 0) {
                    sayac++;
                }
            }
        }

        System.out.println("tek sayi adedi : " + sayac); // 3
     return sayac;
    }

}
