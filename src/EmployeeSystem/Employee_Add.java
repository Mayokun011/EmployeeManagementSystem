package EmployeeSystem;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Employee_Add {
    public void createFile() {
        Scanner scanner = new Scanner(System.in);

        EmployeeDetail emp = new EmployeeDetail();
        emp.getInfo();
        try {

            File f1 = new File("file" + emp.employee_id + ".txt");
            if (f1.createNewFile()) {
                FileWriter myWriter = new FileWriter("file" + emp.employee_id + ".txt");
                myWriter.write("Employee ID:" + emp.employee_id + "\n" + "Employee Name   :" + emp.name + "\n" +
                        "Lastname   :" + emp.lastName + "\n" + "Employee Contact   :" + emp.employee_contact +
                        "\n" + "Email Information   :" + emp.email + "\n" + "Employee Position :   " + emp.position +
                        "\n" + "Employee Salary   :" + emp.employee_salary);
                myWriter.close();
            } else {
                System.out.println("\nEmployee Already Exits");
                System.out.print("\nPress Enter to Continue...");
                scanner.nextLine();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}