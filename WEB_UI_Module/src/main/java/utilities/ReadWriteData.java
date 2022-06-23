package utilities;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class ReadWriteData {
    private String str = "";

    public String getStr() {
        try {
            File myObj = new File(".//config.properties");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                this.str = myReader.nextLine();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return this.str;
    }

    public void setStr(String str) {
        try {
            FileWriter myWriter = new FileWriter(".//config.properties");
            myWriter.write("");
            myWriter.write(str);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
