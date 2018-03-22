package pract5.task1.model;

public class CuratorsJornal {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String phoneNumber;
    private String address;

    public CuratorsJornal(String firstName, String lastName, String dateOfBirth, String phoneNumber, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }
}
