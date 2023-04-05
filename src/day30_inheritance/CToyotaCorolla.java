package day30_inheritance;
public class CToyotaCorolla extends BToyota{
    String lastik="Lassa 205-55-15";
    String model="Corolla";
    String yakit="Corolla dizel, benzinli ve elektirikli olabiri";
    public void  motor(){
        System.out.println("Corolla araclar Turkiyede uretilen motor kullanir");
    }
    public void  uretimYeri(){
        System.out.println("Corolla araclar Turkiye'de uretilir");
    }
    public static void main(String[] args) {

        CToyotaCorolla corolla= new CToyotaCorolla();
        System.out.println(corolla.lastik); // Lassa 205-55-15
        System.out.println(corolla.model); // Corolla class'dan yazar
        System.out.println(corolla.yakit); // Corolla class'dan
        corolla.motor(); // Corolla class'dan
        corolla.uretimYeri(); // Corolla

        System.out.println(corolla.marka); // B Toyota
        System.out.println(corolla.aku); // B Toyota class'dan
        corolla.guvenlik(); // B Toyota

        System.out.println(corolla.vites); // Araba


    }
}