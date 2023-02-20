package org.example;

class Employee {
    private String firstName;
    private String lastName;
    double salary;

    public String getFirstName() {
        return firstName;
    }

    public boolean setFirstName(String firstName) {
        if (firstName.isEmpty()) {
            return false;
        }
        this.firstName = firstName;
        return true;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean setLastName(String lastName) {
        if (lastName.isEmpty()) {
            return false;
        }
        this.lastName = lastName;
        return true;
    }

    public double getSalary() {
        return salary;
    }

    public boolean setSalary(double salary) {
        if (salary < 0) {
            return false;
        }
        this.salary = salary;
        return true;
    }

    @Override
    public String toString() {
        return "Salary for: " + firstName + " " + lastName + " is " + salary + "$";
    }

    public void getAllData() {
        System.out.print(this.toString());
    }
}