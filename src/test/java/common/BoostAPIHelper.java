package common;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.ArrayList;
import java.util.List;

public class BoostAPIHelper {
    static String empNumber;

    public BoostAPIHelper() {
        RestAssured.keyStore("src/test/resources/SSL_Cert.jks", "changeit");
        RestAssured.trustStore("src/test/resources/SSL_Cert.jks", "changeit");
    }

    public List<String> getUserDirectReportInfo(String wsendpoint, String apiKey, int EmpId) {
        List<String> listOfDirectReport = new ArrayList<String>();
        RestAssured.baseURI = wsendpoint;
        RequestSpecification request = RestAssured.given();
        request.header("x-api-key", apiKey);
        request.queryParam("employeeId", EmpId);
        Response response = request.get("/v1/api/employees/directreports");
        int statusCode = response.getStatusCode();
        if (statusCode == 200) {
            JsonPath jsonPathEvaluator = response.jsonPath();
            List<String> jsonResponse = response.jsonPath().getList("$");
            for (int i = 0; i < jsonResponse.size(); i++) {
                listOfDirectReport = jsonPathEvaluator.get("id");
            }
        }
        return listOfDirectReport;
    }


    public int getEmployeeIDOfLoggedInUser(String wsendpoint, String apiKey, String EmpNo) {
        int empId = 0;
        RestAssured.baseURI = wsendpoint;
        RequestSpecification request = RestAssured.given();
        request.header("x-api-key", apiKey);
        Response response = request.get("/v1/api/employees/employeeno/" + EmpNo);
        int statusCode = response.getStatusCode();
        if (statusCode == 200) {
            JsonPath jsonPathEvaluator = response.jsonPath();
            empId = jsonPathEvaluator.get("id");
        }
        return empId;
    }

    public void setEmpNumber(String EmpNo) {
        this.empNumber = EmpNo;
    }

    public String getEmpNumber() {
        return empNumber;
    }
}

