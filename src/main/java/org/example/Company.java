package org.example;

import java.util.ArrayList;

public class Company {
    ArrayList<Employee> employeeAccounts = new ArrayList<>();

    void addEmployee(Employee employee) {
        this.employeeAccounts.add(employee);
    }

    void getSumOfEmployeesSalaries() {
        double sum = 0;
        for (Employee employeeAccount : this.employeeAccounts) {
            sum += employeeAccount.salary;
        }
        System.out.println("Sum of all employees salary: " + sum + "\n");
    }

    void getAllEmployeeAccounts() {
        for (int i = 0; i < this.employeeAccounts.size(); i++) {
            System.out.println(this.employeeAccounts.get(i));
        }
        System.out.println("");
    }
}
