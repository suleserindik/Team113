package day14_methodOverLoding_whileLoop;

public class C03_MethodOverLoading {
    public static void main(String[] args) {

        /*
            Bir class da ayni isme sahip farkli
            islem yapan methodlar olabilir
            Java bu methodlardan hangisinin calisacagina
            parametlere gore karar verir

            Bir classda ismi ayni parametreleri farkli methodlar olmasina
            method Overloding denir.
         */

        String str= " Bu is olacak";

        System.out.println(str.replace("Bu is", "Java guzel")); // Java guzel olacak

        System.out.println(str.replace('u', 'e')); // Be is olacak


    }
}
