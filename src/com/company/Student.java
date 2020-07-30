package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class Student {
    private String name;
    private String patronymic;
    private String lastName;
    private boolean gender;
    private int course;
    private String cafedrial;
    private LocalDate birthday;


    public Student(String ivan, String ivanich, String ivanov, boolean gender, String s, String engenering) {
    }

    public Student(String name, String patronymic, String lastName, boolean gender, int course, String cafedrial) {
        this.name = name;
        this.patronymic = patronymic;
        this.lastName = lastName;
        this.gender = gender;
        this.course = course;
        this.cafedrial = cafedrial;
    }

    public Student(String name, String patronymic, String lastName, boolean gender, int course, String cafedrial, LocalDate birthday) {
        this.name = name;
        this.patronymic = patronymic;
        this.lastName = lastName;
        this.gender = gender;
        this.course = course;
        this.cafedrial = cafedrial;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getCourse() {
        return course;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getCafedrial() {
        return cafedrial;
    }

    public void setCafedrial(String cafedrial) {
        this.cafedrial = cafedrial;
    }
    public boolean isAdult(){
        long hisYears = ChronoUnit.YEARS.between(this.getBirthday(),LocalDate.now());
        System.out.println("His Years "+ hisYears+ "" );
        if (hisYears >= 18) {
            return true;
        } else {
            return false;
        }



    }

    @Override
    public String toString() {
        String buffer = "";
        if (gender == true) {
            buffer = "Male";
        } else {
            buffer = "Female";
        }
        String buffer2 = "";
        if (isAdult() == true) {
            buffer2 = "Повнолітній";
        } else {
            buffer2 = "Шмаркатий";
        }

        return "Student{" +
                "name=" + name +
                ", patronymic=" + patronymic +
                ", lastName" + lastName +
                ", gender=" + buffer +
                ", course=" + course +
                ", cafedrial=" + cafedrial +
                ", Birthday=" + birthday +
                ", Вік -" + buffer2 +
                '}';
    }
    }




