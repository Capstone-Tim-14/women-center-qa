package starter.WebAdmin;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Superadmin_Auth {
    private static String url = "https://api-ferminacare.tech/api/v1/admin";

    @Step("saya menetapkan API endpoint untuk login superadmin")
    public String menetapkanApiEndpointLoginSuperadmin(){
        return url + "/auth";
    }
    @Step("saya mengirimkan request dengan memasukan email dan password valid")
    public void mengirimkanRequestDenganMemasukanEmailDanPasswordValid(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "adminA@ferminacare.com");
        requestBody.put("password", "admin123");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(menetapkanApiEndpointLoginSuperadmin());
    }
    @Step("saya mendapatkan status kode 200")
    public void mendapatkanStatusKode200(){
        restAssuredThat(response->response.statusCode(200));
    }
    @Step("saya mendapatkan data dan token")
    public void mendapatkanDataDanToken(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.LOGIN);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
    @Step("saya mengirimkan request dengan memasukan email dan password invalid")
    public void mengirimkanRequestDenganMemasukanEmailDanPasswordInvalid(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "BukanadminA@ferminacare.com");
        requestBody.put("password", "Bukanadmin123");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(menetapkanApiEndpointLoginSuperadmin());
    }
    @Step("saya mendapatkan pesan error data tidak valid")
    public void mendapatkanPesanErrorDataTidakValid(){
        restAssuredThat(response->response.body("code",equalTo(401)));
        restAssuredThat(response->response.body("message",equalTo("Error uncorrect credential")));
    }
    @Step("saya mengirimkan request dengan memasukan email valid namun password invalid")
    public void mengirimkanRequestDenganMemasukanEmailValidNamunPasswordInvalid(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "adminA@ferminacare.com");
        requestBody.put("password", "bukanadmin123");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(menetapkanApiEndpointLoginSuperadmin());
    }
    @Step("saya mengirimkan request dengan memasukan email namun mengosongkan password")
    public void mengirimkanRequestDenganMemasukanEmailNamunMengosongkanPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "adminA@ferminacare.com");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(menetapkanApiEndpointLoginSuperadmin());
    }
    @Step("saya mengirimkan request dengan mengosongkan email dan password")
    public void mengirimkanRequestDenganMengosongkanEmailDanPassword(){
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(menetapkanApiEndpointLoginSuperadmin());
    }
    @Step("saya mengirimkan request dengan method GET dan memasukan data valid")
    public void mengirimkanRequestDenganMethodGETDanMemasukanDataValid(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "adminA@ferminacare.com");
        requestBody.put("password", "admin123");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .get(menetapkanApiEndpointLoginSuperadmin());
    }
    @Step("saya mengirimkan request dengan method PUT dan memasukan data valid")
    public void mengirimkanRequestDenganMethodPUTDanMemasukanDataValid(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "adminA@ferminacare.com");
        requestBody.put("password", "admin123");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .put(menetapkanApiEndpointLoginSuperadmin());
    }
    @Step("saya mengirimkan request dengan method DELETE dan memasukan data valid")
    public void mengirimkanRequestDenganMethodDeleteDanMemasukanDataValid(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "adminA@ferminacare.com");
        requestBody.put("password", "admin123");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .delete(menetapkanApiEndpointLoginSuperadmin());
    }
    @Step("saya menetapkan API endpoint yang salah untuk login superadmin")
    public String menetapkanApiEndpointYangSalahUntukLoginSuperadmin(){
        return url + "/Auth";
    }
    @Step("saya mengirimkan request ke endpoint yang salah dengan memasukan email dan password valid")
    public void mengirimkanRequestDenganEndpointSalahDanMemasukanEmailDanPasswordValid(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "adminA@ferminacare.com");
        requestBody.put("password", "admin123");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(menetapkanApiEndpointYangSalahUntukLoginSuperadmin());
    }
}
