package common;


import testdataobjects.EmployeeProfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class CredentialsCSVReader {

    public static HashMap<String, EmployeeProfile> readAndLoadCSVData(){

        String csvFile = "src/test/resources/data/employee_login.csv";
        String line = "";
        String cvsSplitBy = ",";
        HashMap<String, EmployeeProfile> returnList = new  HashMap<String, EmployeeProfile>();
        EmployeeProfile employeeProfile;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {
                employeeProfile = new EmployeeProfile();

                // use comma as separator
                String[] record = line.split(cvsSplitBy);
                employeeProfile.setEmpno(record[0]);
                employeeProfile.setUsername(record[1]);
                //employeeProfile.setPassword(record[2]);
                employeeProfile.setLastName(record[3]);
                employeeProfile.setFirstName(record[4]);
                employeeProfile.setPosition(record[5]);
                returnList.put(record[5], employeeProfile);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("End reading csv file: " + returnList.size());

        return returnList;

    }

    public static ArrayList<String> readAndLoadCSVDirectReportData(){

        String csvFile = "src/test/resources/data/directReport.csv";
        String line = "";
        String cvsSplitBy = ",";
        ArrayList<String> returnList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                String[] record = line.split(cvsSplitBy);
                for(String rec :record){
                    returnList.add(rec);
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("End reading csv file: " + returnList.size());

        return returnList;

    }

}
