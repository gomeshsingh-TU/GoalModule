package common;

import pageobjects.LoginPage;
import testdataobjects.EmployeeProfile;

import java.util.HashMap;

public   class TestClass {
   static LoginPage loginPage;
   static  EmployeeProfile omuser;
   static HashMap<String, EmployeeProfile> employeeList;
    public static void main(String ar[]){

        int[] a = {1,2,3,4,5};
        for ( int directReport : a){
            if (directReport == 4){
                break;
            }
            else{
                System.out.println("Row Number is >>>>>>>>>>>>>>>>"+a);

            }
        }

//        System.out.println(omuser.getFirstName());
    }
}
