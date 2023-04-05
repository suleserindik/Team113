package day34_abstractClasses;

public abstract class AHayvan {

    /*
        Bir classi abstract class yapmak icin deklarasyona
        abstract keywordunu yazmak yeterlidir

        Abstract classlar class olduklari icin constructor'lari vardir
        ama abstract classlardan obje olusturulamaz

        Abstract classlarda bugune kadar kulladigimiz yapida
        method'lar olusturabiliriz ancak bunlar child classlar tarafindan
        uyarlanmak (override) zorunda olmaz

        Child classlari uyarlamaya mecbur etmek istedigimiz methodlari da
        abstract yapmaliyiz

        bir method'u abstract yapmak icin
        declaration'a abstract yazmamiz yeterlidir
     */
    public abstract void hareket();
    public abstract void solunum();
    public abstract void beslenme();
    public abstract void cogalma();
    public abstract void omur();

}
