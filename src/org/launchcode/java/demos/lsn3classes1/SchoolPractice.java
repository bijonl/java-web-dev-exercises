package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
    Student bijon = new Student();
    bijon.setName("Bijon L");
    bijon.setStudentId(1);
    bijon.setNumberOfCredits(1);
    bijon.setGpa(4.0);

    Course math101 = new Course();
    math101.setName("arithmitic");
    math101.setClassSize(100);
    math101.setDaysOffered("Monday");
    math101.setDaysOffered("Tuesday");

    System.out.println(math101.getDaysOffered());
    }
}

