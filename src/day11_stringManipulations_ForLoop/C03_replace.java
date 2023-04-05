package day11_stringManipulations_ForLoop;

public class C03_replace {
    public static void main(String[] args) {

        String str = "Java candir";

        System.out.println(str.replace('J', 'H')); // Hva candir

        System.out.println(str.replace("a", "")); // Jv candir

        System.out.println(str.replace("Java","X")); // X candir

        System.out.println(str.replace("v", "yayaya")); // Jayayayaa candir

        str.replace("va","lala"); // yapilan degisiklik bu satir icindir
                                                  // yazdirilmadigi icin gormeyiz
                                                  // atama yapilmadigi icin de kalici olmaz

        // str'daki space'leri yok edin
        str= str.replace(" ","");

        System.out.println(str); // Javacandir

        System.out.println(str.replaceFirst("a","")); // Jvacandir

        System.out.println(str.replaceFirst("c","k")); // Javakandir



    }
}
