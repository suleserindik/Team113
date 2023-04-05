package day30_inheritance;
public class HChild extends GParent{
    private int sayiChild;
    HChild(){
        System.out.println("Child class constructor'i calisti");
    }
    public static void main(String[] args) {

        HChild objChild = new HChild();

        System.out.println(objChild.sayiChild);
        System.out.println(objChild.sayiParent);
        System.out.println(objChild.sayiGrandParent);

        /*
            Child class'dan olusturdugumuz bir obje
            parent ve grandparent classlarindaki tum ozelliklere sahip olur

            bir obje olusturuldugunda
            ilk degerleri alabilmesi icin mutlaka bir construractor calismalidir
            construcator call bizim cok kullanidigimiz bir özellik degildir
            ancak inheritance tam olarak anlayabilmek icin constructor call konusunu bilmemiz lazim

            bu classdan obje olusturmak icin
            HChild() constructor'ini kullandik ama
            objemiz parent ve granparent'daki ozellikleride sahiplendi

            Peki bu nasil oldu ?

            Her ne kadar objeyi child class'dan olustursak da
            bu objenin parent ve grandparent class'larindaki ozellikleri alabilmesi icin
            o classlarin constructorlarida calismak zorundadir

            Java bu mecburi calismayi saglayabilmek icin cok ozel bir sistem gelistirmistir

            Bunun adi super() : consturctor call'dur


         */

    }
}
