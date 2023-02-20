package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Company company = new Company();
        Scanner scanner = new Scanner(System.in);
        int optionToSelect = 4;
        int numberOfEmployeesToCreate = 5;

        System.out.println("\nEnter data of " + numberOfEmployeesToCreate + " employees.");
        for (int i = 0; i < numberOfEmployeesToCreate; i++) {
            addNewEmployee(company);
        }

        do {
            try {
                System.out.println("""
                        Select option to proceed
                        1.Print sum of all employees salary
                        2.Display all employees data
                        3.Add new employee
                        4.End program""");

                optionToSelect = scanner.nextInt();
                switch (optionToSelect) {
                    case 1 -> company.getSumOfEmployeesSalaries();
                    case 2 -> company.getAllEmployeeAccounts();
                    case 3 -> addNewEmployee(company);
                    case 4 -> System.out.println("Closing the system...");
                    default -> System.out.println("Wrong option was chosen. Please try again\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input type - you cannot enter different type than integer. Please try again.\n");
            }
            scanner.nextLine();
        } while (optionToSelect != 4);
    }

    static void addNewEmployee(Company company) {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();
        boolean isFirstNameValid;
        boolean isLastNameValid;
        boolean isSalaryValid;

        do {
            System.out.print("Enter employee name: ");
            String firstName = scanner.nextLine();
            isFirstNameValid = employee.setFirstName(firstName);
        } while (!isFirstNameValid);

        do {
            System.out.print("Enter employee last name: ");
            String lastName = scanner.nextLine();
            isLastNameValid = employee.setLastName(lastName);
        } while (!isLastNameValid);

        do {
            System.out.print("Enter employee salary: ");
            double salary = scanner.nextDouble();
            isSalaryValid = employee.setSalary(salary);
        } while (!isSalaryValid);

        company.addEmployee(employee);
        System.out.println("");
    }
}