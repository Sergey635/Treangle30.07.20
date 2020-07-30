package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        treangle triangle = new treangle(3,4,6);
        System.out.println(triangle.getPerimetr());
        System.out.println(triangle.getArea());
        System.out.println(triangle.toString());
        treangle triangle2 = new treangle(3,4,Math.PI/2);
        System.out.println(triangle2.toString());

        Student studentIvan = new Student("Ivan","Ivanich","Ivanov",
                false,3,"Engenering",LocalDate.of(1986,5,12));
        System.out.println(studentIvan.toString());

        Student studentOleg = new Student("Oleg","Ivanovich","Ivanov",
                true,2,"Finance", LocalDate.of(2008, Month.MAY,2));
        System.out.println(studentOleg.toString());
        System.out.println("-------------------------------------------------------------------------------");
        LocalDate may1st = LocalDate.of(2020,Month.MAY,1);
        System.out.println(may1st.getDayOfWeek());
        System.out.println(may1st.getDayOfYear());
        LocalDate newYear = LocalDate.of(2020,Month.JANUARY,1);
        LocalDate developerDay = newYear.plusDays(255);
        System.out.println(developerDay.getDayOfWeek());
        System.out.println(LocalDate.now());

        System.out.println(ChronoUnit.DAYS.between(developerDay, LocalDate.now()));

        LocalDate myBirthday = LocalDate.of(1995,Month.OCTOBER,21);
        long myYears = ChronoUnit.YEARS.between(myBirthday,LocalDate.now());
        System.out.println(myYears);

        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);

        LocalDateTime time2 = LocalDateTime.of(2020,
                Month.FEBRUARY,1,12,10,2);
        System.out.println(time2);


    }
}

//створити клас студент з 25 полями
