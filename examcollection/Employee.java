package examcollection;

import java.time.LocalDate;

public class Employee {
    private String name;
    private String phone;
    private String address;
    LocalDate dateOfBirth;
    private String department;
    private String location;
    private int seniority;
    private double basicSalary;

    public Employee() {
    }

    public Employee(String name, String phone, String address, LocalDate dateOfBirth, String department, String location, int seniority, double basicSalary) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.location = location;
        this.seniority = seniority;
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String toString() {
        return "{" +
                "Name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address=" + address + '\'' +
                ", date of birth=" + dateOfBirth + '\'' +
                ", phong ban=" + department + '\'' +
                ", vi tri=" + location + '\'' +
                ", tham nien=" + seniority + '\'' +
                ", muc luong co ban=" + basicSalary + '\'' + '\n' +
                '}';
    }
}
