package day23_constructors;

public class C02_ConsturactorCall {

    /*
        Java da ihtiyac olursa bir consturactor icinden baska consturactor cagrilabilir
        this(ilgili parameteler) yazarak istedigimiz consturactoru cagrabiliriz

        Constrator call icin iki kural vardir
        1- Consturactor Call icinde bulundugu consturactor'in ilk satirinda olmalidir
        2-
     */

    int sayi;
    String str;

    public C02_ConsturactorCall() {
        System.out.println("Parametresiz consturactor calisti");
    }
    public C02_ConsturactorCall(int sayi) {
        System.out.println("int Parametreli consturactor calisti");
        this.sayi = sayi;
    }
    public C02_ConsturactorCall(String str) {
        this(5);
        System.out.println("String Parametreli consturactor calisti");
        this.str = str;
    }
    public C02_ConsturactorCall(int sayi, String str) {
        //C02_ConsturactorCall(); boyle yazildiginda method call olarak algilar
        this(); // Java syntax olarak consturactor call icin bunu belirlemistir
        this.sayi = sayi;
        this.str = "Java";
        System.out.println("iki Parametreli consturactor calisti");
    }

    public static void main(String[] args) {
        C02_ConsturactorCall obj3=new C02_ConsturactorCall(7,"Selcuk");
        System.out.println(obj3.sayi); // 7
        System.out.println(obj3.str); // Java

        C02_ConsturactorCall obj2=new C02_ConsturactorCall("Java");
        System.out.println(obj2.sayi); // 5
        System.out.println(obj2.str); // Java
        C02_ConsturactorCall obj1=new C02_ConsturactorCall(); // Parametresiz consturactor calisti



    }

}
