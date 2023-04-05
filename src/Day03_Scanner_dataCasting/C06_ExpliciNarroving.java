package Day03_Scanner_dataCasting;

public class C06_ExpliciNarroving {
    public static void main(String[] args) {

        // daha genis kapasiteye sahip bir data turundaki degeri, daha dar kapsamli bir
        //variable'a atamak istersek, Java bunu otomatik yapmaz

        int a=12;
        int c=567;

        byte b= (byte) a; // 12
        byte d= (byte) c; // 55

        // Java, data kaybi veya degisikligi ihtimaline karsi bizden sorumlulugu alip
        // cast yapmamizi ister

    }
}
