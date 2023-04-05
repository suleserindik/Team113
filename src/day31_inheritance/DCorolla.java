package day31_inheritance;

public class DCorolla extends CToyota{

    String str3="Corolla";

    DCorolla(){

        System.out.println("Parametresiz corolla calisti");
    }
    DCorolla(int sayi){
        this();
        System.out.println("int Parametreli corolla calisti");
    }

    public static void main(String[] args) {

        DCorolla obj1=new DCorolla(5);
    }
}

/*
    Biz gorunur bir constructor olusturdugumuzda
    Java'nin default constructoru silmesine benzer olarak

    Extends keywrd kullanilmis bir class'daki herhangi bir
    constructor'in ilk satirinda gozle gorunur bir constructor call
    yazılmıssa Java default olarak koydugu super() constructor call'u siler

    Bir constructor'in icinde sadece bir tane constructor call
    olabilir oda ilk satirda yer alir

    Eger this(parametreler) veya super(parametreler) ile
    constructor call yaptigimizda
    yazdigimiz argument ile uyumlu parametreye sahip bir
    costructor yoksa Java CTE verir.
 */