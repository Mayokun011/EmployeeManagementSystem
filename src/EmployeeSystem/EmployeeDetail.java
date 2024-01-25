package EmployeeSystem;

import java.util.Scanner;

public class EmployeeDetail {
    String name;
    String lastName;
    String email;
    String position;
    String employee_id;
    String employee_salary;
    String employee_contact;

    public void getInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee's Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Employee's Lastname: ");
        lastName = scanner.nextLine();
        System.out.print("Enter Employee's ID: ");
        employee_id = scanner.nextLine();
        System.out.print("Enter Employee's Email ID: ");
        email = scanner.nextLine();
        System.out.print("Enter Employee's Position: ");
        position = scanner.nextLine();
        System.out.print("Enter Employee's Contact Info: ");
        employee_contact = scanner.nextLine();
        System.out.print("Enter Employee's Salary: ");
        employee_salary = scanner.nextLine();
    }

}
