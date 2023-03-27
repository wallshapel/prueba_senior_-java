package com.company.company.utilities;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Helpers {
    public static boolean validateDateFormat(String stringDate) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date;
        try {
            date = format.parse(stringDate);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public static Date dateToString(String dateString) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.parse(dateString);
    }
    public static boolean isAdult(String birthdate) throws ParseException {
        LocalDate localDate1 = LocalDate.parse(birthdate);
        LocalDate now = LocalDate.now();
        Period period = Period.between(localDate1, now);
        return period.getYears() >= 18;
    }
    public static String timeBetweenDates(String date1) throws ParseException {
        LocalDate localDate1 = LocalDate.parse(date1);
        LocalDate now = LocalDate.now();
        Period period = Period.between(localDate1, now);
        return period.getYears() + " years, " + period.getMonths() + " months and " + period.getDays() + " days";
    }
}