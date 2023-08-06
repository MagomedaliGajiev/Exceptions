package Seminar3.homework3.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class User {
    private String firstName;
    private String secondName;
    private String surname;
    private LocalDate dateOfBirth;
    private String phoneNumber;
    private Character gender;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getFateOfBirth() {
        return dateOfBirth;
    }

    public void setFateOfBirth(String data) throws IllegalArgumentException {
        try {
            LocalDate dateOfBirth = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            this.dateOfBirth = dateOfBirth;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Date of birth format is incorrect.");
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws IllegalCallerException {
        if (phoneNumber.matches("^((8|7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$")) {
            this.phoneNumber = phoneNumber;
        } else {
            throw new IllegalArgumentException("Phone number format is incorrect.");
        }
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) throws IllegalArgumentException {
        if (gender == 'm' || gender == 'f') {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Gender is incorrect.");
        }
    }

    @Override
    public String toString() {
        return secondName + " " + firstName + " " + surname + " " + dateOfBirth + " " + phoneNumber + " " + gender;
    }

}
