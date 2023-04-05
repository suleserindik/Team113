package day12_forLoops;

public class C10_NestedForLoop {

    public static void main(String[] args) {

        /*
            verilen satir sayisina gore asagidai
            sekli olusturan kod yaziniz

            *
            * *
            * * *
            * * * *

         */

        int satir=6;

        for (int i = 1; i <=6 ; i++) { // satirlar Outer Loop / dis dongu
            for (int j = 1; j <=i ; j++) {  // sutunlar inner loop / ic dongu
                System.out.print("* ");
            }
            System.out.println("");
        }





    }
}
