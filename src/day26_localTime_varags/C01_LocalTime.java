package day26_localTime_varags;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime saat1= LocalTime.of(14,15);
        System.out.println(saat1);

        LocalTime saat=LocalTime.now();
        System.out.println(saat); // 20:52:57.594769600

        // LocalTime objesi olan saat variable'i canli bir saat degildir.
        // olusturuldugu andaki LocalTime'i sistemden alip kaydettigimiz sabit bir degerdir
        // kodun ilerleyen kisminda ne kadar sure gectigini gormek icin
        // saati yeniden almamiz gerekirse yeni bir LocalTime objesi daha olusturmaliyiz

        System.out.println(saat.getHour()); // 18
        // get method'lari LocalTime objesinin saat dakika saniye ve nano degelerini bize getirir.

        System.out.println(saat.plusHours(2).plusMinutes(10)); // 23:08:50.185176700

        System.out.println(saat.minusMinutes(10).minusSeconds(10)); //20:49:34.014280400

        System.out.println(saat.withSecond(10).withNano(20)); // 21:00


        System.out.println(saat.compareTo(saat1)); // ayni ise 0 doner

        System.out.println(saat.isAfter(saat1)); // true

        System.out.println(saat.isBefore(saat1)); // false

        System.out.println(saat.toSecondOfDay());// 76281
    }
}
