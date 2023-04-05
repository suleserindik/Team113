package day31_inheritance;

public class Hemsire extends FMuhasebe{


    String unvan="Hemsire";

    public void standartMaas(){
        System.out.println("Hemsireler min 10b tl maas alir");
    }

    public void ozelSigorta(){
        System.out.println("Hemsireler aylik 300 tl katki ile ozel sigorta yaptirabilir");
    }

    public void nobetUcreti(int nobetSayisi){
        System.out.println(nobetSayisi*200);
    }

    public static void main(String[] args) {
        Hemsire hemsire= new Hemsire();
        hemsire.method();
    }

    public void method() {

        Hemsire hemsire=new Hemsire();
        System.out.println(hemsire.unvan); // Hemsire this.unvan dersekte olur ve bu classda arar
        System.out.println(super.unvan); // personel unvani belirtilmemis
        System.out.println(this.sgkNo); // Calisan sgk no belirtilmedi bu classa bakar bulamaz parenta gider
        System.out.println(super.sgkNo); // Calisan sgk no belirtilmedi direkt parentta arar
        this.standartMaas(); // bu classda 10b
        this.fazlaMesai(3); // parente bakar sebebi extends keyword. 600
        super.fazlaMesai(4); // direk parent classa bakar. 800
        this.ozelSigorta(); // aylik 300 tl
        super.ozelSigorta(); // direk parent classa gider, bulamaz grandp gider
        

    }
}
