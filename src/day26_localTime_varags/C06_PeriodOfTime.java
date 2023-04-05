package day26_localTime_varags;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class C06_PeriodOfTime {
    public static void main(String[] args) {

        LocalDate dogumTarihi= LocalDate.of(1992,5,14);
        LocalDate bugun = LocalDate.now();

        System.out.println(Period.between(dogumTarihi, bugun)); // P30Y9M23D

        System.out.println("yas : "+Period.between(dogumTarihi,bugun).getYears()); // yas : 30
        System.out.println("yas : "+Period.between(dogumTarihi,bugun).getDays()); // 23



        }

    }

