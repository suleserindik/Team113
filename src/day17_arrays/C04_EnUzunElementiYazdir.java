package day17_arrays;

public class C04_EnUzunElementiYazdir {
    public static void main(String[] args) {

        // soru 6- Verilen String bir array'deki
        //          en uzun ve en kisa kelimeleri yazdiran bir method olusturun

        String[] arr1 ={"Melike","Burkay","Inci","Eda","Emre","Ali"};

        enUzunEnkisaYazdir(arr1); // Melike, Eda // = koyunca Burkay, Ali olarak aldi

        String[] arr2 ={"Melike","Burkay","Inci","Eda","Emre","Huseyin","Su"};

        enUzunEnkisaYazdir(arr2); // Huseyin, Su


    }

    public static void enUzunEnkisaYazdir(String[] arr){

        String enUzunKelime=arr[0]; // uzunluk 0
        String enKisaKelime=arr[0]; // uzunluk 0

        for (int i = 0; i < arr.length ; i++) {

            if(arr[i].length()>=enUzunKelime.length()){
                enUzunKelime=arr[i];
            }

            if(arr[i].length()<=enKisaKelime.length()){
                enKisaKelime=arr[i];
            }
        }

        System.out.println("array'deki en uzun kelime : "+enUzunKelime);
        System.out.println("array'deki en kisa kelime : "+enKisaKelime);
    }


}
