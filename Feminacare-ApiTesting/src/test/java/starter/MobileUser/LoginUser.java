package starter.MobileUser;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginUser {
    private static String url = "https://api-ferminacare.tech/api/v1/admin";
    @Step("saya menetapkan API endpoint untuk login user")
    public String menetapkanApiEndpointLoginUser(){
        return url + "/auth";
    }
    @Step("saya mengirimkan request untuk melakukan login dengan memasukan email dan password valid")
    public void mengirimkanRequestDenganMemasukanEmailDanPasswordValid(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "adminA@ferminacare.com");
        requestBody.put("password", "admin123");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(menetapkanApiEndpointLoginUser());
    }
    @Step("saya mendapatkan data dan token")
    public void mendapatkanDataDanToken(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.LOGIN);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
    @Step("saya mengirimkan request untuk melakukan login dengan memasukan email dan password invalid")
    public void mengirimkanRequestDenganMemasukanEmailDanPasswordInvalid(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "BukanadminA@ferminacare.com");
        requestBody.put("password", "Bukanadmin123");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(menetapkanApiEndpointLoginUser());
    }
    @Step("saya mendapatkan pesan error data tidak valid")
    public void mendapatkanPesanErrorDataTidakValid(){
        restAssuredThat(response->response.body("code",equalTo(401)));
        restAssuredThat(response->response.body("message",equalTo("Error uncorrect credential")));
    }
    @Step("saya mengirimkan request untuk melakukan login dengan memasukan email valid namun password invalid")
    public void mengirimkanRequestDenganMemasukanEmailValidNamunPasswordInvalid(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "adminA@ferminacare.com");
        requestBody.put("password", "bukanadmin123");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(menetapkanApiEndpointLoginUser());
    }
    @Step("saya mengirimkan request untuk melakukan login dengan memasukan email namun mengosongkan password")
    public void mengirimkanRequestDenganMemasukanEmailNamunMengosongkanPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "adminA@ferminacare.com");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(menetapkanApiEndpointLoginUser());
    }
    @Step("saya mengirimkan request untuk melakukan login dengan mengosongkan email dan password")
    public void mengirimkanRequestDenganMengosongkanEmailDanPassword(){
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(menetapkanApiEndpointLoginUser());
    }
    @Step("saya mengirimkan request untuk melakukan login dengan method GET dan memasukan data valid")
    public void mengirimkanRequestDenganMethodGETDanMemasukanDataValid(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "adminA@ferminacare.com");
        requestBody.put("password", "admin123");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .get(menetapkanApiEndpointLoginUser());
    }
    @Step("saya mengirimkan request untuk melakukan login dengan method PUT dan memasukan data valid")
    public void mengirimkanRequestDenganMethodPUTDanMemasukanDataValid(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "adminA@ferminacare.com");
        requestBody.put("password", "admin123");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .put(menetapkanApiEndpointLoginUser());
    }
    @Step("saya mengirimkan request untuk melakukan login dengan method DELETE dan memasukan data valid")
    public void mengirimkanRequestDenganMethodDeleteDanMemasukanDataValid(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "adminA@ferminacare.com");
        requestBody.put("password", "admin123");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .delete(menetapkanApiEndpointLoginUser());
    }
    @Step("saya menetapkan API endpoint yang salah untuk login superadmin")
    public String menetapkanApiEndpointYangSalahUntukLoginUser(){
        return url + "/Auth";
    }
    @Step("saya mengirimkan request untuk melakukan login ke endpoint yang salah dengan memasukan email dan password valid")
    public void mengirimkanRequestDenganEndpointSalahDanMemasukanEmailDanPasswordValid(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "adminA@ferminacare.com");
        requestBody.put("password", "admin123");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(menetapkanApiEndpointYangSalahUntukLoginUser());
    }
}
