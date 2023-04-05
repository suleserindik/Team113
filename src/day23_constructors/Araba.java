package day23_constructors;

public class Araba {

    int yil;
    String marka="Marka belirtilmemis";
    String model="Model belirtilmemis";
    boolean hasarliMi;
    int fiyat;

    @Override
    public String toString() {
        return "Araba Bilgileri : {" +
                "yil=" + yil +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", hasarliMi=" + hasarliMi +
                ", fiyat=" + fiyat ;
    }
    public Araba(int yil, String marka, String model,boolean hasarliMi, int fiyat){
        /*
            Eger parametre ismi instance variable ismi ile ayni degilse
            bir alttaki consturactorda oldugu gibi direkt atama yapabiliriz

            Ancak genelde projeenin daha anlasilir olmasi ve dogru variable'in kullanilmasi icin
            consturactordaki parametre isimleri instance variablelar ile ayni secilir

            Bu durumda Javaya ayni isimdeki variabledan
            hangisinin bu lassdaki instance variable oldugunu belirtmemiz gerekir

            Bunun icin Java syntax olarak this. yazilmasini istemistir.

            this. yazmazsak Java en kisa sekilde ulasabilecegi variable'i bulur.
         */

        this.yil=yil;
        this.marka=marka;
        this.model=model;
        this.hasarliMi=hasarliMi;
        this.fiyat=fiyat;


    }
    public Araba(int fyt,String mrk){
        fiyat=fyt;
        marka=mrk;
    }

    public Araba(int yil, String marka, String model, int fiyat) {
        this.yil = yil;
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;
    }

    public Araba(){

    }

    public void yakitTuketimi(String yakitTuru){
        switch (yakitTuru){
            case "Benzin" :
                System.out.println("benzinli araclar icin yakit tuketimi: 6 l/100 km");
                break;
            case "dizel" :
                System.out.println("Dizel araclar icin yakit tuketimi: 5 l/100 km");
                break;
            case "Elektrik" :
                System.out.println("Elektrikli araclar icin yakit tuketimi: 5 kW/100 km");
                break;
            default:
                System.out.println("gecersiz yakit turu");
        }
    }









}
