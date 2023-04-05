package day31_inheritance;

public class CToyota extends BAraba{

    protected  String str2="Toyota";

    protected CToyota(){
        super("Java");
        System.out.println("Parametresiz toyota calisti");
    }
    protected CToyota(int sayi){
        System.out.println("int parametreli toyota calisti");
    }

    protected CToyota(String s){
        System.out.println("String parametre calisti");
    }

}
