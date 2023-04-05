package day22_constructors;

public class C06_Araba {
    /*
        bir obje olusturulurken default cons. veya parametresiz
        görünür cons. kullanilirsa obje ilk atanan degerlere sahip olur
        istedigimiz degerleri atamak icin tek tek tum variable'lara atama yapmamiz
        gerekir

        Bunun yerine

        Atamak istedigimiz degerleri parametre olarak cons.a
        yollayalim ve atamalari constructor icinde yapalim

     */

    public C06_Araba(String mrk,String mdl,boolean hmi,int yl,int fyt){
        yil=yl;
        marka=mrk;
        model=mdl;
        hasarliMi=hmi;
        fiyat=fyt;
    }

    public C06_Araba(){

    }


    @Override
    public String toString() {
        return " Araba Ozellikleri {" +
                "fiyat=" + fiyat +
                ", yil=" + yil +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", hasarliMi=" + hasarliMi +
                '}';
    }
    int fiyat;
    int yil;
    String marka="Marka belirtilmemis";
    String model="model belirtilmemis";
    boolean hasarliMi;

    public void yakitTuketimi(String yakitTuru){

        switch (yakitTuru){
            case "Benzin":
                System.out.println("benzinli araclar icin yakit tuketimi : 6/100 km");
                break;
            case "dizel":
                System.out.println("dizel araclar icin yakit tuketimi : 6/100 km");
                break;
            case "elektirikli":
                System.out.println("elektirikli araclar icin yakit tuketimi : 6/100 km");
                break;
            default:
                System.out.println("gecersiz");



        }
    }
}
