package pract2.task2.model.entities;

import java.io.Serializable;

public class Patient implements Serializable{

    private String firstName;
    private String lastName;
    private String familyName;
    private String address;
    private String phoneNumber;
    private long medicalCardNumber;
    private String diagnosis;

    public Patient() {
    }

    public Patient(String firstName, String lastName, String familyName, String address,
                   String phone, long medicalCardNumber, String diagnosis) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.familyName = familyName;
        this.address = address;
        this.phoneNumber = phone;
        this.medicalCardNumber = medicalCardNumber;
        this.diagnosis = diagnosis;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String adress) {
        this.address = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getMedicalCardNumber() {
        return medicalCardNumber;
    }

    public void setMedicalCardNumber(long medicalCardNumber) {
        this.medicalCardNumber = medicalCardNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + familyName + " Адрес: " + address + " Телефон: " + phoneNumber +
                " Номер медкарты: " + medicalCardNumber + " Диагноз: " + diagnosis;
    }
}
