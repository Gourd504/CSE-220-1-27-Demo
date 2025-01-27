package org.example;

public record StudentInfoRecord(
        String firstName,
        String lastName,
        int birthMonth,
        int birthDay,
        int birthYear,
        int studentID,
        String major,
        String address,
        String city,
        String state,
        int zipCode,
        String country
) {
}
