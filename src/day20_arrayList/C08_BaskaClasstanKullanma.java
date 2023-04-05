package day20_arrayList;

public class C08_BaskaClasstanKullanma {
    public static void main(String[] args) {

        // verilen sayinin pozitif tam bolenleri sayisi 10'dan cokk ise "Guzel"
        // yoksa "Kotu" yazdirin

        int sayi=100;
        int pozitifTamBolenlerSayisi= C07_TamBolenlerListesi.pozitifBolenleriListele(sayi).size();

        if(pozitifTamBolenlerSayisi>10){
            System.out.println("Guzel");
        }else{
            System.out.println("Kotu");
        }



    }
}
