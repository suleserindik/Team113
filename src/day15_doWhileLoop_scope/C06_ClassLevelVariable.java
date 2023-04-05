package day15_doWhileLoop_scope;

public class C06_ClassLevelVariable {

           /*
            Bir class icinde tum methodlarin erisebilecegi variable'lar istenirse
            Class Level'da (Class'in icinde ama method'larin disinda) olusturulmalidir

            1- Class Level'da olusturulan variable'larin scope'u tum class'lardir
            2- Class Level'da olusturulan variable'a deger atanmasa bile Java onlar icin DEFAULT DEGERLER atar
            3- Class Level'da olusturulan variable'lar static veya instance (static olmayan) olabilir
            4- Static olarak tanımlanan variable'lar tum method'larda direk kullanilabilir
            5- Method static ise icerisine static olmayan hic bir sey almaz

         */
    static int sayi=10;
    static  String isim;
    static  boolean bl;
    static  char chr;
    static  int in1;
    int in2;
    boolean bl2;


    public static void main(String[] args) {
        System.out.println(sayi); // 10
        System.out.println("String : "+isim); // non-primitive turler icin null
        System.out.println("boolean :"+bl); // false
        System.out.println("char : "+chr); // '' hiclik
        System.out.println("int : "+in1); // sayisal turler icin 0
       // System.out.println(bl2); // instance
        staticMethod();
        //staticOlmayanMethod();


    }

    public  static void staticMethod(){
        sayi++;
        System.out.println(sayi); // static
        System.out.println(chr); // static
       // System.out.println(in2); // instance
       // System.out.println(b12);  // instance

    }

    public void staticOlmayanMethod(){
        sayi--;
        System.out.println(sayi); // static
        System.out.println(bl); // static
        System.out.println(in2); // instance
        System.out.println(bl2); // instance



    }
}
