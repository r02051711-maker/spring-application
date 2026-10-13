package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        EmployeeService employeeService = context.getBean(EmployeeService.class);

        employeeService.addEmployee();
        System.out.println();

        employeeService.displayEmployee();
        System.out.println();

        double salary = employeeService.calculateSalary();
        System.out.println("Employee Salary: " + salary);

        context.close();
    }
}
