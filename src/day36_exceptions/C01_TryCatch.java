package day36_exceptions;

public class C01_TryCatch {
    public static void main(String[] args) {
        /*
            Kodlarimizi yazarken sorun olusma ihtimali
            gordugumuzde sorun cıkma potansiyeli olan kodlari
            try - catch - (finally) blok(lar)i le cevreleriz

         */
        int sayi1=20;
        int sayi2=0;


        try {
            System.out.println(sayi1/sayi2);

        } catch (ArithmeticException e) {

            // e.printStackTrace(); exceptionda gordugumuz tum hata aciklamalarini yazdirir
            // System.out.println("Bolen sayi 0 olamaz");
            // System.out.println(e.getMessage()); / by zero hatanin kaynagini gosterdi
            // System.out.println(e.getCause()); null
        }

        /*
            Bir try catch blogu 3 bolumden olusur

            1- try blogu : 15-18(haric)
            exception olusturma potansiyeli olan kodlari yaziyoruz

            2- catch (ArithmeticException e)
            catch statement :
            ArithmeticException : olusma ihtimali olan exception
            e : karsilastigi exception'i kaydedecegimiz obje

            3- catch blogu : 18(haric)-21 arasi
            ongorulen exception gerceklestiginde
            calismasisni istedigimiz kodlar
         */
    }
}
