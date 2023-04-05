package day36_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckedExceptions {

    public static void main(String[] args) throws FileNotFoundException {

        /*
            Checked exceptions kod yazilir yazilmaz daha run etmeden,
            Java'nin riskli kodlari tanimlayip
            calistirmadan once bana bir yol gostermelisin dedigi
            exception turleridir

            Checked exceptions genelde dosya okuma ve yazma IO islemlerinde olusur

            IO exception olusma ihtimaline karsi
            kodu yazar yazmaz Java altini kirmizi cizer

            Checked exception icin kodun altini kirmizi cizdiginden
            kodunuzun calisir hale gelmesi icin kirmizi cizgiyi kaldirmamiz lazim

            1- try-catch blogu kullanarak
               exception handle edilebilir
               ve Javaya exception olustugunda ne yapmasini istedigimiz gosterilebilir

            2- exception'i handle etmek istemiyorsak
               sadece kodumuzun calismasini istiyorsak
               method deklerasyonuna bu exception ihtimalini yazarak
               kodu calisir hale getirebiliriz

               method signature'na throws keyword'u ile beklenen exception
               turunu yazarsak kod calisir duruma gelir
               ancak; exception olusursa java'ya cozum sunulmadigindan kodun calismasi durur
         */

        String dosyaYolu ="src/day36_exceptions/text.txt";

        FileInputStream fis= new FileInputStream(dosyaYolu);

    }
}
