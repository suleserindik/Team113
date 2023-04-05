package day25_passByValue_ImmuableClasses;

import java.time.LocalTime;

public class C05_Date_Time {
    public static void main(String[] args) {

        LocalTime saat= LocalTime.now();
        System.out.println(saat); // 20:02:28.460211800

        System.out.println(saat.getNano()); // 376928700

        // bir loop ile 1den 10000'e kadar olan sayilari toplayin
        // ve bu islemin kac nanosaniye surdugunu bulun

        int toplam=0;

        int basSurasiNano= saat.getNano();

        for (int i = 1; i <=10000 ; i++) {
            toplam+=i;
        }

        LocalTime saatSon= LocalTime.now();
        int bitSuresiNano= saatSon.getNano();

        System.out.println("islem suresi : "+(bitSuresiNano-basSurasiNano)); // 997300

    }
}
