package EmployeeSystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Employee_Update {
    public void updateFile(String s, String o, String n) throws IOException{
        File file = new File("file" + s + ".txt");
        Scanner scanner = new Scanner(file);
        String fileContext = "";

        while (scanner.hasNextLine()){
            fileContext = fileContext + "\n" + scanner.nextLine();
        }
        FileWriter myWriter = new FileWriter("file" + s + ".txt");
        fileContext = fileContext.replaceAll(o,n);
        myWriter.write(fileContext);
        myWriter.close();
    }
}
