package EmployeeSystem;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // To Clear the Output Screen
        System.out.println("\033[H\033[2J");

        Scanner scanner = new Scanner(System.in);
        Employee_Show epv = new Employee_Show();

        int i = 0;

        // Calling Mainmenu Class Function

        MainMenu obj1 = new MainMenu();
        obj1.menu();

        //Initialising loop for Menu Choices

        while (i < 6){
            System.out.print("\nPlease enter Choice: ");
            i = Integer.parseInt(scanner.nextLine());

            // Switch Case Statements
            switch ((i)){
                case 1:{
                    // creating class's object and calling function using that object
                    Employee_Add ep = new Employee_Add();
                    ep.createFile();

                    System.out.print("\033[H\033[2J");
                    obj1.menu();
                    break;
                } case 2:{
                    System.out.print("\nPlease Enter Employee's ID: ");
                    String s = scanner.nextLine();
                    try{
                        epv.viewFile(s);
                    }catch(Exception e){
                        System.out.println(e);
                }
                    System.out.print("\nPres Enter to continue...");
                    scanner.nextLine();
                    System.out.print("\033[H\033[2J");
                    obj1.menu();
                    break;
            }
                case 3:{
                    System.out.print("\nPlease Enter Employee's ID: ");
                    String s = scanner.nextLine();
                    Employee_Remove epr = new Employee_Remove();
                    epr.removeFile(s);

                    System.out.println("\nPress Enter to Continue....");
                    scanner.nextLine();
                    System.out.println("\033[H\033[2J");
                    obj1.menu();
                    break;
                } case 4:{
                    System.out.print("\nPlease Enter Employee's ID: ");
                    String I = scanner.nextLine();
                    try{
                        epv.viewFile(I);
                    }catch(Exception e){
                        System.out.println(e);
                    }
                    Employee_Update epu = new Employee_Update();
                    System.out.print("Please Enter the Detail you Want to Update: ");
                    System.out.println("\nTo Change the Name,Press Enter and Update Name");
                    String s = scanner.nextLine();
                    System.out.print("Please Enter Updated Info: ");
                    String n = scanner.nextLine();
                    try{
                        epu.updateFile(I,s,n);
                        System.out.print("\nPress enter to Continue...");
                        scanner.nextLine();
                        System.out.print("\033[H\033[2J");
                        obj1.menu();
                        break;
                    }catch(IOException e){
                        System.out.println(e);
                    }
                }
                case 5:{
                    CodeExit obj =new CodeExit();
                    obj.out();
                }
        }


    }
    }
}