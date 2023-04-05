package day22_constructors;

public class C02_Hemsire {

    /*
          ornegin bir hastane programinda,
          hastanede calisacak hemsirelerin hangi bilgilerini tutmak istiyorsak,
          hangi methodlari hemsireler icin kullanmak istiyorsak
          bir hemsire classi olusturup tum bu ozellikleri(variable ve methodlari) o class'da olustururuz.

          programda ne zaman bir hemsireye ihtiyac olsa
          hemsire class'indan obje olustururuz
          boylece otomatik olarak tum ozelliklere sahip olur

          Eger biz istedigimiz parametrelere sahip bir constructor olustrumazsak
          Java class'dan obje olustrulabilmesi icin class'a default bir constructor koyar

          Default constructor gorunez ,
          parametresi yokktur, cons. body'si bostur

     orn:     C02_Hemsire(){

              }
          Bir de istedigimiz parametrelere sahip,
          istedigimiz kadar cons. olusturabiliriz

          COK ÖNEMLİ : Eger biz bir cons. olustrursak
                       yani classda gozle gorunen bir cons. varsa
                       Java default cons. siler.
                       Bizim olusturdugumuz hicbir cons.a default cons. DENEMEZ.


     */

    String isim="Isim atanmamis";
    String soyIsim="Soyisim atanmamis";
    String telNo;
    String adres;
    int yas;
    boolean izindeMi;
    char evliMi;
    int ekMesaiUcreti=20;
    public int mesaiUcretiHesapla(int mesaiSaati){

        return mesaiSaati*ekMesaiUcreti;




    }





}
