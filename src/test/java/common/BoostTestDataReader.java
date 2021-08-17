package common;

import testdataobjects.TestData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class BoostTestDataReader {

        public static HashMap<String, TestData> readAndLoadBoostData() {

            String csvFile = "src/test/resources/data/Boost_Test_Data.csv";
            String line = "";
            String cvsSplitBy = ",";
            HashMap<String, TestData> returnList = new HashMap<String, TestData>();
            TestData testData;

            try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

                while ((line = br.readLine()) != null) {
                    testData = new TestData();

                    // use comma as separator
                    String[] record = line.split(cvsSplitBy);
                    testData.setEmpno(record[0]);
                    testData.setUsername(record[1]);
                    //employeeProfile.setPassword(record[2]);
                    testData.setLastName(record[3]);
                    testData.setFirstName(record[4]);
                    testData.setPosition(record[5]);
                    returnList.put(record[5], testData);

                }

            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("End reading csv file: " + returnList.size());

            return returnList;
        }

}
