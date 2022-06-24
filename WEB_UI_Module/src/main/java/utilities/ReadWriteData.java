package utilities;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class ReadWriteData {
    private String str = "";

    /*public String getStr() {
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
    }*/

    static File file;
    public void writeData(Properties p){

        file = new File(".//config.properties");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            p.store(fos,"Properties");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readData(Properties p){

        file = new File(".//config.properties");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            p.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String proposalValue = p.getProperty("proposal");
        try {
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return proposalValue;
    }

    public void writeDataAM(Properties p){

        file = new File(".//configAM.properties");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            p.store(fos,"Properties");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String readDataAM(Properties p){

        file = new File(".//configAM.properties");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            p.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String proposalValueAM = p.getProperty("proposalAM");
        try {
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return proposalValueAM;
    }
}
