package com.mani.practice;

import java.time.*;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class CC
{
    public static void main(String[] args)
    {
        YearMonth  yearMonth = YearMonth.now();
        yearMonth.isLeapYear();
        System.out.println(yearMonth);
        System.out.println(yearMonth.isAfter(YearMonth.of(2018,3)));


        System.out.println("is leap year ->" + Year.of(yearMonth.getYear()).isLeap());

      String r = DateTimeFormatterBuilder.
                getLocalizedDateTimePattern(FormatStyle.SHORT,FormatStyle.SHORT,
                        Chronology.ofLocale(Locale.getDefault()),Locale.getDefault());


        //System.out.printf("Now is %s",DateTimeFormatter.ofPattern(r),Instant.now());
        System.out.println(LocalDate.now() + " " + LocalTime.now());
        System.out.println(Instant.now());


        System.out.println(Instant.ofEpochSecond(0L).until(Instant.now(),
                ChronoUnit.SECONDS));


        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1976, Month.JULY, 13);

        Period p = Period.between(birthday, today);
        long p2 = ChronoUnit.DAYS.between(birthday, today);

        System.out.println("You are " + p.getYears() + " years, " + p.getMonths() +
                " months, and " + p.getDays() +
                " days old. (" + p2 + " days total)");


        LocalDate date = LocalDate.now();

        System.out.println("Previous Friday " +date.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)) );

        //int[] a = new int[-2];

        Double d = Double.valueOf("120D")  ;
        System.out.println(d);

        System.out.println(Double.valueOf("100.1D"));

        StringBuilder b= new StringBuilder("swf");

        

    }


}
