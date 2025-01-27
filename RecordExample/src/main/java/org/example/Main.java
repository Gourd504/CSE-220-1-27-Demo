package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setFirstName("John");
        studentInfo.setLastName("Doe");

        StudentInfoRecord student2 = new StudentInfoRecord(
                firstName: "Jane",
                lastName: "Doe",
                birthMonth: 1,
                birthDay: 1,
                birthYear: 2000,
                studentID: 22876,
                major: "Culinary",
                address: "123 Address Street",
                city: "London",
                state: "Ohio",
                zipCode: 88576,
                country: "France"

        );
        System.out.println(student2.firstName());
        System.out.println(student2.lastName());
    }
}