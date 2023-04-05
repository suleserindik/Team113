package day30_inheritance;

public class EChild extends DParentAccessModifier{
    static int sayiChildStatic;

    public static void main(String[] args) {
        // inheritance'da private class uyeleri inherit edilemez
        //

        EChild eChild= new EChild();
        System.out.println(eChild.sayiDefault);
        System.out.println(eChild.sayiProtected);
        System.out.println(eChild.sayiPublic);

        // icinde bulundugumuz class'daki static variable'lar
        // obje uzerinden otomatik gelmez
        // ama manuel yazdigimizda Java kabullenirdi
        System.out.println(eChild.sayiChildStatic);

        // ancak parent classdaki static variablelar
        // obje uzerinden kullanilamaz
        // System.out.println(eChild.sayiStaticPrivate);

        System.out.println(DParentAccessModifier.sayiStaticProtected);
        //bu kullanim icin inheritance'a ihtiyac yok
        // herhangi bir class'daki static variable'i
        // classIsmi.sataticVariableIsmi seklinde kullanabiliriz


    }
}
