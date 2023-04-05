package day17_arrays;

public class C03_ArraydeIstenenElemeniBulma {
    public static void main(String[] args) {

        // soru 4- Verilen bir array'de istenen bir
        // elemanin var olup olmadigini ve varsa
        // kac kere kullanildigini yazdiran bir method olusturun

        int[] arr1={2,4,5,2,6,4,7,3,5};

        elemanSayisiYazdir(arr1,3); // 1
        elemanSayisiYazdir(arr1,2); // 2
        elemanSayisiYazdir(arr1,5); //2

        String[] arr2={"E","H","M","H","E"};
        elemanSayisiYazdir(arr2,"E"); // 2
        elemanSayisiYazdir(arr2,"H"); // 2
    }

    public static void elemanSayisiYazdir(int[] arr,int arananSayi){

        int sayac=0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] == arananSayi){
                sayac++;
            }
        }
        System.out.println(sayac);
    }

    public static void elemanSayisiYazdir(String[] arr, String arananElement){

        int sayac=0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i].equals(arananElement)){
                sayac++;
            }
        }
        System.out.println(sayac);
    }
}
