package com.example.demo.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositePattern {
    public static void main(String[] args) {
        Employee developer1 = new Developer("Aman", "Mehrotra", "1");
        Employee developer2 = new Developer("Dev", "XXX", "2");
        CompanyDirectory developerOrg = new CompanyDirectory();
        developerOrg.addEmployee(developer1);
        developerOrg.addEmployee(developer2);
        System.out.println("Employee Directory : ");
        developerOrg.showEmployeeDetails();

        Employee manager1 = new Manager("XXX", "YYY", "3");
        Employee manager2 = new Manager("ZZZ", "KKK", "4");
        CompanyDirectory managerOrg = new CompanyDirectory();
        managerOrg.addEmployee(manager1);
        managerOrg.addEmployee(manager2);
        System.out.println("Manager Directory : ");
        managerOrg.showEmployeeDetails();

        CompanyDirectory companyOrg = new CompanyDirectory();
        companyOrg.addEmployee(developerOrg);
        companyOrg.addEmployee(managerOrg);
        System.out.println("Company organization : ");
        companyOrg.showEmployeeDetails();

    }
}

interface Employee {
    public void showEmployeeDetails();
}

class Developer implements Employee {

    private String firstName;
    private String lastName;
    private String empId;

    public Developer(String firstName, String lastName, String empId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.empId = empId;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Employee details : " + empId + " " + firstName + " " + lastName + " ");
    }
}

class Manager implements Employee {

    private String firstName;
    private String lastName;
    private String empId;

    public Manager(String firstName, String lastName, String empId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.empId = empId;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Employee details : " + empId + " " + firstName + " " + lastName + " ");
    }
}

class CompanyDirectory implements Employee {

    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public void showEmployeeDetails() {
        for(Employee employee: employees) {
            employee.showEmployeeDetails();
        }
    }
}
