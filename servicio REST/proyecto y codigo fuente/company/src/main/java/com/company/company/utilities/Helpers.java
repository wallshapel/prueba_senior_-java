package com.company.company.utilities;

import java.time.LocalDate;
import java.time.Period;

public class Helpers {
    public static boolean isAdult(String birthdate) {
        LocalDate localDate1 = LocalDate.parse(birthdate);
        LocalDate now = LocalDate.now();
        Period period = Period.between(localDate1, now);
        return period.getYears() >= 18;
    }
    public static String timeBetweenDates(String date1) {
        LocalDate localDate1 = LocalDate.parse(date1);
        LocalDate now = LocalDate.now();
        Period period = Period.between(localDate1, now);
        return period.getYears() + " years, " + period.getMonths() + " months and " + period.getDays() + " days";
    }
}