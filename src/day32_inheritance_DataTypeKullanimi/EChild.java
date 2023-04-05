package day32_inheritance_DataTypeKullanimi;

public class EChild extends DParent {

    String str="Child";

    void method1(){
        System.out.println("Child method 1");

    }

    /*
        Override  : gecerssiz kilma
        Overridden  : gecersiz kilinan
     */

    public static void main(String[] args) {

        EChild child= new EChild();
        child.method1(); // Child method 1
        System.out.println(child.str); // Child

        DParent childP= new EChild();

        System.out.println(childP.str); // Parent

        childP.method1(); // Child method 1 (methodla belirlenen ozellik dinamiktir, en gunceli verir)
    }
}
