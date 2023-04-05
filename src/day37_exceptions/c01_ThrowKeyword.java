package day37_exceptions;

import java.util.Scanner;

public class c01_ThrowKeyword {

    /*
        Kodlari yazarken bazen muhtemel bir durumda
        bazi kodlarin ignore edilmesi istenebilir

        bu durumda kodlari IGNORE etme yontemi olarak
        isteyerek exception firlatip

        sonra da calismasini istedigimiz yerde
        catch ile yakalayip yolumuza devam edebiliriz

     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen aysinizi giriniz : ");
        int yas = scan.nextInt();
        try {
            if (yas<0){
                throw new IllegalArgumentException("Hatalı Parametre girişi yapıldı!");
            }else{
                System.out.println("Başarılı bir şekilde kayıt yapıldı.");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();

        }
    }
}
