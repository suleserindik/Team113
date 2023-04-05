package day24_staticKeyword;

public class C02_passByValue {
    public static void main(String[] args) {

        double fiyat=200;

        /*
        int fiyat=500;
        String fiyat="Java pass by value kullanir";

        Java ayani method icerisinde ayni isimde birden fazla variable
        olusturulmasina izin vermez.

         */

        indirimYap10(fiyat);
        System.out.println("method call'dan sonra fiyat : "+fiyat);
        indirimYap25(fiyat);
        System.out.println("2. method call'dan sonra fiyat : "+fiyat);
        System.out.println("return yapilan methoddan donen fiyat "+indirimliFiyatGetir10(fiyat));
        System.out.println("3. method call'dan sonra fiyat : "+fiyat);

        // main methoddaki fiyati kalici olarak degistirmek istersek
        // main method icersinde atama yapmaliyiz

        fiyat=indirimliFiyatGetir10(fiyat);
        System.out.println("main method'da atama yapildiktan sonra fiyat : "+fiyat);

    }
    public static void indirimYap10(double fiyat){ // double fiyat = degeri methodun cagrildigi yerden

        fiyat=fiyat*0.9;
        System.out.println("%10 indirimli fiyat : "+fiyat);


    }

    public static void indirimYap25(double fiyat){

        fiyat=fiyat*0.75;
        System.out.println("%10 indirimli fiyat : "+fiyat);


    }
    public static double indirimliFiyatGetir10(double fiyat){
        fiyat=fiyat*0.9;
        System.out.println("%10 indirimli fiyat : "+fiyat);

        return fiyat;
    }

}
