package day14_methodOverLoding_whileLoop;

public class C04_MethodOverLoading {
    public static void main(String[] args) {
        /*
            Java OverLoading kurallari
            1- isim ve parametreleri ayni olan birden fazla method olusturulamaz
            2- data turleri farkli olan parametrelerin yerlerini degistirirsek
               java yeni bir method olarak kabul eder (int, double) (double,int)

            OverLodaing olan classlarda Java hangi methodun calistiralacagina su
            sekilde kara verir

            1- cagrilan isimde method var mı?
            2- method call'da kullanilan argumentes (yazılanlar) ile methodlardaki
               parametrelerin %100 uyumlu oldugu var mi ?
            3- argument ile parametre ayni olmasa bile
               verilen argumentleri kabul edecek parametre var mı ?
            4- Casting ile birden fazla methodu kullanabiliyorsa
               daha az casting ile calisacak methodu kullanir

         */

        topla(3,5); // 8

        topla(3.4,2.3); // 5.7

        // topla("ali", "veli");  CTE bu argumentleri kabul edebilecek parametre yok

        topla('a','b'); // iki int 195 (ASCİİ ye göre int gibi davranir)

        topla(3f, 4f); // iki double toplami 7.0

        topla(3f,4); // double ve int 7.0 (casting ederken java kendini en az yoran yontemi kabul eder)

    }



    public static void topla(int a , int b){
        System.out.println("İki tamsayinin toplamı : "+(a+b));
    }

    public  static void topla(double a, double b){
        System.out.println("Ikı double sayinin toplami : "+(a+b));
    }

    public static void topla(int sayi1, double sayi2){ // topla int double
        System.out.println("int ve double sayilarin toplami : "+(sayi1+sayi2));
    }

    public  static  void topla(double sayi1, int sayi2){ // topla double int
        System.out.println("double ve int sayilarin toplami : "+(sayi1+sayi2));

    }
}
