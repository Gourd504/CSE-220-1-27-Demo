package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setFirstName("John");
        studentInfo.setLastName("Doe");

        StudentInfoRecord student2 = new StudentInfoRecord(
                "Jane",
                "Doe",
                1,
                1,
                2000,
                22876,
                "Culinary",
                "123 Address Street",
                "London",
                "Ohio",
                88576,
                "France"

        );
        System.out.println(student2.firstName());
        System.out.println(student2.lastName());
    }
}