package day10_stringManipulation;

public class C06_lastIndexOf {
    public static void main(String[] args) {

        String str = "Java bazen beyin yakar";

        System.out.println(str.indexOf("a")); // 1

        System.out.println(str.lastIndexOf("a")); // 20

        System.out.println(str.indexOf("a",2)); // 3

        System.out.println(str.lastIndexOf("a", 19)); // 18

        System.out.println(str.indexOf(str.indexOf("a",4))); // 6

        System.out.println(str.lastIndexOf("a",17)); // 6

        System.out.println(str.indexOf('e')); // 8

        System.out.println(str.lastIndexOf('e')); // 12

        System.out.println(str.lastIndexOf("Mustafa")); // -1

        // Verilen bir cumlede, istenen String icin
        // asagidaki cumlelerden uygun olani yazdirin
        // 1- aradiginiz kelime cumlede 1 kere kullanilmis
        // 2- aradiginiz kelime cumlede 1'den fazla kez kullanilmis
        // 3- aradiginiz kelime cumlede hic kullanilmamistir

        String cumle = "Yasasin java, iyi ki ogreniyorum";
        String kelime = "Yasasin";

        int ilkIndex = cumle.indexOf(kelime);
        int lastIndex = cumle.lastIndexOf(kelime);

        if (ilkIndex == (-1)){
            System.out.println("aradiginiz kelime cumlede hic kullanilmamistir");
        }else if (ilkIndex == lastIndex){
            System.out.println("aradiginiz kelime cumlede 1 kez kullanilmistir");
        }else{
            System.out.println("aradiginiz kelime cumlede 1'den fazla kez kullanilmistir");

        }



    }
}
