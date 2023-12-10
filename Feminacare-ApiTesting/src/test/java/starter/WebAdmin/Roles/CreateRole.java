package starter.WebAdmin.Roles;
import static org.hamcrest.Matchers.notNullValue;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateRole {
    private String url = "https://api-ferminacare.tech/api/v1";
    @Step("saya menetapkan Api endpoint untuk membuat role baru")
    public String menetapkanApiEndpointUntukMembuatRoleBaru(){
        return url +"/roles";
    }

    @Step("saya mengirimkan request untuk membuat role baru dengan menyisipkan data dan token")
    public void mengirimkanRequestUntukMembuatRoleBaruDenganMenyisipkanDataDanToken(){
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        requestBody.put("name", "konselor baru");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post(menetapkanApiEndpointUntukMembuatRoleBaru());
    }

    @Step("saya menerima data role yang berhasil ditambahkan")
    public void sayaMenerimaDataRoleYangBerhasilDitambahkan() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.DATA_BARU_ROLE_SCHEMA);
        restAssuredThat(response -> response.body("data.name", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("saya mengirimkan request untuk membuat role baru dengan mengosongkan data role")
    public void mengirimkanRequestUntukMembuatRoleBaruDenganMengosongkanDataRole(){
        String token = GenerateToken.generateTokenAdmin();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .post(menetapkanApiEndpointUntukMembuatRoleBaru());
    }

    @Step("saya menetapkan Api endpoint yang salah untuk membuat role baru")
    public String menetapkanApiEndpointYangSalahUntukMembuatRoleBaru(){
        return url + "/Roles";
    }
    @Step("saya mengirimkan request untuk membuat role baru dengan menggunakan Api endpoint yang salah")
    public void mengirmkanRequestUntukMembuatRoleBaruDenganMenggunakanAPiEndpointYangSalah(){
        String token = GenerateToken.generateTokenAdmin();
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Konselor");
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .get(menetapkanApiEndpointYangSalahUntukMembuatRoleBaru());
    }

    @Step("saya mengirimkan request untuk membuat role baru dengan method GET")
    public void mengirimkanRequestUntukMembuatRoleBaruDenganMethodGet(){
        String token = GenerateToken.generateTokenAdmin();
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Konselor");
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .get(menetapkanApiEndpointUntukMembuatRoleBaru());
    }
    @Step("saya mengirimkan request untuk membuat role baru dengan method PUT")
    public void mengirimkanRequestUntukMembuatRoleBaruDenganMethodPut(){
        String token = GenerateToken.generateTokenAdmin();
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Konselor");
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .put(menetapkanApiEndpointUntukMembuatRoleBaru());
    }
    @Step("saya mengirimkan request untuk membuat role baru dengan method DELETE")
    public void mengirimkanRequestUntukMembuatRoleBaruDenganMethodDelete(){
        String token = GenerateToken.generateTokenAdmin();
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Konselor");
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .delete(menetapkanApiEndpointUntukMembuatRoleBaru());
    }

    @Step("saya mengirimkan request untuk membuat role baru tanpa menyisipkan dan token")
    public void sayaMengirimkanRequestUntukMembuatRoleBaruTanpaMenyisipkanDanToken() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Konselor");
        SerenityRest.given()
                .header("Content-Type","application")
                .post(menetapkanApiEndpointUntukMembuatRoleBaru());
    }
}
