package day15_doWhileLoop_scope;

public class C05_LocalVariable {
    public static void main(String[] args) {

        /*
            1- bir method iceersinde olusturulan variable'in scope'u o methoddur
                baska bir method'dan KULLANILAMAZ.
                bu variable'lara local variable denilir
             2- her ne kadar bir method icinde olsalar da
                loop'larin da ayri bir scope'u vardir
                Loop icersinde olusturulan variable'lar
                Loop disinda KULLANILAMAZLAR
             3- Local variable'lari deger atamadan olusturabiliriz
                ancak deger atamadan KULLANAMAYIZ
         */

        String isim="Ali Can";
        int sayi;
        //System.out.println(sayi);

        //sayi++;

        for (int i = 0; i <10 ; i++) {
            int j =i+1;
        }
        //System.out.println(i);
        //System.out.println(j);
    }

    public  static  void baskaMethod(){
        // System.out.println(isim);
        int sayi=5;
    }

}
