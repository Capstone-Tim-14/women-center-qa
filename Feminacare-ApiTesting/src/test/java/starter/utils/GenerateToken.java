package starter.utils;

import io.restassured.response.ResponseBody;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

public class GenerateToken {
    public static String generateTokenAdmin() {
        JSONObject userData = FileUtils.getUserAdmin();
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", userData.get("email"));
        requestBody.put("password", userData.get("password"));

        ResponseBody loginResponse = SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post("api-ferminacare.tech/api/v1/admin/auth")
                .body();

        JSONObject loginResponseBody = new JSONObject(loginResponse.asString());

        return loginResponseBody.get("data").toString();
    }
    public static String generateTokenKonselor() {
        JSONObject userData = FileUtils.getUserAdmin();
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", userData.get("email"));
        requestBody.put("password", userData.get("password"));

        ResponseBody loginResponse = SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post("api-ferminacare.tech/api/v1/auth")
                .body();

        JSONObject loginResponseBody = new JSONObject(loginResponse.asString());

        return loginResponseBody.get("data").toString();
    }
}